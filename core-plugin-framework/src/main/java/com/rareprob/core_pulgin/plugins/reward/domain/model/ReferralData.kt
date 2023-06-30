package com.rareprob.core_pulgin.plugins.reward.domain.model

import androidx.annotation.Keep

@Keep
data class ReferralData(
    val rewardName: String = "",
    val rewardItems: List<RewardItem> = emptyList()

)
//{
//    fun toReferralData(): ReferralData {
//        return ReferralData(
//            id = rewardItem.id,
//        )
//    }
//}