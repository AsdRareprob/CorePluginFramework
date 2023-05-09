package com.rareprob.core_pulgin.core.notification.data.local.entity;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b:\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u00b5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0016J\u0006\u0010?\u001a\u00020@R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001aR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u0010\u001a\u00a8\u0006A"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/data/local/entity/PushNotificationEntity;", "", "messageId", "", "time", "", "title", "body", "big_image", "landing_type", "landing_value", "app_version", "toolbar_title", "large_icon_url", "gradientColors", "launchTargetScreenAction", "CTACaption1", "CTALaunchScreen1", "CTACaption2", "CTALaunchScreen2", "CTACaption3", "CTALaunchScreen3", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCTACaption1", "()Ljava/lang/String;", "setCTACaption1", "(Ljava/lang/String;)V", "getCTACaption2", "setCTACaption2", "getCTACaption3", "setCTACaption3", "getCTALaunchScreen1", "setCTALaunchScreen1", "getCTALaunchScreen2", "setCTALaunchScreen2", "getCTALaunchScreen3", "setCTALaunchScreen3", "getApp_version", "setApp_version", "getBig_image", "setBig_image", "getBody", "setBody", "getGradientColors", "setGradientColors", "getLanding_type", "setLanding_type", "getLanding_value", "setLanding_value", "getLarge_icon_url", "setLarge_icon_url", "getLaunchTargetScreenAction", "setLaunchTargetScreenAction", "getMessageId", "setMessageId", "getTime", "()J", "setTime", "(J)V", "getTitle", "setTitle", "getToolbar_title", "setToolbar_title", "toNotificationData", "Lcom/rareprob/core_pulgin/core/notification/data/model/NotificationData;", "core-plugin-framework_debug"})
public final class PushNotificationEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private java.lang.String messageId;
    private long time;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String body;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String big_image;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String landing_type;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String landing_value;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String app_version;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String toolbar_title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String large_icon_url;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String gradientColors;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String launchTargetScreenAction;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String CTACaption1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String CTALaunchScreen1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String CTACaption2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String CTALaunchScreen2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String CTACaption3;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String CTALaunchScreen3;
    
    public PushNotificationEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId, long time, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.lang.String big_image, @org.jetbrains.annotations.NotNull()
    java.lang.String landing_type, @org.jetbrains.annotations.NotNull()
    java.lang.String landing_value, @org.jetbrains.annotations.NotNull()
    java.lang.String app_version, @org.jetbrains.annotations.NotNull()
    java.lang.String toolbar_title, @org.jetbrains.annotations.NotNull()
    java.lang.String large_icon_url, @org.jetbrains.annotations.NotNull()
    java.lang.String gradientColors, @org.jetbrains.annotations.NotNull()
    java.lang.String launchTargetScreenAction, @org.jetbrains.annotations.NotNull()
    java.lang.String CTACaption1, @org.jetbrains.annotations.NotNull()
    java.lang.String CTALaunchScreen1, @org.jetbrains.annotations.NotNull()
    java.lang.String CTACaption2, @org.jetbrains.annotations.NotNull()
    java.lang.String CTALaunchScreen2, @org.jetbrains.annotations.NotNull()
    java.lang.String CTACaption3, @org.jetbrains.annotations.NotNull()
    java.lang.String CTALaunchScreen3) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessageId() {
        return null;
    }
    
    public final void setMessageId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getTime() {
        return 0L;
    }
    
    public final void setTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBig_image() {
        return null;
    }
    
    public final void setBig_image(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanding_type() {
        return null;
    }
    
    public final void setLanding_type(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanding_value() {
        return null;
    }
    
    public final void setLanding_value(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApp_version() {
        return null;
    }
    
    public final void setApp_version(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToolbar_title() {
        return null;
    }
    
    public final void setToolbar_title(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLarge_icon_url() {
        return null;
    }
    
    public final void setLarge_icon_url(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGradientColors() {
        return null;
    }
    
    public final void setGradientColors(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLaunchTargetScreenAction() {
        return null;
    }
    
    public final void setLaunchTargetScreenAction(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTACaption1() {
        return null;
    }
    
    public final void setCTACaption1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTALaunchScreen1() {
        return null;
    }
    
    public final void setCTALaunchScreen1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTACaption2() {
        return null;
    }
    
    public final void setCTACaption2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTALaunchScreen2() {
        return null;
    }
    
    public final void setCTALaunchScreen2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTACaption3() {
        return null;
    }
    
    public final void setCTACaption3(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTALaunchScreen3() {
        return null;
    }
    
    public final void setCTALaunchScreen3(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.core.notification.data.model.NotificationData toNotificationData() {
        return null;
    }
}