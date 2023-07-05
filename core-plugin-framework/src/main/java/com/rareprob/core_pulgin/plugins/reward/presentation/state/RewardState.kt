package com.rareprob.core_pulgin.plugins.reward.presentation.state

import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData


data class RewardState(
    val referralItems: List<RewardData> = emptyList(),
    val isLoading: Boolean = false
)
