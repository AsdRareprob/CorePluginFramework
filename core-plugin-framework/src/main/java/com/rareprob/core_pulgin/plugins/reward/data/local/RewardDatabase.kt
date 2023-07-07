package com.rareprob.core_pulgin.plugins.reward.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity


@Database(entities = [RewardEntity::class], version = 1, exportSchema = false)
abstract class RewardDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "reward_db"

            @Volatile
            private var INSTANCE: RewardDatabase? = null

            fun getDatabase(context: Context): RewardDatabase {
                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        RewardDatabase::class.java,
                        "reward_db"
                    ).build()
                    INSTANCE = instance
                    // return instance
                    instance
                }
            }

    }

    abstract val rewardDao: RewardDao


}