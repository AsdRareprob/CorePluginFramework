package com.rareprob.core_pulgin.plugins.reward.data.local

import android.content.Context
import android.widget.TextView
import com.google.firebase.FirebaseApp
import com.rareprob.core_pulgin.core.utils.AppPreferencesUtils
import com.rareprob.core_pulgin.plugins.reward.data.repository.RewardRepositoryImpl
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils


class RewardPreferenceManager {
    /**
     * Get total earned coins by a user
     */
    fun getSavedCoins(context: Context): Long =
        AppPreferencesUtils.getLong(
            RewardUtils.RewardConstant.TOTAL_EARNED_COINS_PREFS_KEY,
            context
        )

    fun setEarnedCoinsToView(context: Context, rewardTextView: TextView) {
        var totalEarnedCoins = getSavedCoins(context)
        if (totalEarnedCoins > 0)
            rewardTextView.text = totalEarnedCoins.toString()
    }

    fun saveWatchVideoTaskProgressData(
        context: Context,
        watchStartTime: Long = System.currentTimeMillis()
    ) {

    }


    /**
     * Persist total earned coins by a user
     */
    fun saveCoins(context: Context, updatedTotalCoins: Long) =
        AppPreferencesUtils.putLong(
            RewardUtils.RewardConstant.TOTAL_EARNED_COINS_PREFS_KEY,
            updatedTotalCoins,
            context
        )
}