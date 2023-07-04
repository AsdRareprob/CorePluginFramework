package com.rareprob.core_pulgin.plugins.reward.domain.use_case

import android.content.Context
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository
import kotlinx.coroutines.flow.Flow

class RewardUseCase(
     val repository: RewardRepository
//    private val repository: ReferralRepositoryImpl = ReferralRepositoryImpl()
) {

     fun getData(rckey: String,context: Context?): Flow<Resource<List<ReferralData>>> {
//        if(rckey.isBlank()) {
//            return flow {  }
//        }
        return repository.getRewardItems(rckey,context)
    }

    fun claimRewardCoins(context: Context, rewardData: RewardEntity) {
//        if(rckey.isBlank()) {
//            return flow {  }
//        }
        return repository.claimRewardCoins(context,rewardData)
    }

    fun onRedeemRewardCoins(
        context: Context,
        redeemedCoin: Long,
    ) {
        return repository.onRedeemRewardCoins(context,redeemedCoin)
    }


}