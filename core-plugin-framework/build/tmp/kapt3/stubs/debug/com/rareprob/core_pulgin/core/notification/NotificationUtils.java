package com.rareprob.core_pulgin.core.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationUtils;", "", "()V", "APP_UPDATE_BASE_URL", "", "LANDING_TYPE_UPDATE", "getLANDING_TYPE_UPDATE", "()Ljava/lang/String;", "setLANDING_TYPE_UPDATE", "(Ljava/lang/String;)V", "LANDING_TYPE_WEBVIEW", "getLANDING_TYPE_WEBVIEW", "setLANDING_TYPE_WEBVIEW", "NAVIGATION_SOURCE", "getNAVIGATION_SOURCE", "setNAVIGATION_SOURCE", "NOTIFICATION_DATA", "getNOTIFICATION_DATA", "setNOTIFICATION_DATA", "getAppSpecificLaunchScreenActionIntent", "applicationId", "getAppUpdateUrl", "AppsMainScreenIntentFilterAction", "core-plugin-framework_debug"})
public final class NotificationUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.core.notification.NotificationUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String NAVIGATION_SOURCE = "FROM_NOTIFICATION";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String NOTIFICATION_DATA = "Notification";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String LANDING_TYPE_WEBVIEW = "WV";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String LANDING_TYPE_UPDATE = "UPDATE";
    private static final java.lang.String APP_UPDATE_BASE_URL = "https://play.google.com/store/apps/details?id=";
    
    private NotificationUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNAVIGATION_SOURCE() {
        return null;
    }
    
    public final void setNAVIGATION_SOURCE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNOTIFICATION_DATA() {
        return null;
    }
    
    public final void setNOTIFICATION_DATA(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLANDING_TYPE_WEBVIEW() {
        return null;
    }
    
    public final void setLANDING_TYPE_WEBVIEW(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLANDING_TYPE_UPDATE() {
        return null;
    }
    
    public final void setLANDING_TYPE_UPDATE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppSpecificLaunchScreenActionIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String applicationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppUpdateUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String applicationId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationUtils$AppsMainScreenIntentFilterAction;", "", "()V", "FILE_MANAGER", "", "getFILE_MANAGER", "()Ljava/lang/String;", "setFILE_MANAGER", "(Ljava/lang/String;)V", "core-plugin-framework_debug"})
    public static final class AppsMainScreenIntentFilterAction {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.core.notification.NotificationUtils.AppsMainScreenIntentFilterAction INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String FILE_MANAGER = "ACTION_FILE_MANAGER_MAIN_SCREEN_NOTIFICATION_CTA";
        
        private AppsMainScreenIntentFilterAction() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFILE_MANAGER() {
            return null;
        }
        
        public final void setFILE_MANAGER(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}