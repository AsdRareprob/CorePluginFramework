package com.rareprob.core_pulgin.core.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationPlatform;", "", "()V", "Fcm", "OneSignal", "WebEngage", "Lcom/rareprob/core_pulgin/core/notification/NotificationPlatform$Fcm;", "Lcom/rareprob/core_pulgin/core/notification/NotificationPlatform$OneSignal;", "Lcom/rareprob/core_pulgin/core/notification/NotificationPlatform$WebEngage;", "core-plugin-framework_debug"})
public abstract class NotificationPlatform {
    
    private NotificationPlatform() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationPlatform$Fcm;", "Lcom/rareprob/core_pulgin/core/notification/NotificationPlatform;", "()V", "core-plugin-framework_debug"})
    public static final class Fcm extends com.rareprob.core_pulgin.core.notification.NotificationPlatform {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.core.notification.NotificationPlatform.Fcm INSTANCE = null;
        
        private Fcm() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationPlatform$OneSignal;", "Lcom/rareprob/core_pulgin/core/notification/NotificationPlatform;", "()V", "core-plugin-framework_debug"})
    public static final class OneSignal extends com.rareprob.core_pulgin.core.notification.NotificationPlatform {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.core.notification.NotificationPlatform.OneSignal INSTANCE = null;
        
        private OneSignal() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationPlatform$WebEngage;", "Lcom/rareprob/core_pulgin/core/notification/NotificationPlatform;", "()V", "core-plugin-framework_debug"})
    public static final class WebEngage extends com.rareprob.core_pulgin.core.notification.NotificationPlatform {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.core.notification.NotificationPlatform.WebEngage INSTANCE = null;
        
        private WebEngage() {
            super();
        }
    }
}