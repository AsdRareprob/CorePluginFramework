package com.rareprob.core_pulgin.plugins.reward.data.repository;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.google.firebase.database.FirebaseDatabase;
import com.rareprob.core_pulgin.core.utils.Resource;
import com.rareprob.core_pulgin.core.utils.AppPreferencesUtils;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardRoomDatabase;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils;
import com.rareprob.core_pulgin.plugins.reward.data.RewardParser;
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData;
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository;
import kotlinx.coroutines.*;
import kotlinx.coroutines.flow.Flow;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ4\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0002J,\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J2\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0018J\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0018J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u0018\u00a8\u0006#"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/data/repository/RewardRepositoryImpl;", "Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "()V", "claimRewardCoins", "", "context", "Landroid/content/Context;", "rewardData", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/entity/RewardEntity;", "getDataToPost", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "androidId", "getReferralItems", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rareprob/core_pulgin/core/utils/Resource;", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ReferralData;", "rckey", "getTaskCompletionStatus", "", "getThemesData", "", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ThemeData;", "getVideoTaskCompletionStatus", "isSyncAllowed", "onEarnRewardCoins", "redeemedCoin", "onRedeemRewardCoins", "onSuccessPostData", "saveDataToBd", "taskType", "watchedDurationOrFileOperatedCount", "core-plugin-framework_debug"})
public final class RewardRepositoryImpl implements com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository {
    
    public RewardRepositoryImpl() {
        super();
    }
    
    /**
     * Fetch data from Rc // TODO KP remove this hardcoded json in Prod build
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData>>> getReferralItems(@org.jetbrains.annotations.NotNull()
    java.lang.String rckey, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.Map<java.lang.Long, com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData>>> getThemesData(@org.jetbrains.annotations.NotNull()
    java.lang.String rckey, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    public final void saveDataToBd(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String taskType, long watchedDurationOrFileOperatedCount) {
    }
    
    private final boolean getTaskCompletionStatus(com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData, android.content.Context context) {
        return false;
    }
    
    private final boolean getVideoTaskCompletionStatus(com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData) {
        return false;
    }
    
    /**
     * When User clicks on claim button
     * Post earned coins to Firebase real time database only once
     * (when taskCompletionStatus is true and rewardData.syncState is false)
     */
    public final void claimRewardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData) {
    }
    
    public final void onRedeemRewardCoins(@org.jetbrains.annotations.NotNull()
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