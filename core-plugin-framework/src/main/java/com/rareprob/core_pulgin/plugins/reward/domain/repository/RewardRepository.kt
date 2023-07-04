package com.rareprob.core_pulgin.plugins.reward.domain.repository

import android.content.Context
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData
import kotlinx.coroutines.flow.Flow

interface RewardRepository {
    fun getRewardItems(rckey: String, context: Context?): Flow<Resource<List<ReferralData>>>

    fun getThemesData(rckey: String, context: Context?): Flow<Resource<Map<Long, ThemeData>>>

    fun claimRewardCoins(context: Context, rewardData: RewardEntity)

    fun onRedeemRewardCoins(
        context: Context,
        redeemedCoin: Long,
    )

    fun saveTaskProgressData(
        context: Context,
        taskType: String,
        watchedDurationOrFileOperatedCount: Long
    )

}