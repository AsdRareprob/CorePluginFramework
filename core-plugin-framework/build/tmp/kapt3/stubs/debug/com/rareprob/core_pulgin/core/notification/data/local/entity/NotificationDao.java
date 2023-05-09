package com.rareprob.core_pulgin.core.notification.data.local.entity;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/rareprob/core_pulgin/core/notification/data/local/entity/NotificationDao;", "Lcom/rareprob/core_pulgin/core/base/BaseDao;", "Lcom/rareprob/core_pulgin/core/notification/data/local/entity/PushNotificationEntity;", "getNotifications", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core-plugin-framework_debug"})
public abstract interface NotificationDao extends com.rareprob.core_pulgin.core.base.BaseDao<com.rareprob.core_pulgin.core.notification.data.local.entity.PushNotificationEntity> {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM PushNotificationEntity")
    public abstract java.lang.Object getNotifications(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.rareprob.core_pulgin.core.notification.data.local.entity.PushNotificationEntity>> continuation);
}