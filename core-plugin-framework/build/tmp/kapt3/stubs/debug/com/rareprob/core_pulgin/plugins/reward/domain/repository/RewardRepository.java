package com.rareprob.core_pulgin.plugins.reward.domain.repository;

import android.content.Context;
import com.rareprob.core_pulgin.core.utils.Resource;
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J2\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\n0\t2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000fH&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000fH&\u00a8\u0006\u0018"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "", "claimRewardCoins", "", "context", "Landroid/content/Context;", "rewardData", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/entity/RewardEntity;", "getRewardItems", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rareprob/core_pulgin/core/utils/Resource;", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardData;", "getThemesData", "", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ThemeData;", "rckey", "", "onRedeemRewardCoins", "redeemedCoin", "saveTaskProgressData", "taskType", "watchedDurationOrFileOperatedCount", "core-plugin-framework_debug"})
public abstract interface RewardRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData>>> getRewardItems(@org.jetbrains.annotations.Nullable()
    android.content.Context context);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.Map<java.lang.Long, com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData>>> getThemesData(@org.jetbrains.annotations.NotNull()
    java.lang.String rckey, @org.jetbrains.annotations.Nullable()
    android.content.Context context);
    
    public abstract void claimRewardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData);
    
    public abstract void onRedeemRewardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long redeemedCoin);
    
    public abstract void saveTaskProgressData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String taskType, long watchedDurationOrFileOperatedCount);
}