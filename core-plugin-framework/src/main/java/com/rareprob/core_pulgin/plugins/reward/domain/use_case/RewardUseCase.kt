package com.rareprob.core_pulgin.plugins.reward.domain.use_case

import android.content.Context
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository
import kotlinx.coroutines.flow.Flow

class RewardUseCase(
    val repository: RewardRepository
) {

    fun getData(context: Context?): Flow<Resource<List<RewardData>>> {
        return repository.getRewardItems(context)
    }

    fun claimRewardCoins(context: Context, rewardData: RewardEntity) {
        return repository.claimRewardCoins(context, rewardData)
    }

    fun onRedeemRewardCoins(
        context: Context,
        redeemedCoin: Long,
    ) {
        return repository.onRedeemRewardCoins(context, redeemedCoin)
    }
}