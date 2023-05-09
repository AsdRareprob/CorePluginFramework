package com.rareprob.core_pulgin.core.notification

import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.google.gson.Gson
import com.rareprob.core_pulgin.core.base.CoreDatabase
import com.rareprob.core_pulgin.core.notification.data.local.entity.PushNotificationEntity
import com.rareprob.core_pulgin.core.notification.data.model.NotificationData
import com.rareprob.core_pulgin.core.notification.data.remote.PushNotificationDto
import com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingViewModel
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class FcmPushNotificationService() : FirebaseMessagingService() {

    @Inject
    lateinit var coreDatabase: CoreDatabase
    private val TAG = "FCM Service"

    override fun onNewToken(token: String) {
        Log.d(TAG, "Refreshed token: $token")
        super.onNewToken(token)
    }

    /*
     override fun onNewToken(token: String) {
         Log.d(TAG, "Refreshed token: $token")
         // If you want to send messages to this application instance or
         // manage this apps subscriptions on the server side, send the
         // FCM registration token to your app server.
         sendRegistrationToServer(token)
     }
 */
    /**
     *  Handle FCM messages here
     *  Not getting messages here? See why this may be: https://goo.gl/39bRNJ
     */
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        try {

            val from = remoteMessage.from ?: "unknown"
            val data = remoteMessage.data
            Log.d(TAG, "fcm push onMessageReceived ; from : $from ;  pushData : $data")

            // Check if message contains a data payload.
            if (data.isNullOrEmpty().not()) {
                var notificationData = parsePayLoadData(remoteMessage)
                Log.d(TAG, "Message data payload: ${data}")
                saveNotification(
                    notificationData.toNotificationEntity(
                        remoteMessage.messageId ?: ""
                    )
                )
                FcmPushNotificationHandler(application).handleNotification(notificationData)
            }

            // Check if message contains a notification payload.
            remoteMessage.notification?.let {
                Log.d(TAG, "Message Notification Body: ${it.body}")
            }
        } catch (e: Exception) {
            // logException(new Throwable("NOTIFICATION CRASHES", e));
        }
    }

    private fun parsePayLoadData(message: RemoteMessage): NotificationData {
        val map: Map<String, String> = message.data
        val gson = Gson()
        return gson.fromJson(map["data"], PushNotificationDto::class.java).toNotificationData()
    }

    /**
     * Persist notification in db for future use
     */
    private fun saveNotification(
        pushNotificationEntity: PushNotificationEntity
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            coreDatabase.notificationDao.insert(pushNotificationEntity)
        }
    }


}