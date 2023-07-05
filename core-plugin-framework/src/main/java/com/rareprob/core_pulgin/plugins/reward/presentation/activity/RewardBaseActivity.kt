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
    private lateinit var coinCollectDialog: CoinCollectDialog

    fun showCoinCollectDialog() {
        if (!this::coinCollectDialog.isInitialized) {
            coinCollectDialog = CoinCollectDialog(this, ::onSetResult)
        }
        coinCollectDialog.show()
    }

    private fun onSetResult() {
    }

    protected fun persistWatchVideoTaskProgressData(
        context: Context,
        watchStartTime: Long = System.currentTimeMillis()
    ) {
        val endTime = System.currentTimeMillis()
        val watchedDuration: Long = endTime - watchStartTime
        repository.saveTaskProgressData(
            context,
            RewardUtils.RewardTaskType.WATCH_VIDEO,
            watchedDuration
        )
    }

}