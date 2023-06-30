package com.rareprob.core_pulgin.plugins.reward.presentation.state

import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData


data class RewardState(
    val referralItems: List<ReferralData> = emptyList(),
    val isLoading: Boolean = false
)
