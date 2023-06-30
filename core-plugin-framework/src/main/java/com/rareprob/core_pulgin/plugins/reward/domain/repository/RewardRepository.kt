package com.rareprob.core_pulgin.plugins.reward.domain.repository

import android.content.Context
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData
import kotlinx.coroutines.flow.Flow

interface RewardRepository {
    fun getReferralItems(rckey: String,context: Context?): Flow<Resource<List<ReferralData>>>

    fun getThemesData(rckey: String,context: Context?): Flow<Resource<Map<Long, ThemeData>>>

}