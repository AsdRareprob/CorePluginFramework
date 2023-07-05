package com.rareprob.core_pulgin.plugins.reward.data.repository

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
import com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardBaseActivity
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.util.concurrent.TimeUnit

class RewardRepositoryImpl(
    private val remoteConfigInstance: FirebaseRemoteConfig,
    private val rewardDao: RewardDao,
) : RewardRepository {


    /**
     * Fetch data from Rc // TODO KP remove this hardcoded json in Prod build
     */
    override fun getRewardItems(
        context: Context?
    ): Flow<Resource<List<RewardData>>> = flow {
        emit(Resource.Loading())

        var rcJson = FirebaseRemoteConfigUtils.getRcRewardItemsJson(remoteConfigInstance)

        if(TextUtils.isEmpty(rcJson)) {

            var defaultLocalJson = """
            {
              "rewardName": "Daily Task",
              "data": [
                {
                  "id": 1,
                  "taskIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "taskIconBgColor": "#FFA8A8",
                  "title": "Watch the online video for 15 minutes",
                  "actionButtonCaption": "Go",
                  "ctaBgColor": "#FD5B7C",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 100,
                   "sort_order": 1,
                   "duration_or_file_count" : 0,
                   "launchTargetScreenAction":  "",
                   "task_type" : "WATCH_VIDEO"
                },
                {
                  "id": 2,
                  "taskIcon": "https://fastly.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI",
                  "taskIconBgColor": "#BEE884",
                  "title": "Hide an image ",
                  "actionButtonCaption": "Go",
                  "ctaBgColor": "#FD5B7C",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 100,
                   "sort_order": 2,
                  "duration_or_file_count" : 1,
                   "launchTargetScreenAction":  "",
                    "task_type" : "IMAGE_FILE_HIDER"
                },
                  {
                  "id": 3,
                  "taskIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "taskIconBgColor": "#BEE884",
                  "title": "Hide your private video",
                  "actionButtonCaption": "Go",
                  "ctaBgColor": "#FD5B7C",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 100,
                   "sort_order": 3,
                   "duration_or_file_count" : 1,
                   "launchTargetScreenAction":  "",
                   "task_type" : "VIDEO_FILE_HIDER"
                },
                    {
                  "id": 4,
                  "taskIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "taskIconBgColor": "#97EDF8",
                  "title": "Download a file from a built-in downloader",
                  "actionButtonCaption": "Go",
                  "ctaBgColor": "#FD5B7C",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 100,
                   "sort_order": 4,
                   "duration_or_file_count" : 1,
                   "launchTargetScreenAction":  "",
                   "task_type" : "VIDEO_DOWNLOADER"
                }
              ]
            }
        """.trimIndent()

            rcJson = defaultLocalJson
        }
        var rewardDataList = RewardParser(rewardDao).parseRewardItemsJson(json = rcJson, context)

        emit(Resource.Success(rewardDataList))
    }


    override fun getThemesData(
        rckey: String,
        context: Context?
    ): Flow<Resource<Map<Long, ThemeData>>> = flow {
        emit(Resource.Loading())

        var rcJson = FirebaseRemoteConfigUtils.getRcThemesDataJson(remoteConfigInstance)
        if(TextUtils.isEmpty(rcJson)) {
            var defaultLocalJson = """
            {
              "data": [
                {
                  "tag": 0,
                  "rewardCoins": 500
                },
                {
                  "tag": 1,
                   "rewardCoins": 500
                },
                {
                "tag": 2,
                  "rewardCoins": 500
                },
                {
                  "tag": 3,
                  "rewardCoins": 500
                },
                {
                  "tag": 4,
                  "rewardCoins": 500
                },
                {
                  "tag": 5,
                  "rewardCoins": 500
                },
                {
                  "tag": 6,
                  "rewardCoins": 500
                },
                {
                  "tag": 7,
                  "rewardCoins": 500
                },
                {
                  "tag": 7,
                  "rewardCoins": 500
                },
                {
                  "tag": 9,
                  "rewardCoins": 500
                },
                {
                  "tag": 10,
                  "rewardCoins": 500
                },
                 {
                  "tag": 11,
                  "rewardCoins": 500
                }
                ,
                 {
                  "tag": 12,
                  "rewardCoins": 500
                }
                ,
                 {
                  "tag": 13,
                  "rewardCoins": 1500
                }
                ,
                 {
                  "tag": 14,
                  "rewardCoins": 2500
                }
              ]
            }
        """.trimIndent()

            rcJson = defaultLocalJson
        }
        var themeDataMap = RewardParser(rewardDao).parseThemesJson(rcJson)
        emit(Resource.Success(themeDataMap))
    }

    override fun saveTaskProgressData(
        context: Context,
        taskType: String,
        watchedDurationOrFileOperatedCount: Long
    ) {
        GlobalScope.launch(Dispatchers.IO) {
            var rewardData = rewardDao.getReward(taskType)
            rewardData.let {
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

                    var displayMsg = "You have earned \n  ${rewardData.rewardCoins} coins"
                    AppPreferencesUtils.putString("Video_REWARD_Task_COMPLETION_STATUS",displayMsg,context)
                    withContext(Dispatchers.Main) {
//                        showCoinCollectDialog(displayMsg,context) //TODO KP
                        Toast.makeText(
                            context,
                            "You got ${rewardData.earnedCoins} coins",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
                //TODO : Do this operation on UI Thread
                rewardDao.insertOrUpdate(rewardData)
                val rewardDataUpdated = rewardDao.getRewards()
                Log.d("rewardDataUpdated", "$rewardDataUpdated")
            }

        }
    }

//    private lateinit var coinCollectDialog: CoinCollectDialog
//
//    fun showCoinCollectDialog(displayMsg:String, context: Context) {
//        if (!this::coinCollectDialog.isInitialized) {
//            coinCollectDialog = CoinCollectDialog(context, ::onSetResult,displayMsg)
//        }
//        coinCollectDialog.show()
//    }

//    private fun onSetResult() {
//    }


    private fun getTaskCompletionStatus(
        rewardData: RewardEntity,
        context: Context
    ): Boolean {
        var isTaskCompleted = false
        when (rewardData.rewardType) {
            RewardUtils.RewardTaskType.WATCH_VIDEO -> {
                isTaskCompleted = getVideoTaskCompletionStatus(rewardData)
            }
            //  Handle other cases here //TODO KP
            else -> {

            }
        }

        if (isTaskCompleted) {
            rewardData.earnedCoins += rewardData.rewardCoins
//        var totalCoins = RewardUtils.getSavedCoins(context)
//        var updatedTotalCoins = totalCoins + rewardData.earnedCoins
//        RewardUtils.saveCoins(context, updatedTotalCoins)
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
//}


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

//                withContext(Dispatchers.Main) {
//                    Toast.makeText(
//                        context,
//                        "Coins Claimed",
//                        Toast.LENGTH_LONG
//                    ).show()
//                }
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