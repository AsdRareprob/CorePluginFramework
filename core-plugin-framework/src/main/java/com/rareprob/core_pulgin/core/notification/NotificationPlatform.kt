package com.rareprob.core_pulgin.core.notification

sealed class NotificationPlatform {
    object Fcm : NotificationPlatform()
    object OneSignal : NotificationPlatform()
    object WebEngage : NotificationPlatform()
}
