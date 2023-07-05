package com.rareprob.core_pulgin.plugins.reward.domain.model

import androidx.annotation.Keep
import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
@Keep
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