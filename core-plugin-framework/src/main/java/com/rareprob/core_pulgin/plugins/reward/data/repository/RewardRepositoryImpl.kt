package com.rareprob.core_pulgin.plugins.reward.data.repository

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.core.utils.AppPreferencesUtils
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardRoomDatabase
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils
import com.rareprob.core_pulgin.plugins.reward.data.RewardParser
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.util.concurrent.TimeUnit

class RewardRepositoryImpl() : RewardRepository {

    /**
     * Fetch data from Rc // TODO KP remove this hardcoded json in Prod build
     */
    override fun getReferralItems(
        rckey: String,
        context: Context?
    ): Flow<Resource<List<ReferralData>>> = flow {
        emit(Resource.Loading())

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
                  "ctaBgColor": "#08C792",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 50,
                   "sort_order": 2,
                   "duration_or_file_count" : 0,
                   "launchTargetScreenAction":  "",
                   "task_type" : "WATCH_VIDEO"
                },
                {
                  "id": 2,
                  "taskIcon": "https://fastly.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI",
                  "taskIconBgColor": "#FFA8A8",
                  "title": "Play online games for 15 minutes ",
                  "actionButtonCaption": "Go",
                  "ctaBgColor": "#08C792",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 50,
                   "sort_order": 1,
                  "duration_or_file_count" : 0,
                   "launchTargetScreenAction":  "",
                     "task_type" : "PLAY_ONLINE_GAMES"
                },
                {
                  "id": 3,
                  "taskIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "taskIconBgColor": "#6C4CCB",
                  "title": "Use Private Hider for your files",
                  "actionButtonCaption": "Go",
                  "ctaBgColor": "#08C792",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 50,
                   "sort_order": 3,
                   "duration_or_file_count" : 0,
                   "launchTargetScreenAction":  "",
                     "task_type" : "FILE_HIDER"
                },
                {
                  "id": 4,
                  "taskIcon": "https://fastly.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI",
                  "taskIconBgColor": "#FFA8A8",
                  "title": "Download Insta reels with Video downloader",
                  "actionButtonCaption": "Go",
                  "ctaBgColor": "#08C792",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 50,
                   "sort_order": 4,
                   "duration_or_file_count" : 1,
                   "launchTargetScreenAction":  "",
                     "task_type" : "DOWNLOADER"
                },
                {
                  "id": 5,
                  "taskIcon": "https://fastly.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI",
                  "taskIconBgColor": "#19a7db",
                  "title": " Use Filter duplicate",
                  "actionButtonCaption": "Go",
                  "ctaBgColor": "#08C792",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 50,
                   "sort_order": 5,
                   "duration_or_file_count" : 1,
                   "launchTargetScreenAction":  "",
                     "task_type" : "FILTER_DUPLICATE"
                },
                {
                  "id": 6,
                  "taskIcon": "https://fastly.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI",
                  "taskIconBgColor": "#19a7db",
                  "title": "Apply the online lyrics feature on 3 music files",
                  "actionButtonCaption": "Go",
                  "ctaBgColor": "#08C792",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 50,
                   "sort_order": 5,
                   "duration_or_file_count" : 1,
                   "launchTargetScreenAction":  "",
                     "task_type" : "PLAY_MUSIC"
                },
                {
                  "id": 7,
                  "taskIcon": "https://fastly.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI",
                  "taskIconBgColor": "#19a7db",
                  "title": "Crop your photos with any required ratio",
                  "actionButtonCaption": "Go",
                  "ctaBgColor": "#08C792",
                  "rewardIcon": "https://fastly.picsum.photos/id/256/200/200.jpg?hmac=MX3r8Dktr5b26lQqb5JB6sgLnCxSgt1KRm0F1eNDHCk",
                  "reward": 50,
                   "sort_order": 5,
                   "duration_or_file_count" : 2,
                   "launchTargetScreenAction":  "",
                     "task_type" : "LISTEN_MUSIC"
                }
              ]
            }
        """.trimIndent()

        var referralDataList = RewardParser.parseReferralJson(json = defaultLocalJson, context)

        emit(Resource.Success(referralDataList))
    }


    override fun getThemesData(
        rckey: String,
        context: Context?
    ): Flow<Resource<Map<Long, ThemeData>>> = flow {
        emit(Resource.Loading())

        var defaultLocalJson = """
            {
              "data": [
                {
                  "tag": 0,
                  "rewardCoins": 500
                },
                {
                  "tag": 1,
                   "rewardCoins": 600
                },
                {
                "tag": 2,
                  "rewardCoins": 700
                },
                {
                  "tag": 3,
                  "rewardCoins": 800
                },
                {
                  "tag": 4,
                  "rewardCoins": 900
                },
                {
                  "tag": 5,
                  "rewardCoins": 1000
                },
                {
                  "tag": 6,
                  "rewardCoins": 1100
                },
                {
                  "tag": 7,
                  "rewardCoins": 1100
                },
                {
                  "tag": 7,
                  "rewardCoins": 1200
                },
                {
                  "tag": 9,
                  "rewardCoins": 1300
                },
                {
                  "tag": 10,
                  "rewardCoins": 1400
                },
                 {
                  "tag": 11,
                  "rewardCoins": 1500
                }
                ,
                 {
                  "tag": 12,
                  "rewardCoins": 500
                }
                ,
                 {
                  "tag": 13,
                  "rewardCoins": 500
                }
                ,
                 {
                  "tag": 14,
                  "rewardCoins": 500
                }
              ]
            }
        """.trimIndent()

        var themeDataMap = RewardParser.parseThemesJson(defaultLocalJson)
        emit(Resource.Success(themeDataMap))
    }

    fun saveDataToBd(
        context: Context,
        taskType: String,
        watchedDurationOrFileOperatedCount: Long = 0
    ) {
        GlobalScope.launch(Dispatchers.IO) {
            var rewardDao: RewardDao = RewardRoomDatabase.getDatabase(context).rewardDao()
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

                    withContext(Dispatchers.Main) {
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
    fun claimRewardCoins(context: Context, rewardData: RewardEntity) {
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

    fun onRedeemRewardCoins(
        context: Context,
        redeemedCoin: Long,
    ) {
        if (redeemedCoin <= 0)
            return

        var totalCoins = RewardUtils.getSavedCoins(context)
        var updatedTotalCoins = totalCoins - redeemedCoin
        RewardUtils.saveCoins(context, updatedTotalCoins)

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

        var totalCoins = RewardUtils.getSavedCoins(context)
        var updatedTotalCoins = totalCoins + redeemedCoin
        RewardUtils.saveCoins(context, updatedTotalCoins)

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
            var rewardDao: RewardDao = RewardRoomDatabase.getDatabase(context).rewardDao()
            var rewardData = rewardDao.getReward(rewardData.rewardType)
            if (rewardData != null) {
                rewardData.isRewardClaimed = true
                rewardDao.insertOrUpdate(rewardData)
                var rewardDataUpdated = rewardDao.getRewards()
                Log.d("rewardDataUpdated", "$rewardDataUpdated")

                var totalCoins = RewardUtils.getSavedCoins(context)
                var updatedTotalCoins = totalCoins + rewardData.earnedCoins
                RewardUtils.saveCoins(context, updatedTotalCoins)
            }
        }
    }

    /**
     * Condition when sync will happen
     * (When User earns coins we attempt to sync coins to firebase server)
     */
    private fun isSyncAllowed(rewardData: RewardEntity): Boolean {
//    if (rewardData.taskCompletionStatus.not() || rewardData.syncState)
//    if (rewardData.taskCompletionStatus && rewardData.syncState.not())
        if (rewardData.taskCompletionStatus)
            return true
        //if() //TODO KP Apply internet check here
        return false

    }
}