package com.rareprob.core_pulgin.plugins.reward.domain.use_case

import android.content.Context
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository
import kotlinx.coroutines.flow.Flow

class ThemeUseCase(
    private val repository: RewardRepository
) {

     fun getData(context: Context?): Flow<Resource<Map<Long, ThemeData>>> {
//        if(rckey.isBlank()) {
//            return flow {  }
//        }
        return repository.getThemesData(context)
    }
}