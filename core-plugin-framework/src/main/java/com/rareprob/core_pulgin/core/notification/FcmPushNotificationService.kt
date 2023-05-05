package com.rareprob.core_pulgin.core.notification

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FcmPushNotificationService : FirebaseMessagingService() {

    private val TAG = "FCM Service"

    override fun onNewToken(token: String) {
        Log.d(TAG, "Refreshed token: $token")
        super.onNewToken(token)
    }

//    override fun onNewToken(token: String) {
//        Log.d(TAG, "Refreshed token: $token")
//        // If you want to send messages to this application instance or
//        // manage this apps subscriptions on the server side, send the
//        // FCM registration token to your app server.
//        sendRegistrationToServer(token)
//    }

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
            if (data.isNotEmpty()) {
                Log.d(TAG, "Message data payload: ${remoteMessage.data}")
                saveNotification(data, remoteMessage.messageId)
                FcmPushNotificationHandler(application).handleNotification(remoteMessage)
            }

            // Check if message contains a notification payload.
            remoteMessage.notification?.let {
                Log.d(TAG, "Message Notification Body: ${it.body}")
            }
        } catch (e: Exception) {
            // logException(new Throwable("NOTIFICATION CRASHES", e));
        }
    }

    /**
     * Persist notification in db for future use
     */
    private fun saveNotification(
        data: Map<String, String>,
        messageId: String?
    ) {

    }


}