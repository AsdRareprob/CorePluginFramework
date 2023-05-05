package com.rareprob.core_pulgin.core.notification
import com.google.firebase.messaging.RemoteMessage

abstract class NotificationHandler() {
     abstract fun handleNotification(message: RemoteMessage)
}