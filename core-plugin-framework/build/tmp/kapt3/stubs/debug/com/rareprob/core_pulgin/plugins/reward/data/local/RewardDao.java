package com.rareprob.core_pulgin.plugins.reward.data.local;

import androidx.room.*;
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\'\u00a8\u0006\u0015"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/data/local/RewardDao;", "", "delete", "", "obj", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/entity/RewardEntity;", "deleteAll", "getCompletedRewardTask", "", "taskCompletionStatus", "", "getReward", "rewardType", "", "getRewards", "getSortedRewardTaskByClaimStatus", "getSortedRewardTaskByCompletionStatus", "getSortedRewardTasks", "insertAll", "rewards", "insertOrUpdate", "core-plugin-framework_debug"})
public abstract interface RewardDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RewardEntity ORDER BY sortSequence ASC")
    public abstract java.util.List<com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity> getRewards();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RewardEntity ORDER BY taskCompletionTime DESC")
    public abstract java.util.List<com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity> getSortedRewardTasks();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RewardEntity where rewardType = :rewardType LIMIT 1")
    public abstract com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity getReward(@org.jetbrains.annotations.NotNull()
    java.lang.String rewardType);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RewardEntity where taskCompletionStatus = :taskCompletionStatus")
    public abstract java.util.List<com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity> getCompletedRewardTask(boolean taskCompletionStatus);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RewardEntity ORDER BY taskCompletionStatus DESC")
    public abstract java.util.List<com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity> getSortedRewardTaskByCompletionStatus();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RewardEntity ORDER BY isRewardClaimed ASC")
    public abstract java.util.List<com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity> getSortedRewardTaskByClaimStatus();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity> rewards);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertOrUpdate(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewards);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity obj);
    
    @androidx.room.Query(value = "DELETE FROM RewardEntity")
    public abstract void deleteAll();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}