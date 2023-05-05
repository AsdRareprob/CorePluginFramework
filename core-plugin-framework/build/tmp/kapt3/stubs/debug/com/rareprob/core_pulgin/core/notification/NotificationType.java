package com.rareprob.core_pulgin.core.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationType;", "", "()V", "FullScreen", "Local", "RICH", "SIMPLE", "Lcom/rareprob/core_pulgin/core/notification/NotificationType$SIMPLE;", "Lcom/rareprob/core_pulgin/core/notification/NotificationType$RICH;", "Lcom/rareprob/core_pulgin/core/notification/NotificationType$FullScreen;", "Lcom/rareprob/core_pulgin/core/notification/NotificationType$Local;", "core-plugin-framework_debug"})
public abstract class NotificationType {
    
    private NotificationType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationType$SIMPLE;", "Lcom/rareprob/core_pulgin/core/notification/NotificationType;", "()V", "core-plugin-framework_debug"})
    public static final class SIMPLE extends com.rareprob.core_pulgin.core.notification.NotificationType {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.core.notification.NotificationType.SIMPLE INSTANCE = null;
        
        private SIMPLE() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationType$RICH;", "Lcom/rareprob/core_pulgin/core/notification/NotificationType;", "()V", "core-plugin-framework_debug"})
    public static final class RICH extends com.rareprob.core_pulgin.core.notification.NotificationType {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.core.notification.NotificationType.RICH INSTANCE = null;
        
        private RICH() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationType$FullScreen;", "Lcom/rareprob/core_pulgin/core/notification/NotificationType;", "()V", "core-plugin-framework_debug"})
    public static final class FullScreen extends com.rareprob.core_pulgin.core.notification.NotificationType {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.core.notification.NotificationType.FullScreen INSTANCE = null;
        
        private FullScreen() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationType$Local;", "Lcom/rareprob/core_pulgin/core/notification/NotificationType;", "()V", "core-plugin-framework_debug"})
    public static final class Local extends com.rareprob.core_pulgin.core.notification.NotificationType {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.core.notification.NotificationType.Local INSTANCE = null;
        
        private Local() {
            super();
        }
    }
}