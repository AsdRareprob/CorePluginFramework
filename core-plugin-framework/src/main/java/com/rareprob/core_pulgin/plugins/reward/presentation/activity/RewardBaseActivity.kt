package com.rareprob.core_pulgin.plugins.reward.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog

abstract class RewardBaseActivity : AppCompatActivity() {

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

}