package com.rareprob.core_pulgin.plugins.reward.domain.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class FirebaseRewardData(
    var uid: String = "",
    var  earnedCoins: String = ""

)
//{
//
//    @Exclude
//    fun toMap(): Map<String, Any?> {
//        return mapOf(
//            "uid" to uid,
//            "earnedCoins" to earnedCoins
//        )
//    }
//}