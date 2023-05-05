package com.rareprob.core_pulgin.core.notification.data.model

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Keep
@Parcelize
data class NotificationData(

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
    var launchTargetScreenAction: String = ""

):Parcelable