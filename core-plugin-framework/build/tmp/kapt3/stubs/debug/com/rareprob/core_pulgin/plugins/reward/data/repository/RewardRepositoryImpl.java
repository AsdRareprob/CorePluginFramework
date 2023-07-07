package com.rareprob.core_pulgin.plugins.reward.data.repository;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.rareprob.core_pulgin.core.utils.Resource;
import com.rareprob.core_pulgin.core.utils.AppPreferencesUtils;
import com.rareprob.core_pulgin.core.utils.FirebaseRemoteConfigUtils;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils;
import com.rareprob.core_pulgin.plugins.reward.data.RewardParser;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardPreferenceManager;
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData;
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository;
import kotlinx.coroutines.*;
import kotlinx.coroutines.flow.Flow;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J4\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J$\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u00132\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J*\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00140\u00132\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001bJ\u0018\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J(\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/data/repository/RewardRepositoryImpl;", "Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "remoteConfigInstance", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "rewardDao", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/RewardDao;", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lcom/rareprob/core_pulgin/plugins/reward/data/local/RewardDao;)V", "claimRewardCoins", "", "context", "Landroid/content/Context;", "rewardData", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/entity/RewardEntity;", "getDataToPost", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "androidId", "getRewardItems", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rareprob/core_pulgin/core/utils/Resource;", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardData;", "getTaskCompletionStatus", "", "getThemesData", "", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ThemeData;", "getVideoTaskCompletionStatus", "isSyncAllowed", "onEarnRewardCoins", "redeemedCoin", "onRedeemRewardCoins", "onSuccessPostData", "saveTaskProgressData", "taskType", "watchedDurationOrFileOperatedCount", "isShowDialog", "core-plugin-framework_debug"})
public final class RewardRepositoryImpl implements com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository {
    private final com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfigInstance = null;
    private final com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao rewardDao = null;
    
    public RewardRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfigInstance, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao rewardDao) {
        super();
    }
    
    /**
     * Fetch data from Rc
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData>>> getRewardItems(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.Map<java.lang.Long, com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData>>> getThemesData(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public void saveTaskProgressData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String taskType, long watchedDurationOrFileOperatedCount, boolean isShowDialog) {
    }
    
    /**
     * This function returns whether a task is completed or not
     */
    private final boolean getTaskCompletionStatus(com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData, android.content.Context context) {
        return false;
    }
    
    private final boolean getVideoTaskCompletionStatus(com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData) {
        return false;
    }
    
    /**
     * This function determines how many files you have operated on
     * e.g image files hidden , video file downloaded
     */
    private final boolean getTaskCompletionStatus(com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData) {
        return false;
    }
    
    /**
     * When User clicks on claim button
     * Post earned coins to Firebase real time database only once
     * (when taskCompletionStatus is true and rewardData.syncState is false)
     */
    @java.lang.Override()
    public void claimRewardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData) {
    }
    
    @java.lang.Override()
    public void onRedeemRewardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long redeemedCoin) {
    }
    
    public final void onEarnRewardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long redeemedCoin) {
    }
    
    private final java.util.LinkedHashMap<java.lang.String, java.lang.String> getDataToPost(android.content.Context context, java.lang.String androidId) {
        return null;
    }
    
    /**
     * Mark syncState to true when coins are posted to firebase server
     */
    private final void onSuccessPostData(android.content.Context context, com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData) {
    }
    
    /**
     * Condition when sync will happen
     * (When User earns coins we attempt to sync coins to firebase server)
     */
    private final boolean isSyncAllowed(com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData) {
        return false;
    }
}