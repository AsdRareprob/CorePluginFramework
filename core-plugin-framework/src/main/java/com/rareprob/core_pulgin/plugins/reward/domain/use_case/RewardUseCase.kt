package com.rareprob.core_pulgin.plugins.reward.domain.use_case

import android.content.Context
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository
import kotlinx.coroutines.flow.Flow

class RewardUseCase(
    private val remoteConfigInstance: FirebaseRemoteConfig,
    private val repository: RewardRepository
//    private val repository: ReferralRepositoryImpl = ReferralRepositoryImpl()
) {

     fun getData(rckey: String,context: Context?): Flow<Resource<List<ReferralData>>> {
//        if(rckey.isBlank()) {
//            return flow {  }
//        }
        return repository.getReferralItems(rckey,context)
    }
}