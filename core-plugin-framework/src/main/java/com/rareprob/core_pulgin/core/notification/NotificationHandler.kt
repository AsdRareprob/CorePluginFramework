package com.rareprob.core_pulgin.core.notification
import com.google.firebase.messaging.RemoteMessage
import com.rareprob.core_pulgin.core.notification.data.model.NotificationData

abstract class NotificationHandler() {
     abstract fun handleNotification(notificationData: NotificationData)
}