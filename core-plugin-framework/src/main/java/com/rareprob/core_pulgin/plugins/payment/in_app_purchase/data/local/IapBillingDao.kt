package com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.local

import androidx.room.*
import com.rareprob.core_pulgin.core.base.BaseDao
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.local.entity.InAppPurchaseEntity

@Dao
interface IapBillingDao : BaseDao<InAppPurchaseEntity> {
    @Query("SELECT * FROM InAppPurchaseEntity where appId = :appId")
    suspend fun getInAppPurchases(appId: String): List<InAppPurchaseEntity>

    @Query("SELECT * FROM InAppPurchaseEntity where appId = :appId and productId = :productId")
    suspend fun getInAppPurchaseById(
        appId: String, productId: String
    ): InAppPurchaseEntity

    @Query("SELECT * FROM InAppPurchaseEntity where appId = :appId " +
            "and active = :isActive and isPurchased = :isPurchased")
    suspend fun isPremiumUser(
        appId: String, isActive: String = "true", isPurchased: Boolean = true
    ): List<InAppPurchaseEntity>


}