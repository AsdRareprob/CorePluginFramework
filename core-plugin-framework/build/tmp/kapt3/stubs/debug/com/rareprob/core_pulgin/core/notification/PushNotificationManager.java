package com.rareprob.core_pulgin.core.notification;

import java.lang.System;

/**
 * @author Kp .
 * @since 05/05/23
 * This class contains utility function like
 * 1. Create channel
 * 2. Creating push notification
 * 3. Display push notification
 * 4. Load banner and large icon image
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J&\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0014J2\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\"H\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010%\u001a\u00020\u0016J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010\'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J0\u0010,\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\"J0\u0010-\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\"J\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/PushNotificationManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "channelDescription", "", "getContext", "()Landroid/content/Context;", "notificationChannelId", "notificationChannelName", "packageName", "kotlin.jvm.PlatformType", "addActionButtons", "", "notificationData", "Lcom/rareprob/core_pulgin/core/notification/data/model/NotificationData;", "notificationBuilder", "Landroid/app/Notification$Builder;", "buildNotification", "Landroid/app/Notification;", "largeIconBitmap", "Landroid/graphics/Bitmap;", "buildRichNotification", "bannerImage", "createNotificationChannel", "Landroid/app/NotificationChannel;", "displayNotification", "notification", "fetchBitmap", "imageUrl", "onLoadSuccess", "Lkotlin/Function1;", "onLoadFailed", "Lkotlin/Function0;", "getActionPendingIntent", "Landroid/app/PendingIntent;", "getFallbackBannerImage", "getNotificationBuilder", "getNotificationManager", "Landroid/app/NotificationManager;", "getPendingIntent", "getSmallNotificationIcon", "", "loadBannerImage", "loadLargeIcon", "setNotificationSound", "notificationChannel", "core-plugin-framework_debug"})
public final class PushNotificationManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final java.lang.String packageName = null;
    private final java.lang.String notificationChannelId = null;
    private final java.lang.String notificationChannelName = null;
    private final java.lang.String channelDescription = "Notification for Rareprob apps";
    
    public PushNotificationManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    /**
     * It send notification to tray and show it
     */
    public final void displayNotification(@org.jetbrains.annotations.NotNull()
    android.app.Notification notification) {
    }
    
    /**
     * High order function call to load banner image
     */
    public final void loadBannerImage(@org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onLoadSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadFailed) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getFallbackBannerImage() {
        return null;
    }
    
    public final void loadLargeIcon(@org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onLoadSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadFailed) {
    }
    
    private final void fetchBitmap(java.lang.String imageUrl, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onLoadSuccess, kotlin.jvm.functions.Function0<kotlin.Unit> onLoadFailed) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification buildRichNotification(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.core.notification.data.model.NotificationData notificationData, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bannerImage, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap largeIconBitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification buildNotification(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.core.notification.data.model.NotificationData notificationData, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap largeIconBitmap) {
        return null;
    }
    
    /**
     * Add (CTA) click to action button to notification
     */
    private final void addActionButtons(com.rareprob.core_pulgin.core.notification.data.model.NotificationData notificationData, android.app.Notification.Builder notificationBuilder) {
    }
    
    private final android.app.Notification.Builder getNotificationBuilder() {
        return null;
    }
    
    /**
     * Create the notification channel.
     */
    private final android.app.NotificationChannel createNotificationChannel() {
        return null;
    }
    
    private final void setNotificationSound(android.app.NotificationChannel notificationChannel) {
    }
    
    private final int getSmallNotificationIcon(android.content.Context context) {
        return 0;
    }
    
    private final android.app.NotificationManager getNotificationManager() {
        return null;
    }
    
    private final android.app.PendingIntent getPendingIntent(android.content.Context context, com.rareprob.core_pulgin.core.notification.data.model.NotificationData notificationData) {
        return null;
    }
    
    private final android.app.PendingIntent getActionPendingIntent(android.content.Context context, com.rareprob.core_pulgin.core.notification.data.model.NotificationData notificationData) {
        return null;
    }
}