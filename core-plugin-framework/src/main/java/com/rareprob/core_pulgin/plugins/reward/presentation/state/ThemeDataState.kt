package com.rareprob.core_pulgin.plugins.reward.presentation.state

import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData


data class ThemeDataState(
    val themeDataMap: Map<Long, ThemeData> = emptyMap(),
    val isLoading: Boolean = false
)
