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
    private lateinit var rewardExchangeDialog: RewardExchangeDialog
    private lateinit var rewardExchangeFailDialog: RewardExchangeFailDialog

     fun showCoinCollectDialog() {
        if (!this::coinCollectDialog.isInitialized) {
            coinCollectDialog = CoinCollectDialog(this, ::onSetResult)
        }
        coinCollectDialog.show()
    }


     fun showRewardExchangeDialog(currentThemeCoinCount:Long,
                                  totalEarnedCoins:Long,redeemSuccessCallback: () -> Unit,redeemFailureCallback: () -> Unit) {
        if (!this::rewardExchangeDialog.isInitialized) {
            rewardExchangeDialog = RewardExchangeDialog(currentThemeCoinCount,totalEarnedCoins,this, redeemSuccessCallback,redeemFailureCallback)
        }
        rewardExchangeDialog.show()
    }

     fun showRewardExchangeFailDialog(unlockForFreeCallback: () -> Unit) {
        if (!this::rewardExchangeFailDialog.isInitialized) {
            rewardExchangeFailDialog = RewardExchangeFailDialog(this, unlockForFreeCallback)
        }
        rewardExchangeFailDialog.show()
    }

    private fun onSetResult() {
    }

     protected fun persistWatchVideoTaskProgressData(context: Context,
                                                   watchStartTime: Long = System.currentTimeMillis()) {

         val endTime = System.currentTimeMillis()
         val watchedDuration: Long = endTime - watchStartTime

         //TODO uncomment this line

         repository. saveTaskProgressData(
             context,
             RewardUtils.RewardTaskType.WATCH_VIDEO,
             watchedDuration
         )

     }

}