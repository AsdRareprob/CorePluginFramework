package com.rareprob.core_pulgin.core.notification

import android.content.Context
import android.graphics.Bitmap
import com.google.firebase.messaging.RemoteMessage
import com.google.gson.Gson
import com.rareprob.core_pulgin.core.notification.data.model.NotificationData
import com.rareprob.core_pulgin.core.notification.data.remote.PushNotificationDto

/**
 * @author Kp .
 * @since 05/05/23
 * This class handles push notification.
 */

class FcmPushNotificationHandler(
    private val context: Context
) : NotificationHandler() {

    override fun handleNotification(notificationData: NotificationData) {
        var notificationManager = PushNotificationManager(context)
        loadBannerImage(notificationManager, notificationData)
    }


    /**
     * This is notification test function with hardcoded values
     */
    fun handleNotification() {
        var notificationManager = PushNotificationManager(context)
        var notificationData = NotificationData(
            title = "Notification Title",
            body = "Best file manager app powered by Rareprob",
            big_image = "https://img.rocksplayer.com/img/default/Notification/63cb9805-9554-4236-b2d6-eac39e761b07.webp"
        )
        loadBannerImage(notificationManager, notificationData)
    }

    /**
     * Fetch Banner Image for big style notification
     */
    private fun loadBannerImage(
        notificationManager: PushNotificationManager,
        notificationData: NotificationData
    ) {
        notificationManager.loadBannerImage(
            imageUrl = notificationData.big_image,
            onLoadSuccess = { bannerImageBitmap ->
//                var bannerImage = bannerImageBitmap ?: notificationManager.getFallbackBannerImage()
               var bannerImageFetchStatus = bannerImageBitmap != null
                loadLargeIcon(
                    bannerImage = bannerImageBitmap,
                    bannerImageFetchStatus = bannerImageFetchStatus,
                    notificationManager = notificationManager,
                    notificationData = notificationData
                )
            },
            onLoadFailed = {
                loadLargeIcon(
                    bannerImageFetchStatus = false,
                    notificationManager = notificationManager,
                    notificationData = notificationData
                )
            }
        )
    }

    /**
     * Fetch Large icon for notification
     */
    private fun loadLargeIcon(
        bannerImage: Bitmap? = null,
        bannerImageFetchStatus: Boolean,
        notificationManager: PushNotificationManager,
        notificationData: NotificationData
    ) {
        notificationManager.loadLargeIcon(
            imageUrl = notificationData.large_icon_url,
            onLoadSuccess = { largeIconBitmap ->
                if (bannerImageFetchStatus) {
                    val notification = notificationManager.buildRichNotification(
                        notificationData, bannerImage, largeIconBitmap
                    )
                    notificationManager.displayNotification(notification)
                } else {
                    val notification =
                        notificationManager.buildNotification(notificationData, largeIconBitmap)
                    notificationManager.displayNotification(notification)
                }
            },

            onLoadFailed = {
                if (bannerImageFetchStatus) {
                    val notification = notificationManager.buildRichNotification(
                        notificationData, bannerImage
                    )
                    notificationManager.displayNotification(notification)
                } else {
                    val notification = notificationManager.buildNotification(notificationData)
                    notificationManager.displayNotification(notification)
                }
            }
        )
    }






}