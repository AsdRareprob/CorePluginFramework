package com.rareprob.core_pulgin.plugins.reward.data.remote.dto

import androidx.annotation.Keep

@Keep
data class ReferralDataDto(
    val rewardName: String = "",
    val rewardItems: List<RewardItemDto> = emptyList()

)
//{
//    fun toReferralData(): ReferralData {
//        return ReferralData(
//            id = rewardItem.id,
//        )
//    }
//}