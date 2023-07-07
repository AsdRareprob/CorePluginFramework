package com.rareprob.core_pulgin.plugins.reward.data.repository

import android.app.Activity
import android.content.Context
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.core.utils.AppPreferencesUtils
import com.rareprob.core_pulgin.core.utils.FirebaseRemoteConfigUtils
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils
import com.rareprob.core_pulgin.plugins.reward.data.RewardParser
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardPreferenceManager
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.util.concurrent.TimeUnit

class RewardRepositoryImpl(
    private val remoteConfigInstance: FirebaseRemoteConfig,
    private val rewardDao: RewardDao,
) : RewardRepository {


    /**
     * Fetch data from Rc
     */
    override fun getRewardItems(
        context: Context?
    ): Flow<Resource<List<RewardData>>> = flow {
        emit(Resource.Loading())
        var rcJson =  FirebaseRemoteConfigUtils.getRcRewardItemsJson(context,remoteConfigInstance)
        if (TextUtils.isEmpty(rcJson)) {
            var defaultLocalJson = RewardUtils.getRewardDefaultJson(context)
            rcJson = defaultLocalJson
        }
        var rewardDataList = RewardParser(rewardDao).parseRewardItemsJson(json = rcJson, context)
        emit(Resource.Success(rewardDataList))
    }


    override fun getThemesData(
        context: Context?
    ): Flow<Resource<Map<Long, ThemeData>>> = flow {
        emit(Resource.Loading())
        var rcJson = FirebaseRemoteConfigUtils.getRcThemesDataJson(context,remoteConfigInstance)
        if (TextUtils.isEmpty(rcJson)) {
            var defaultLocalJson = RewardUtils.getDefaultJson(context,"DefaultRewardThemeVideoPlayerJsonData")
            rcJson = defaultLocalJson
        }
        var themeDataMap = RewardParser(rewardDao).parseThemesJson(rcJson)
        emit(Resource.Success(themeDataMap))
    }

    override fun saveTaskProgressData(
        context: Context,
        taskType: String,
        watchedDurationOrFileOperatedCount: Long,
        isShowDialog: Boolean

    ) {
        GlobalScope.launch(Dispatchers.IO) {
            AppPreferencesUtils.putString(RewardUtils.NAVIGATION_SOURCE, "", context)
            var rewardData = rewardDao.getReward(taskType)
            if(rewardData != null) {
                rewardData.watchedDurationOrFilesOperatedCount += watchedDurationOrFileOperatedCount

                var isTaskCompleted = getTaskCompletionStatus(rewardData, context)

                if (isTaskCompleted) {
                    rewardData.taskCompletionStatus = true
                    /**
                     * Once a task is completed, we have to show that task in top of list
                     * So Setting completion time as current time.
                     * On the basis of this time we will sort list
                     */
                    rewardData.taskCompletionTime = System.currentTimeMillis()
                    rewardDao.insertOrUpdate(rewardData)

                    withContext(Dispatchers.Main) {
                        try {
                            Toast.makeText(
                                context,
                                "You have earned ${rewardData.rewardCoins} coins",
                                Toast.LENGTH_LONG
                            ).show()

                        }catch (ex : java.lang.Exception){
                        }
                    }
                }
//                val rewardDataUpdated = rewardDao.getRewards()
//                Log.d("rewardDataUpdated", "$rewardDataUpdated")
            }

        }
    }

    /**
     * This function returns whether a task is completed or not
     */
    private fun getTaskCompletionStatus(
        rewardData: RewardEntity,
        context: Context
    ): Boolean {
        var isTaskCompleted = false
        when (rewardData.rewardType) {
            RewardUtils.RewardTaskType.WATCH_VIDEO -> {
                isTaskCompleted = getVideoTaskCompletionStatus(rewardData)
            }
            RewardUtils.RewardTaskType.VIDEO_DOWNLOADER,
            RewardUtils.RewardTaskType.IMAGE_FILE_HIDER,
            RewardUtils.RewardTaskType.VIDEO_FILE_HIDER -> {
                isTaskCompleted = getTaskCompletionStatus(rewardData)
            }
            else -> {

            }
        }

        if (isTaskCompleted) {
            rewardData.earnedCoins += rewardData.rewardCoins
        }
        return isTaskCompleted
    }

    private fun getVideoTaskCompletionStatus(
        rewardData: RewardEntity
    ): Boolean {
        val minutes =
            TimeUnit.MILLISECONDS.toMinutes(rewardData.watchedDurationOrFilesOperatedCount)
        return minutes >= rewardData.taskDurationOrFileCount
    }

    /**
     * This function determines how many files you have operated on
     * e.g image files hidden , video file downloaded
     */
    private fun getTaskCompletionStatus(
        rewardData: RewardEntity
    ) = rewardData.watchedDurationOrFilesOperatedCount >= rewardData.taskDurationOrFileCount

    /** When User clicks on claim button
     * Post earned coins to Firebase real time database only once
     * (when taskCompletionStatus is true and rewardData.syncState is false)
     */
    override fun claimRewardCoins(context: Context, rewardData: RewardEntity) {
        if (isSyncAllowed(rewardData)) {
            var databaseReference =
                FirebaseDatabase.getInstance()
                    .getReference(RewardUtils.RewardConstant.FirebaseTableName)

            val androidId: String = RewardUtils.getAndroidId(context)
            var syncData = getDataToPost(context, androidId)

            databaseReference.keepSynced(true)
            // databaseReference.child("Reward").child(androidId).setValue(syncData)
            databaseReference.child(androidId).setValue(syncData).addOnSuccessListener {
                onSuccessPostData(context, rewardData)
            }
        }
    }

    override fun onRedeemRewardCoins(
        context: Context,
        redeemedCoin: Long,
    ) {
        if (redeemedCoin <= 0)
            return

        val rewardPreferenceManager = RewardPreferenceManager()
        var totalCoins = rewardPreferenceManager.getSavedCoins(context)
        var updatedTotalCoins = totalCoins - redeemedCoin
        rewardPreferenceManager.saveCoins(context, updatedTotalCoins)

        val androidId: String = RewardUtils.getAndroidId(context)
        var databaseReference =
            FirebaseDatabase.getInstance()
                .getReference(RewardUtils.RewardConstant.FirebaseTableName)
        var syncData = getDataToPost(context, androidId)

        databaseReference.child(androidId).setValue(syncData).addOnSuccessListener {
            //We can send callback from here if required
        }
    }

    fun onEarnRewardCoins(
        context: Context,
        redeemedCoin: Long
    ) {
        if (redeemedCoin <= 0)
            return

        val rewardPreferenceManager = RewardPreferenceManager()

        var totalCoins = rewardPreferenceManager.getSavedCoins(context)
        var updatedTotalCoins = totalCoins + redeemedCoin
        rewardPreferenceManager.saveCoins(context, updatedTotalCoins)

        val androidId: String = RewardUtils.getAndroidId(context)
        var databaseReference =
            FirebaseDatabase.getInstance()
                .getReference(RewardUtils.RewardConstant.FirebaseTableName)
        var syncData = getDataToPost(context, androidId)

        databaseReference.child(androidId).setValue(syncData).addOnSuccessListener {
            //We can send callback from here if required
        }

    }

    private fun getDataToPost(context: Context, androidId: String): LinkedHashMap<String, String> {
        var syncData = LinkedHashMap<String, String>()
        syncData[RewardUtils.RewardConstant.FieldEarnedCoins] = "" + AppPreferencesUtils.getLong(
            RewardUtils.RewardConstant.TOTAL_EARNED_COINS_PREFS_KEY,
            context
        )
        syncData[RewardUtils.RewardConstant.FieldUid] = androidId

        return syncData
    }

    /**
     *
     * Mark syncState to true when coins are posted to firebase server
     */
    private fun onSuccessPostData(context: Context, rewardData: RewardEntity) {
        CoroutineScope(Dispatchers.IO).launch {
            var rewardData = rewardDao.getReward(rewardData.rewardType)
            if (rewardData != null) {
                rewardData.isRewardClaimed = true
                rewardDao.insertOrUpdate(rewardData)
                var rewardDataUpdated = rewardDao.getRewards()
                Log.d("rewardDataUpdated", "$rewardDataUpdated")

                val rewardPreferenceManager = RewardPreferenceManager()
                var totalCoins = rewardPreferenceManager.getSavedCoins(context)
                var updatedTotalCoins = totalCoins + rewardData.earnedCoins
                rewardPreferenceManager.saveCoins(context, updatedTotalCoins)
            }
        }
    }

    /**
     * Condition when sync will happen
     * (When User earns coins we attempt to sync coins to firebase server)
     */
    private fun isSyncAllowed(rewardData: RewardEntity): Boolean {
        if (rewardData.taskCompletionStatus)
            return true
        return false

    }
}