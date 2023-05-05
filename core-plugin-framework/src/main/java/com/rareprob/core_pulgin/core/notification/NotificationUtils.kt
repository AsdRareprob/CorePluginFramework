package com.rareprob.core_pulgin.core.notification

import com.rareprob.core_pulgin.payment.FeatureInfo
import com.rareprob.core_pulgin.payment.RareprobAppsInfo

object NotificationUtils {
    var NAVIGATION_SOURCE = "FROM_NOTIFICATION"
    var NOTIFICATION_DATA = "Notification"

    object AppsMainScreenIntentFilterAction {
        var FILE_MANAGER = "ACTION_FILE_MANAGER_MAIN_SCREEN_NOTIFICATION_CTA"
    }

    fun getAppSpecificLaunchScreenActionIntent(applicationId: String): String {
        return when (applicationId) {
            RareprobAppsInfo.FILE_MANAGER -> {
                AppsMainScreenIntentFilterAction.FILE_MANAGER
            }
            else -> {
                AppsMainScreenIntentFilterAction.FILE_MANAGER
            }
        }
    }
}