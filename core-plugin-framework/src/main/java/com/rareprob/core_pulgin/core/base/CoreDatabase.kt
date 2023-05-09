package com.rareprob.core_pulgin.core.base

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rareprob.core_pulgin.core.notification.data.local.entity.NotificationDao
import com.rareprob.core_pulgin.core.notification.data.local.entity.PushNotificationEntity
import com.rareprob.core_pulgin.payment.in_app_purchase.data.local.IapBillingDao
import com.rareprob.core_pulgin.payment.in_app_purchase.data.local.entity.InAppPurchaseEntity

@Database(
    entities = [InAppPurchaseEntity::class,
        PushNotificationEntity::class],
    version = 1
)
//@TypeConverters(Converters::class)
abstract class CoreDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "core_db"
    }

    abstract val inAppPurchaseDao: IapBillingDao
    abstract val notificationDao: NotificationDao

}