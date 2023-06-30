package com.rareprob.core_pulgin.plugins.reward.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem

@Entity
data class RewardEntity(

    var taskId: Long = 0L,
    var title: String = "",
    var actionButtonCaption: String = "",
    var ctaBgColor: String = "",
    /**
     * rewardCoins (It is total reward coins assigned a particular task)
     */
    var rewardCoins: Long = 0,
    var rewardIcon: String = "",
    var taskIcon: String = "",
    var taskIconBgColor: String = "",
    var launchTargetScreenAction: String = "",
    var sortSequence: Int = 0,
    var durationOrFileCount: Long = 0,//It can contain time duration in minute or file count
    /**
     * Once User clicks on claim button ,
     * We mark this task as claimed for the day
     */
    var isRewardClaimed: Boolean = false,

    /**
     * For example WATCH_VIDEO ,FILE_HIDER etc.
     */
    @PrimaryKey
    var rewardType: String = "",


    /**
     * Reward count (It is total earned coins by user for a particular task)
     */
    var earnedCoins: Long = 0L,


    /**
     * Has user completed particular Daily task
     */
    var taskCompletionStatus: Boolean = false,


    /**
     * It is time duration of a particular task
     * (For e.g.
     *  Watch the online video for 15 minutes
     * or
     * Apply the online lyrics feature on 3 music files
     * )
     */
    var taskDurationOrFileCount: Long = 0L,

    /**
     * Date on which tasks were assigned to user
     * (i.e The Date on which the user was displayed referral tasks list)
     */
    var taskAssignedDate: Long = 0L,

    /**
     * It contains watch duration in minutes or file operated count
     * (How many files you have made hide or how long you have watched video for
     */
    var watchedDurationOrFilesOperatedCount: Long = 0,

    /**
     * On the basis of taskCompletionTime, we will sort the list
     * UseCase -> Once user completes task, This particular task should come at top of list
     */
    var taskCompletionTime: Long = 0L
) {
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
            taskType = rewardType,
            taskCompletionStatus = taskCompletionStatus,
            isRewardClaimed = isRewardClaimed,
            taskAssignedDate = taskAssignedDate,
            taskCompletionTime = taskCompletionTime

        )
    }
}
