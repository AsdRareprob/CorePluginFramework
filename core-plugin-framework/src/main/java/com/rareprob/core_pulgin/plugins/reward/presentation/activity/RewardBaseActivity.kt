package com.rareprob.core_pulgin.plugins.reward.presentation.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardPreferenceManager
import com.rareprob.core_pulgin.plugins.reward.data.repository.RewardRepositoryImpl
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
open class RewardBaseActivity() : AppCompatActivity() {
    @Inject
    lateinit var repository: RewardRepository






    protected fun persistWatchVideoTaskProgressData(

        watchStartTime: Long = System.currentTimeMillis()
    ) {
        val endTime = System.currentTimeMillis()
        val watchedDuration: Long = endTime - watchStartTime
        repository.saveTaskProgressData(
            this,
            RewardUtils.RewardTaskType.WATCH_VIDEO,
            watchedDuration
        )
    }

}