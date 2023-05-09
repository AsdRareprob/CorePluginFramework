package com.rareprob.core_pulgin.core.notification.data.local.entity

import androidx.room.*
import com.rareprob.core_pulgin.core.base.BaseDao
import com.rareprob.core_pulgin.payment.in_app_purchase.data.local.entity.InAppPurchaseEntity

@Dao
interface NotificationDao : BaseDao<PushNotificationEntity> {
    @Query("SELECT * FROM PushNotificationEntity")
    suspend fun getNotifications(): List<PushNotificationEntity>



}