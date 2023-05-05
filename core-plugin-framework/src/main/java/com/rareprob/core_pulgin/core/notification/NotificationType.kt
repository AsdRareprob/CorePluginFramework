package com.rareprob.core_pulgin.core.notification

sealed class NotificationType {
    object SIMPLE : NotificationType()
    object RICH : NotificationType()
    object FullScreen : NotificationType()
    object Local : NotificationType()

}
