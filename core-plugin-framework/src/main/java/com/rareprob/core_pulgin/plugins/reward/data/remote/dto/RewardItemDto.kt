package com.rareprob.core_pulgin.plugins.reward.data.remote.dto

import androidx.annotation.Keep
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.core.base.data.AppData
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem

@Keep
data class RewardItemDto(
    val taskId: Long = 0L,
    val title: String = "",
    val actionButtonCaption: String = "",
    val ctaBgColor: String = "",
    val rewardCoins: Long = 0,
    val rewardIcon: String = "",
    val taskIcon: String = "",
    val taskIconBgColor: String = "",
    var launchTargetScreenAction: String = "",
    var sortSequence: Int = 0,
    val durationOrFileCount: Long = 0,//It can contain time duration in minute or file count
    val taskType: String = "",
    var taskCompletionStatus: Boolean = false,
    var isRewardClaimed: Boolean = false,
    var taskAssignedDate: Long = 0L,
    var taskCompletionTime : Long = 0L
) : AppData() {

    fun toEntity(): RewardEntity {
        return RewardEntity(
            taskId = taskId,
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
            rewardType = taskType,
            taskDurationOrFileCount = durationOrFileCount,
            taskCompletionStatus = taskCompletionStatus,
            isRewardClaimed = isRewardClaimed,
            taskAssignedDate = taskAssignedDate,
            taskCompletionTime = taskCompletionTime
        )
    }

    fun toRewardItem(): RewardItem {
        return RewardItem(
            taskId = taskId,
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
            taskCompletionStatus = taskCompletionStatus,
            isRewardClaimed = isRewardClaimed,
            taskAssignedDate = taskAssignedDate,
            taskCompletionTime = taskCompletionTime

        )
    }

}