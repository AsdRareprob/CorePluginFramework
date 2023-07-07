package com.rareprob.core_pulgin.plugins.reward.data.local

import androidx.room.*
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity

@Dao
interface RewardDao  {
    @Query("SELECT * FROM RewardEntity ORDER BY sortSequence ASC")
    fun getRewards(): List<RewardEntity>

    @Query("SELECT * FROM RewardEntity ORDER BY taskCompletionTime DESC")
    fun getSortedRewardTasks(): List<RewardEntity>

    @Query("SELECT * FROM RewardEntity where rewardType = :rewardType LIMIT 1")
     fun getReward(rewardType: String): RewardEntity

    @Query("SELECT * FROM RewardEntity where taskCompletionStatus = :taskCompletionStatus")
    fun getCompletedRewardTask(taskCompletionStatus: Boolean = true): List<RewardEntity>

    @Query("SELECT * FROM RewardEntity ORDER BY taskCompletionStatus DESC")
    fun getSortedRewardTaskByCompletionStatus(): List<RewardEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     fun insertAll(rewards: List<RewardEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertOrUpdate(rewards: RewardEntity)

    @Delete
    fun delete(obj: RewardEntity)

    @Query("DELETE FROM RewardEntity")
    fun deleteAll()
}