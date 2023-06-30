package com.rareprob.core_pulgin.plugins.reward.data;

import android.content.Context;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardRoomDatabase;
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity;
import com.rareprob.core_pulgin.plugins.reward.data.remote.dto.RewardItemDto;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData;
import org.json.JSONArray;
import org.json.JSONObject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\b\b\u0002\u0010\u0012\u001a\u00020\u0013J \u0010\u001b\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u00a8\u0006\u001e"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/data/RewardParser;", "", "()V", "deleteExistingTasksIfExpired", "", "rewardDao", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/RewardDao;", "getSortedList", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "context", "Landroid/content/Context;", "getTaskValidityStatus", "", "dbTask", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/entity/RewardEntity;", "parseReferralJson", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ReferralData;", "json", "", "parseRewardDataList", "dataJsonArray", "Lorg/json/JSONArray;", "parseThemesJson", "", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ThemeData;", "persistTasksToDb", "rewardDataList", "Lcom/rareprob/core_pulgin/plugins/reward/data/remote/dto/RewardItemDto;", "core-plugin-framework_debug"})
public final class RewardParser {
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.plugins.reward.data.RewardParser INSTANCE = null;
    
    private RewardParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData> parseReferralJson(@org.jetbrains.annotations.NotNull()
    java.lang.String json, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    private final java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem> parseRewardDataList(org.json.JSONArray dataJsonArray, android.content.Context context) {
        return null;
    }
    
    private final java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem> getSortedList(android.content.Context context) {
        return null;
    }
    
    /**
     * This function ensures in db we have tasks for today's only
     * In case of past day task. clear table -> Insert New Tasks
     */
    private final void persistTasksToDb(java.util.List<com.rareprob.core_pulgin.plugins.reward.data.remote.dto.RewardItemDto> rewardDataList, android.content.Context context) {
    }
    
    /**
     * Delete Existing Tasks from table in case  task Validity expired
     */
    private final void deleteExistingTasksIfExpired(com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao rewardDao) {
    }
    
    /**
     * once Task is claimed ,Reactivate this task to attempt again
     */
    private final boolean getTaskValidityStatus(com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity dbTask) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Long, com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData> parseThemesJson(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
        return null;
    }
}