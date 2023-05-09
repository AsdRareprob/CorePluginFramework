package com.rareprob.core_pulgin.core.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/NotificationHandler;", "", "()V", "handleNotification", "", "notificationData", "Lcom/rareprob/core_pulgin/core/notification/data/model/NotificationData;", "core-plugin-framework_debug"})
public abstract class NotificationHandler {
    
    public NotificationHandler() {
        super();
    }
    
    public abstract void handleNotification(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.core.notification.data.model.NotificationData notificationData);
}