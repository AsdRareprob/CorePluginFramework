package com.rareprob.core_pulgin.plugins.reward.domain.model

import androidx.annotation.Keep

@Keep
data class ThemeData(
    val tag: Long = 0L,
    val rewardCoins: Long = 0L,
) {
}