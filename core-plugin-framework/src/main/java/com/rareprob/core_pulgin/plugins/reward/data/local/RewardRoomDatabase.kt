package com.rareprob.core_pulgin.plugins.reward.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity


@Database(entities = [RewardEntity::class], version = 1, exportSchema = false)
public abstract class RewardRoomDatabase : RoomDatabase() {

    abstract fun rewardDao(): RewardDao

    companion object {
        @Volatile
        private var INSTANCE: RewardRoomDatabase? = null

        fun getDatabase(context: Context): RewardRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RewardRoomDatabase::class.java,
                    "reward_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}