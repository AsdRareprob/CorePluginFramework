package com.rareprob.core_pulgin.core.notification.data.remote

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.rareprob.core_pulgin.core.notification.data.model.NotificationData
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class PushNotificationDto(

    @SerializedName("title")
    var title: String = "",

    @SerializedName("body")
    var body: String = "",

    @SerializedName("big_image")
    var big_image: String = "",

    @SerializedName("landing_type")
    var landing_type: String = "",

    @SerializedName("landing_value")
    var landing_value: String = "",

    @SerializedName("app_version")
    var app_version: String = "",

    @SerializedName("toolbar_title")
    var toolbar_title: String = "",

    @SerializedName("large_icon")
    var large_icon_url: String = "",

    @SerializedName("gradient_colors")
    var gradientColors: String = "",

    @SerializedName("launch_target_screen_action")
    var launchTargetScreenAction: String = "",

    @SerializedName("CTACaption1")
    var CTACaption1: String = "",
    @SerializedName("CTA1")
    var CTALaunchScreen1: String = "",

    @SerializedName("CTACaption2")
    var CTACaption2: String = "",
    @SerializedName("CTA2")
    var CTALaunchScreen2: String = "",

    @SerializedName("CTACaption3")
    var CTACaption3: String = "",
    @SerializedName("CTA3")
    var CTALaunchScreen3: String = "",

    ) : Parcelable {
    fun toNotificationData(): NotificationData {
        return NotificationData(
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
