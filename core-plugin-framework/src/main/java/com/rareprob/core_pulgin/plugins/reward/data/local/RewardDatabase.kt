package com.rareprob.core_pulgin.plugins.reward.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity


@Database(entities = [RewardEntity::class], version = 1, exportSchema = false)
abstract class RewardDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "reward_db"
    }

    abstract val rewardDao: RewardDao
}