package com.rareprob.core_pulgin.core.notification;

import java.lang.System;

/**
 * @author Kp .
 * @since 05/05/23
 * This class handles push notification.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J,\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/FcmPushNotificationHandler;", "Lcom/rareprob/core_pulgin/core/notification/NotificationHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "handleNotification", "", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "loadBannerImage", "notificationManager", "Lcom/rareprob/core_pulgin/core/notification/PushNotificationManager;", "notificationData", "Lcom/rareprob/core_pulgin/core/notification/data/model/NotificationData;", "loadLargeIcon", "bannerImage", "Landroid/graphics/Bitmap;", "bannerImageFetchStatus", "", "core-plugin-framework_debug"})
public final class FcmPushNotificationHandler extends com.rareprob.core_pulgin.core.notification.NotificationHandler {
    private final android.content.Context context = null;
    
    public FcmPushNotificationHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public void handleNotification(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage message) {
    }
    
    public final void handleNotification() {
    }
    
    /**
     * Fetch Banner Image for big style notification
     */
    private final void loadBannerImage(com.rareprob.core_pulgin.core.notification.PushNotificationManager notificationManager, com.rareprob.core_pulgin.core.notification.data.model.NotificationData notificationData) {
    }
    
    /**
     * Fetch Large icon for notification
     */
    private final void loadLargeIcon(android.graphics.Bitmap bannerImage, boolean bannerImageFetchStatus, com.rareprob.core_pulgin.core.notification.PushNotificationManager notificationManager, com.rareprob.core_pulgin.core.notification.data.model.NotificationData notificationData) {
    }
}