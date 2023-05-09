package com.rareprob.core_pulgin.core.notification.data.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bD\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\u00a9\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\t\u0010G\u001a\u00020HH\u00d6\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010LH\u00d6\u0003J\t\u0010M\u001a\u00020HH\u00d6\u0001J\u000e\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0003J\t\u0010Q\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020HH\u00d6\u0001R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b\'\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017\u00a8\u0006W"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/data/model/NotificationData;", "Landroid/os/Parcelable;", "title", "", "body", "big_image", "landing_type", "landing_value", "app_version", "toolbar_title", "large_icon_url", "gradientColors", "launchTargetScreenAction", "CTACaption1", "CTALaunchScreen1", "CTACaption2", "CTALaunchScreen2", "CTACaption3", "CTALaunchScreen3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCTACaption1", "()Ljava/lang/String;", "setCTACaption1", "(Ljava/lang/String;)V", "getCTACaption2", "setCTACaption2", "getCTACaption3", "setCTACaption3", "getCTALaunchScreen1", "setCTALaunchScreen1", "getCTALaunchScreen2", "setCTALaunchScreen2", "getCTALaunchScreen3", "setCTALaunchScreen3", "getApp_version", "setApp_version", "getBig_image", "setBig_image", "getBody", "setBody", "getGradientColors", "setGradientColors", "getLanding_type", "setLanding_type", "getLanding_value", "setLanding_value", "getLarge_icon_url", "setLarge_icon_url", "getLaunchTargetScreenAction", "setLaunchTargetScreenAction", "getTitle", "setTitle", "getToolbar_title", "setToolbar_title", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toNotificationEntity", "Lcom/rareprob/core_pulgin/core/notification/data/local/entity/PushNotificationEntity;", "messageId", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core-plugin-framework_debug"})
public final class NotificationData implements android.os.Parcelable {
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
    public static final android.os.Parcelable.Creator<com.rareprob.core_pulgin.core.notification.data.model.NotificationData> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.core.notification.data.model.NotificationData copy(@org.jetbrains.annotations.NotNull()
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
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NotificationData() {
        super();
    }
    
    public NotificationData(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBig_image() {
        return null;
    }
    
    public final void setBig_image(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanding_type() {
        return null;
    }
    
    public final void setLanding_type(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanding_value() {
        return null;
    }
    
    public final void setLanding_value(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApp_version() {
        return null;
    }
    
    public final void setApp_version(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToolbar_title() {
        return null;
    }
    
    public final void setToolbar_title(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLarge_icon_url() {
        return null;
    }
    
    public final void setLarge_icon_url(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGradientColors() {
        return null;
    }
    
    public final void setGradientColors(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLaunchTargetScreenAction() {
        return null;
    }
    
    public final void setLaunchTargetScreenAction(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTACaption1() {
        return null;
    }
    
    public final void setCTACaption1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTALaunchScreen1() {
        return null;
    }
    
    public final void setCTALaunchScreen1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTACaption2() {
        return null;
    }
    
    public final void setCTACaption2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTALaunchScreen2() {
        return null;
    }
    
    public final void setCTALaunchScreen2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTACaption3() {
        return null;
    }
    
    public final void setCTACaption3(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCTALaunchScreen3() {
        return null;
    }
    
    public final void setCTALaunchScreen3(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.core.notification.data.local.entity.PushNotificationEntity toNotificationEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.rareprob.core_pulgin.core.notification.data.model.NotificationData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.rareprob.core_pulgin.core.notification.data.model.NotificationData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.rareprob.core_pulgin.core.notification.data.model.NotificationData[] newArray(int size) {
            return null;
        }
    }
}