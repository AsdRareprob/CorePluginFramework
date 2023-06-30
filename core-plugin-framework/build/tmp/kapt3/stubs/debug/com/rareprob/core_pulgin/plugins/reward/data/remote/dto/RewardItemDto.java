package com.rareprob.core_pulgin.plugins.reward.data.remote.dto;

import androidx.annotation.Keep;
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity;
import com.rareprob.core_pulgin.core.base.data.AppData;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u000eH\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0012H\u00c6\u0003J\t\u00109\u001a\u00020\u0012H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\u00a9\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010E\u001a\u00020\u00122\b\u0010F\u001a\u0004\u0018\u00010GH\u00d6\u0003J\t\u0010H\u001a\u00020\u000eH\u00d6\u0001J\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u00020LJ\t\u0010M\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0013\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010*R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010*R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0018\u00a8\u0006N"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/data/remote/dto/RewardItemDto;", "Lcom/rareprob/core_pulgin/core/base/data/AppData;", "taskId", "", "title", "", "actionButtonCaption", "ctaBgColor", "rewardCoins", "rewardIcon", "taskIcon", "taskIconBgColor", "launchTargetScreenAction", "sortSequence", "", "durationOrFileCount", "taskType", "taskCompletionStatus", "", "isRewardClaimed", "taskAssignedDate", "taskCompletionTime", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZZJJ)V", "getActionButtonCaption", "()Ljava/lang/String;", "getCtaBgColor", "getDurationOrFileCount", "()J", "()Z", "setRewardClaimed", "(Z)V", "getLaunchTargetScreenAction", "setLaunchTargetScreenAction", "(Ljava/lang/String;)V", "getRewardCoins", "getRewardIcon", "getSortSequence", "()I", "setSortSequence", "(I)V", "getTaskAssignedDate", "setTaskAssignedDate", "(J)V", "getTaskCompletionStatus", "setTaskCompletionStatus", "getTaskCompletionTime", "setTaskCompletionTime", "getTaskIcon", "getTaskIconBgColor", "getTaskId", "getTaskType", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toEntity", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/entity/RewardEntity;", "toRewardItem", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "toString", "core-plugin-framework_debug"})
public final class RewardItemDto extends com.rareprob.core_pulgin.core.base.data.AppData {
    private final long taskId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String actionButtonCaption = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ctaBgColor = null;
    private final long rewardCoins = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String rewardIcon = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String taskIcon = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String taskIconBgColor = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String launchTargetScreenAction;
    private int sortSequence;
    private final long durationOrFileCount = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String taskType = null;
    private boolean taskCompletionStatus;
    private boolean isRewardClaimed;
    private long taskAssignedDate;
    private long taskCompletionTime;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.plugins.reward.data.remote.dto.RewardItemDto copy(long taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String actionButtonCaption, @org.jetbrains.annotations.NotNull()
    java.lang.String ctaBgColor, long rewardCoins, @org.jetbrains.annotations.NotNull()
    java.lang.String rewardIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String taskIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String taskIconBgColor, @org.jetbrains.annotations.NotNull()
    java.lang.String launchTargetScreenAction, int sortSequence, long durationOrFileCount, @org.jetbrains.annotations.NotNull()
    java.lang.String taskType, boolean taskCompletionStatus, boolean isRewardClaimed, long taskAssignedDate, long taskCompletionTime) {
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
    
    public RewardItemDto() {
        super(0);
    }
    
    public RewardItemDto(long taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String actionButtonCaption, @org.jetbrains.annotations.NotNull()
    java.lang.String ctaBgColor, long rewardCoins, @org.jetbrains.annotations.NotNull()
    java.lang.String rewardIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String taskIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String taskIconBgColor, @org.jetbrains.annotations.NotNull()
    java.lang.String launchTargetScreenAction, int sortSequence, long durationOrFileCount, @org.jetbrains.annotations.NotNull()
    java.lang.String taskType, boolean taskCompletionStatus, boolean isRewardClaimed, long taskAssignedDate, long taskCompletionTime) {
        super(0);
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getTaskId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getActionButtonCaption() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCtaBgColor() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getRewardCoins() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRewardIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaskIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaskIconBgColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLaunchTargetScreenAction() {
        return null;
    }
    
    public final void setLaunchTargetScreenAction(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getSortSequence() {
        return 0;
    }
    
    public final void setSortSequence(int p0) {
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long getDurationOrFileCount() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaskType() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean getTaskCompletionStatus() {
        return false;
    }
    
    public final void setTaskCompletionStatus(boolean p0) {
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean isRewardClaimed() {
        return false;
    }
    
    public final void setRewardClaimed(boolean p0) {
    }
    
    public final long component15() {
        return 0L;
    }
    
    public final long getTaskAssignedDate() {
        return 0L;
    }
    
    public final void setTaskAssignedDate(long p0) {
    }
    
    public final long component16() {
        return 0L;
    }
    
    public final long getTaskCompletionTime() {
        return 0L;
    }
    
    public final void setTaskCompletionTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity toEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem toRewardItem() {
        return null;
    }
}