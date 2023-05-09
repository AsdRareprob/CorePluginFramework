package com.rareprob.core_pulgin.core.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/FcmPushNotificationService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "TAG", "", "coreDatabase", "Lcom/rareprob/core_pulgin/core/base/CoreDatabase;", "getCoreDatabase", "()Lcom/rareprob/core_pulgin/core/base/CoreDatabase;", "setCoreDatabase", "(Lcom/rareprob/core_pulgin/core/base/CoreDatabase;)V", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "parsePayLoadData", "Lcom/rareprob/core_pulgin/core/notification/data/model/NotificationData;", "message", "saveNotification", "pushNotificationEntity", "Lcom/rareprob/core_pulgin/core/notification/data/local/entity/PushNotificationEntity;", "core-plugin-framework_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FcmPushNotificationService extends com.google.firebase.messaging.FirebaseMessagingService {
    @javax.inject.Inject()
    public com.rareprob.core_pulgin.core.base.CoreDatabase coreDatabase;
    private final java.lang.String TAG = "FCM Service";
    
    public FcmPushNotificationService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.core.base.CoreDatabase getCoreDatabase() {
        return null;
    }
    
    public final void setCoreDatabase(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.core.base.CoreDatabase p0) {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    /**
     * Handle FCM messages here
     * Not getting messages here? See why this may be: https://goo.gl/39bRNJ
     */
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final com.rareprob.core_pulgin.core.notification.data.model.NotificationData parsePayLoadData(com.google.firebase.messaging.RemoteMessage message) {
        return null;
    }
    
    /**
     * Persist notification in db for future use
     */
    private final void saveNotification(com.rareprob.core_pulgin.core.notification.data.local.entity.PushNotificationEntity pushNotificationEntity) {
    }
}