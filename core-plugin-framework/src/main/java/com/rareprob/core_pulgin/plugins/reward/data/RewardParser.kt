package com.rareprob.core_pulgin.plugins.reward.data

import android.content.Context
import android.text.TextUtils
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.plugins.reward.data.remote.dto.RewardItemDto
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData
import org.json.JSONArray
import org.json.JSONObject

class RewardParser(private val rewardDao: RewardDao) {

    fun parseRewardItemsJson(json: String = "", context: Context?): List<RewardData> {
        if (TextUtils.isEmpty(json))
            return emptyList()

        val jsonObject = JSONObject(json)
        var rewardName = jsonObject.optString("rewardName")
        val rewardDataList = parseRewardDataList(jsonObject.optJSONArray("data"), context)
        var rewardData = RewardData(rewardName, rewardDataList)

        //TODO Right now we have one item in development json
        var referralDataList = ArrayList<RewardData>()
        referralDataList.add(rewardData)
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
            //If we have some task claim reward
            var completedTaskList = rewardDao.getCompletedRewardTask()
            if (completedTaskList.isEmpty().not()) {
                return rewardDao.getSortedRewardTasks().map { it.toRewardItem() }
            }
            return rewardDao.getRewards().map { it.toRewardItem() }
        }
        return emptyList()
    }

    private fun persistTasksToDb(
        rewardDataList: List<RewardItemDto>,
        context: Context?,
    ) {
        context?.let {
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