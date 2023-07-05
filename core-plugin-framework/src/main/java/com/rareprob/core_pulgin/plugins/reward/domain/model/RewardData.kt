package com.rareprob.core_pulgin.plugins.reward.domain.model

import androidx.annotation.Keep

@Keep
data class RewardData(
    val rewardName: String = "",
    val rewardItems: List<RewardItem> = emptyList()

)