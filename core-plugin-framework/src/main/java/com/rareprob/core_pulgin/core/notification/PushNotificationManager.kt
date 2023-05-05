package com.rareprob.core_pulgin.core.notification

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.media.AudioAttributes
import android.media.RingtoneManager
import android.os.Build
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.rareprob.core_pulgin.R
import com.rareprob.core_pulgin.core.base.NetworkUtils
import com.rareprob.core_pulgin.core.notification.NotificationUtils.NAVIGATION_SOURCE
import com.rareprob.core_pulgin.core.notification.data.model.NotificationData
import com.rareprob.core_pulgin.core.utils.ValidationUtils
import com.rareprob.core_pulgin.payment.RareprobAppsInfo
import java.util.*

/**
 * @author Kp .
 * @since 05/05/23
 * This class contains utility function like
 * 1. Create channel
 * 2. Creating push notification
 * 3. Display push notification
 * 4. Load banner and large icon image
 */

class PushNotificationManager(
    val context: Context
) {
    private val packageName = context.applicationInfo.packageName
    private val notificationChannelId = packageName + "ASD_NOTIFICATION_CHANNEL_ID"
    private val notificationChannelName =
        packageName + "ASD_NOTIFICATION_CHANNEL_NAME"
    private val channelDescription =
        "Notification for Rareprob apps"

    /**
     * It send notification to tray and show it
     */
    fun displayNotification(notification: Notification) {
        val notificationId = Random().nextInt(10000)
        var notificationManager = getNotificationManager()
        notificationManager.notify(
            notificationId,
            notification
        )
    }

    /**
     * High order function call to load banner image
     */
    fun loadBannerImage(
        imageUrl: String,
        onLoadSuccess: (Bitmap) -> Unit,
        onLoadFailed: () -> Unit
    ) {
        return fetchBitmap(
            imageUrl,
            onLoadSuccess,
            onLoadFailed
        )
    }


    fun getFallbackBannerImage(): Bitmap {
        return BitmapFactory.decodeResource(
            context.resources,
            R.drawable.iap_listing_bg
        )
    }

    fun loadLargeIcon(
        imageUrl: String,
        onLoadSuccess: (Bitmap) -> Unit,
        onLoadFailed: () -> Unit
    ) {
        fetchBitmap(
            imageUrl = imageUrl,
            onLoadSuccess = { largeIconBitmap ->
                onLoadSuccess(largeIconBitmap)
            },
            onLoadFailed = {
                onLoadFailed()
            }
        )
    }


    private fun fetchBitmap(
        imageUrl: String,
        onLoadSuccess: (Bitmap) -> Unit,
        onLoadFailed: () -> Unit
    ) {

        if (NetworkUtils.isDeviceOnline(context).not()) {
            onLoadFailed()
            return
        }

        if (ValidationUtils.isValidWebUrl(imageUrl).not()) {
            onLoadFailed()
            return
        }

        Glide.with(context)
            .asBitmap()
            .load(imageUrl)
            .into(object : CustomTarget<Bitmap?>() {
                override fun onResourceReady(
                    resource: Bitmap,
                    transition: Transition<in Bitmap?>?
                ) {
                    onLoadSuccess(resource)
                }

                override fun onLoadFailed(errorDrawable: Drawable?) {
                    super.onLoadFailed(errorDrawable)
                    onLoadFailed()
                }

                override fun onLoadCleared(placeholder: Drawable?) {
                }
            })
    }


    fun buildRichNotification(
        notificationData: NotificationData,
        bannerImage: Bitmap? = null,
        largeIconBitmap: Bitmap? = null
    ): Notification {
//         if (TextUtils.isEmpty(notificationData.title)) return

        val notificationBuilder = getNotificationBuilder()
        val pendingIntent: PendingIntent = getPendingIntent(context, notificationData)

        val bigStyle = if (bannerImage != null) Notification.BigPictureStyle()
            .bigPicture(bannerImage)
        else
            Notification.BigTextStyle().bigText(notificationData.body)

        addActionButtons(notificationData, notificationBuilder)

        return notificationBuilder
            .setSmallIcon(getSmallNotificationIcon(context))
            .setLargeIcon(largeIconBitmap)
            .setContentTitle(notificationData.title)
            .setContentIntent(pendingIntent)
            //.setContentText(bodyMsg)
            .setContentText(notificationData.body)
            .setStyle(bigStyle)
            .setShowWhen(true)
            .setAutoCancel(true)
            .build()
    }

    fun buildNotification(
        notificationData: NotificationData,
        largeIconBitmap: Bitmap? = null
    ): Notification {
        // if (TextUtils.isEmpty(title) || TextUtils.isEmpty(body)) return
        val notificationBuilder = getNotificationBuilder()
        val pendingIntent: PendingIntent = getPendingIntent(context, notificationData)
        val bigStyle =
            Notification.BigTextStyle().bigText(notificationData.body)

        return notificationBuilder
            .setSmallIcon(getSmallNotificationIcon(context))
            .setLargeIcon(largeIconBitmap)
            .setContentTitle(notificationData.title)
            .setContentIntent(pendingIntent)
            .setContentText(notificationData.body)
            .setStyle(bigStyle)
            .setAutoCancel(true)
            .build()
    }

    /**
     * Add (CTA) click to action button to notification
     */
    private fun addActionButtons(
        notificationData: NotificationData,
        notificationBuilder: Notification.Builder
    ) {
        val actionIntent: PendingIntent = getActionPendingIntent(context, notificationData)
        val pauseActionIntent: PendingIntent = getActionPendingIntent(context, notificationData)
        val playActionIntent: PendingIntent = getActionPendingIntent(context, notificationData)

        notificationBuilder.apply {
            addAction(
                -1, "CTA",
                actionIntent
            )
                .addAction(-1, "Pause", pauseActionIntent)
                .addAction(-1, "Play", playActionIntent)
        }
    }

    private fun getNotificationBuilder(): Notification.Builder {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = createNotificationChannel()
            setNotificationSound(notificationChannel)
            Notification.Builder(context, notificationChannel.id)
        } else {
            Notification.Builder(context)
        }
    }

    /**
     * Create the notification channel.
     */
    private fun createNotificationChannel(
    ): NotificationChannel {
        val importance = NotificationManager.IMPORTANCE_HIGH
        val notificationChannel = NotificationChannel(
            notificationChannelId,
            notificationChannelName,
            importance
        ).apply {
            description = channelDescription
            enableLights(true)
            lightColor = Color.GREEN
            enableVibration(false)
        }
        val notificationManager = getNotificationManager()
        notificationManager.createNotificationChannel(notificationChannel)
        return notificationChannel
    }

    private fun setNotificationSound(notificationChannel: NotificationChannel) {
        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val attributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_NOTIFICATION)
            .build()
        notificationChannel.setSound(defaultSoundUri, attributes) // This is IMPORTANT
    }

    private fun getSmallNotificationIcon(context: Context): Int {
        return when (context.packageName) {
            RareprobAppsInfo.FILE_MANAGER -> {
                R.drawable.filemanger_app_small_icon
            }
            else -> {
                R.drawable.filemanger_app_small_icon
            }
        }
    }

    private fun getNotificationManager(): NotificationManager =
        context.getSystemService(NotificationManager::class.java)

    private fun getPendingIntent(
        context: Context,
        notificationData: NotificationData
    ): PendingIntent {
        var launchScreenAction = notificationData.launchTargetScreenAction
        if (launchScreenAction.isNullOrEmpty()) {
            launchScreenAction =
                NotificationUtils.getAppSpecificLaunchScreenActionIntent(context.packageName)
//            val launchIntent =
//                context.packageManager.getLaunchIntentForPackage(context.packageName)
//            launchIntent?.let {
//                launchScreenAction = it.action ?: ""
//            }
        }

        var bundle = Bundle()
        bundle.putBoolean(NAVIGATION_SOURCE, true)
        bundle.putParcelable(NotificationUtils.NOTIFICATION_DATA, notificationData)

        var notificationIntent = Intent(launchScreenAction).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }.putExtras(bundle)

        return PendingIntent.getActivity(
            context,
            0,
            notificationIntent,
            PendingIntent.FLAG_IMMUTABLE
        )
    }

    private fun getActionPendingIntent(
        context: Context,
        notificationData: NotificationData
    ): PendingIntent {
        return getPendingIntent(
            context,
            notificationData
        )
    }
}