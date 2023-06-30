package com.rareprob.core_pulgin.plugins.reward.data

import android.content.Context
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardRoomDatabase
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.plugins.reward.data.remote.dto.RewardItemDto
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData
import org.json.JSONArray
import org.json.JSONObject

object RewardParser {

    fun parseReferralJson(json: String = "", context: Context?): List<ReferralData> {
//        if (TextUtils.isEmpty(json))
//            return emptyList()

        val jsonObject = JSONObject(json)
        var rewardName = jsonObject.optString("rewardName")
        val rewardDataList = parseRewardDataList(jsonObject.optJSONArray("data"), context)
        var referralData = ReferralData(rewardName, rewardDataList)

        //TODO Right now we have one item in development json
        var referralDataList = ArrayList<ReferralData>()
        referralDataList.add(referralData)
        return referralDataList
    }

    private fun parseRewardDataList(dataJsonArray: JSONArray, context: Context?): List<RewardItem> {
        var rewardDataList = ArrayList<RewardItemDto>()
        if (dataJsonArray != null && dataJsonArray.length() > 0) {
            for (i in 0 until dataJsonArray.length()) {
                val dataJsonObject = dataJsonArray[i] as JSONObject
                var id = dataJsonObject.optLong("id")
                var taskIcon = dataJsonObject.optString("taskIcon")
                var taskIconBgColor = dataJsonObject.optString("taskIconBgColor")
                var title = dataJsonObject.optString("title")
                var actionButtonCaption = dataJsonObject.optString("actionButtonCaption")
                var ctaBgColor = dataJsonObject.optString("ctaBgColor")
                var rewardIcon = dataJsonObject.optString("rewardIcon")
                var rewardCoins = dataJsonObject.optLong("reward")
                var launchTargetScreenAction = dataJsonObject.optString("launchTargetScreenAction")
                var durationOrFileCount = dataJsonObject.optLong("duration_or_file_count")
                var sortSequence = dataJsonObject.optInt("sort_order")
                var taskType = dataJsonObject.optString("task_type")

                var rewardItem = RewardItemDto(
                    taskId = id,
                    title = title,
                    actionButtonCaption = actionButtonCaption,
                    ctaBgColor = ctaBgColor,
                    rewardCoins = rewardCoins,
                    rewardIcon = rewardIcon,
                    taskIcon = taskIcon,
                    taskIconBgColor = taskIconBgColor,
                    launchTargetScreenAction = launchTargetScreenAction,
                    sortSequence = sortSequence,
                    durationOrFileCount = durationOrFileCount,
                    taskType = taskType,
                    taskAssignedDate = System.currentTimeMillis()
                )
                rewardDataList.add(rewardItem)
            }
        }

        persistTasksToDb(rewardDataList, context)
        var sortedList = getSortedList(context)
        return sortedList
    }

    private fun getSortedList(
        context: Context?
    ): List<RewardItem> {
        context?.let {
            var rewardDao: RewardDao =
                RewardRoomDatabase.getDatabase(context).rewardDao()

            //If we have some task claim reward
            var completedTaskList = rewardDao.getCompletedRewardTask()
            if (completedTaskList.isEmpty().not()) {
                return rewardDao.getSortedRewardTasks().map { it.toRewardItem() }
            }
            return rewardDao.getRewards().map { it.toRewardItem() }
        }
        return emptyList()
    }


    /**
     * This function ensures in db we have tasks for today's only
     * In case of past day task. clear table -> Insert New Tasks
     */
//    private fun persistTasksToDb(
//        rewardDataList: List<RewardItemDto>,
//        context: Context?,
//    ): List<RewardItem> {
//        context?.let {
//            var rewardDao: RewardDao =
//                RewardRoomDatabase.getDatabase(context).rewardDao()
//
//            //TODO KP Enable this line in Production Code
//            // deleteExistingTasksIfExpired(rewardDao)
//            rewardDao.insertAll(rewardDataList.map {
//                it.toEntity()
//            })
//            var rewardDataUpdated = rewardDao.getRewards() ?: emptyList()
//
//            return rewardDataUpdated.map {
//                it.toRewardItem()
//            }
//        }
//        return emptyList()
//    }

    private fun persistTasksToDb(
        rewardDataList: List<RewardItemDto>,
        context: Context?,
    ) {
        context?.let {
            var rewardDao: RewardDao =
                RewardRoomDatabase.getDatabase(context).rewardDao()
            deleteExistingTasksIfExpired(rewardDao)
            rewardDao.insertAll(rewardDataList.map {
                it.toEntity()
            })
        }
    }

    /**
     * Delete Existing Tasks from table in case  task Validity expired
     */
    private fun deleteExistingTasksIfExpired(rewardDao: RewardDao) {
        var dbTasksList = rewardDao.getRewards()
        if (dbTasksList.isNotEmpty()) {
            dbTasksList.forEach { taskDataDb ->
                if (getTaskValidityStatus(taskDataDb)) {
                    rewardDao.delete(taskDataDb)
                }
            }
        }
//        var rewardDataUpdated = rewardDao.getRewards() ?: emptyList()
//        Log.d("rewardDataUpdated", "" + rewardDataUpdated)
    }

    /**
     * once Task is claimed ,Reactivate this task to attempt again
     */
    private fun getTaskValidityStatus(dbTask: RewardEntity): Boolean {
        return dbTask.isRewardClaimed
    }

    fun parseThemesJson(json: String = ""): Map<Long, ThemeData> {
        if(json.isNullOrEmpty())
            return emptyMap()

        var themeDataMap = HashMap<Long, ThemeData>()
        val jsonObject = JSONObject(json)
        var dataJsonArray = jsonObject.optJSONArray("data")

        if (dataJsonArray != null && dataJsonArray.length() > 0) {
            for (i in 0 until dataJsonArray.length()) {
                val dataJsonObject = dataJsonArray[i] as JSONObject
                var tag = dataJsonObject.optLong("tag")
                var rewardCoins = dataJsonObject.optLong("rewardCoins")

                var themeItem = ThemeData(
                    tag = tag,
                    rewardCoins = rewardCoins,
                )
                themeDataMap[tag] = themeItem
            }
        }
        return themeDataMap
    }

}