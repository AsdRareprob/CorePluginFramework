package com.rareprob.core_pulgin.core.notification.data.model

import android.os.Parcelable
import androidx.annotation.Keep
import com.rareprob.core_pulgin.core.notification.data.local.entity.PushNotificationEntity
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class NotificationData(
    var title: String = "",
    var body: String = "",
    var big_image: String = "",
    var landing_type: String = "",
    var landing_value: String = "",
    var app_version: String = "",
    var toolbar_title: String = "",
    var large_icon_url: String = "",
    var gradientColors: String = "",
    var launchTargetScreenAction: String = "",
    var CTACaption1: String = "",
    var CTALaunchScreen1: String = "",
    var CTACaption2: String = "",
    var CTALaunchScreen2: String = "",
    var CTACaption3: String = "",
    var CTALaunchScreen3: String = "",

    ) : Parcelable {
    fun toNotificationEntity(messageId: String): PushNotificationEntity {
        return PushNotificationEntity(
            messageId = messageId,
            time = System.currentTimeMillis(),
            title = title,
            body = body,
            big_image = big_image,
            landing_type = landing_type,
            landing_value = landing_value,
            app_version = app_version,
            toolbar_title = toolbar_title,
            large_icon_url = large_icon_url,
            gradientColors = gradientColors,
            launchTargetScreenAction = launchTargetScreenAction,
            CTACaption1 = CTACaption1,
            CTALaunchScreen1 = CTALaunchScreen1,
            CTACaption2 = CTACaption2,
            CTALaunchScreen2 = CTALaunchScreen2,
            CTACaption3 = CTACaption3,
            CTALaunchScreen3 = CTALaunchScreen3
        )
    }
}