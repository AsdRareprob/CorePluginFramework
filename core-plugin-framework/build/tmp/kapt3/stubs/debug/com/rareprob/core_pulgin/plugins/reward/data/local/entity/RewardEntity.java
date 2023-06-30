package com.rareprob.core_pulgin.plugins.reward.data.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bM\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u000eH\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0011H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0011H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\u0005H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\u00c7\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010[\u001a\u00020\u00112\b\u0010\\\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010]\u001a\u00020\u000eH\u00d6\u0001J\u0006\u0010^\u001a\u00020_J\t\u0010`\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010\u001dR\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R\u001a\u0010\u0014\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010!\"\u0004\b:\u0010#R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010!\"\u0004\bB\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001dR\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010!\"\u0004\bF\u0010#\u00a8\u0006a"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/data/local/entity/RewardEntity;", "", "taskId", "", "title", "", "actionButtonCaption", "ctaBgColor", "rewardCoins", "rewardIcon", "taskIcon", "taskIconBgColor", "launchTargetScreenAction", "sortSequence", "", "durationOrFileCount", "isRewardClaimed", "", "rewardType", "earnedCoins", "taskCompletionStatus", "taskDurationOrFileCount", "taskAssignedDate", "watchedDurationOrFilesOperatedCount", "taskCompletionTime", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLjava/lang/String;JZJJJJ)V", "getActionButtonCaption", "()Ljava/lang/String;", "setActionButtonCaption", "(Ljava/lang/String;)V", "getCtaBgColor", "setCtaBgColor", "getDurationOrFileCount", "()J", "setDurationOrFileCount", "(J)V", "getEarnedCoins", "setEarnedCoins", "()Z", "setRewardClaimed", "(Z)V", "getLaunchTargetScreenAction", "setLaunchTargetScreenAction", "getRewardCoins", "setRewardCoins", "getRewardIcon", "setRewardIcon", "getRewardType", "setRewardType", "getSortSequence", "()I", "setSortSequence", "(I)V", "getTaskAssignedDate", "setTaskAssignedDate", "getTaskCompletionStatus", "setTaskCompletionStatus", "getTaskCompletionTime", "setTaskCompletionTime", "getTaskDurationOrFileCount", "setTaskDurationOrFileCount", "getTaskIcon", "setTaskIcon", "getTaskIconBgColor", "setTaskIconBgColor", "getTaskId", "setTaskId", "getTitle", "setTitle", "getWatchedDurationOrFilesOperatedCount", "setWatchedDurationOrFilesOperatedCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toRewardItem", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "toString", "core-plugin-framework_debug"})
public final class RewardEntity {
    private long taskId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String actionButtonCaption;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ctaBgColor;
    
    /**
     * rewardCoins (It is total reward coins assigned a particular task)
     */
    private long rewardCoins;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String rewardIcon;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String taskIcon;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String taskIconBgColor;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String launchTargetScreenAction;
    private int sortSequence;
    private long durationOrFileCount;
    
    /**
     * Once User clicks on claim button ,
     * We mark this task as claimed for the day
     */
    private boolean isRewardClaimed;
    
    /**
     * For example WATCH_VIDEO ,FILE_HIDER etc.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private java.lang.String rewardType;
    
    /**
     * Reward count (It is total earned coins by user for a particular task)
     */
    private long earnedCoins;
    
    /**
     * Has user completed particular Daily task
     */
    private boolean taskCompletionStatus;
    
    /**
     * It is time duration of a particular task
     * (For e.g.
     * Watch the online video for 15 minutes
     * or
     * Apply the online lyrics feature on 3 music files
     * )
     */
    private long taskDurationOrFileCount;
    
    /**
     * Date on which tasks were assigned to user
     * (i.e The Date on which the user was displayed referral tasks list)
     */
    private long taskAssignedDate;
    
    /**
     * It contains watch duration in minutes or file operated count
     * (How many files you have made hide or how long you have watched video for
     */
    private long watchedDurationOrFilesOperatedCount;
    
    /**
     * On the basis of taskCompletionTime, we will sort the list
     * UseCase -> Once user completes task, This particular task should come at top of list
     */
    private long taskCompletionTime;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity copy(long taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String actionButtonCaption, @org.jetbrains.annotations.NotNull()
    java.lang.String ctaBgColor, long rewardCoins, @org.jetbrains.annotations.NotNull()
    java.lang.String rewardIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String taskIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String taskIconBgColor, @org.jetbrains.annotations.NotNull()
    java.lang.String launchTargetScreenAction, int sortSequence, long durationOrFileCount, boolean isRewardClaimed, @org.jetbrains.annotations.NotNull()
    java.lang.String rewardType, long earnedCoins, boolean taskCompletionStatus, long taskDurationOrFileCount, long taskAssignedDate, long watchedDurationOrFilesOperatedCount, long taskCompletionTime) {
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
    
    public RewardEntity() {
        super();
    }
    
    public RewardEntity(long taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String actionButtonCaption, @org.jetbrains.annotations.NotNull()
    java.lang.String ctaBgColor, long rewardCoins, @org.jetbrains.annotations.NotNull()
    java.lang.String rewardIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String taskIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String taskIconBgColor, @org.jetbrains.annotations.NotNull()
    java.lang.String launchTargetScreenAction, int sortSequence, long durationOrFileCount, boolean isRewardClaimed, @org.jetbrains.annotations.NotNull()
    java.lang.String rewardType, long earnedCoins, boolean taskCompletionStatus, long taskDurationOrFileCount, long taskAssignedDate, long watchedDurationOrFilesOperatedCount, long taskCompletionTime) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getTaskId() {
        return 0L;
    }
    
    public final void setTaskId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getActionButtonCaption() {
        return null;
    }
    
    public final void setActionButtonCaption(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCtaBgColor() {
        return null;
    }
    
    public final void setCtaBgColor(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * rewardCoins (It is total reward coins assigned a particular task)
     */
    public final long component5() {
        return 0L;
    }
    
    /**
     * rewardCoins (It is total reward coins assigned a particular task)
     */
    public final long getRewardCoins() {
        return 0L;
    }
    
    /**
     * rewardCoins (It is total reward coins assigned a particular task)
     */
    public final void setRewardCoins(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRewardIcon() {
        return null;
    }
    
    public final void setRewardIcon(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaskIcon() {
        return null;
    }
    
    public final void setTaskIcon(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaskIconBgColor() {
        return null;
    }
    
    public final void setTaskIconBgColor(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    public final void setDurationOrFileCount(long p0) {
    }
    
    /**
     * Once User clicks on claim button ,
     * We mark this task as claimed for the day
     */
    public final boolean component12() {
        return false;
    }
    
    /**
     * Once User clicks on claim button ,
     * We mark this task as claimed for the day
     */
    public final boolean isRewardClaimed() {
        return false;
    }
    
    /**
     * Once User clicks on claim button ,
     * We mark this task as claimed for the day
     */
    public final void setRewardClaimed(boolean p0) {
    }
    
    /**
     * For example WATCH_VIDEO ,FILE_HIDER etc.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    /**
     * For example WATCH_VIDEO ,FILE_HIDER etc.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRewardType() {
        return null;
    }
    
    /**
     * For example WATCH_VIDEO ,FILE_HIDER etc.
     */
    public final void setRewardType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Reward count (It is total earned coins by user for a particular task)
     */
    public final long component14() {
        return 0L;
    }
    
    /**
     * Reward count (It is total earned coins by user for a particular task)
     */
    public final long getEarnedCoins() {
        return 0L;
    }
    
    /**
     * Reward count (It is total earned coins by user for a particular task)
     */
    public final void setEarnedCoins(long p0) {
    }
    
    /**
     * Has user completed particular Daily task
     */
    public final boolean component15() {
        return false;
    }
    
    /**
     * Has user completed particular Daily task
     */
    public final boolean getTaskCompletionStatus() {
        return false;
    }
    
    /**
     * Has user completed particular Daily task
     */
    public final void setTaskCompletionStatus(boolean p0) {
    }
    
    /**
     * It is time duration of a particular task
     * (For e.g.
     * Watch the online video for 15 minutes
     * or
     * Apply the online lyrics feature on 3 music files
     * )
     */
    public final long component16() {
        return 0L;
    }
    
    /**
     * It is time duration of a particular task
     * (For e.g.
     * Watch the online video for 15 minutes
     * or
     * Apply the online lyrics feature on 3 music files
     * )
     */
    public final long getTaskDurationOrFileCount() {
        return 0L;
    }
    
    /**
     * It is time duration of a particular task
     * (For e.g.
     * Watch the online video for 15 minutes
     * or
     * Apply the online lyrics feature on 3 music files
     * )
     */
    public final void setTaskDurationOrFileCount(long p0) {
    }
    
    /**
     * Date on which tasks were assigned to user
     * (i.e The Date on which the user was displayed referral tasks list)
     */
    public final long component17() {
        return 0L;
    }
    
    /**
     * Date on which tasks were assigned to user
     * (i.e The Date on which the user was displayed referral tasks list)
     */
    public final long getTaskAssignedDate() {
        return 0L;
    }
    
    /**
     * Date on which tasks were assigned to user
     * (i.e The Date on which the user was displayed referral tasks list)
     */
    public final void setTaskAssignedDate(long p0) {
    }
    
    /**
     * It contains watch duration in minutes or file operated count
     * (How many files you have made hide or how long you have watched video for
     */
    public final long component18() {
        return 0L;
    }
    
    /**
     * It contains watch duration in minutes or file operated count
     * (How many files you have made hide or how long you have watched video for
     */
    public final long getWatchedDurationOrFilesOperatedCount() {
        return 0L;
    }
    
    /**
     * It contains watch duration in minutes or file operated count
     * (How many files you have made hide or how long you have watched video for
     */
    public final void setWatchedDurationOrFilesOperatedCount(long p0) {
    }
    
    /**
     * On the basis of taskCompletionTime, we will sort the list
     * UseCase -> Once user completes task, This particular task should come at top of list
     */
    public final long component19() {
        return 0L;
    }
    
    /**
     * On the basis of taskCompletionTime, we will sort the list
     * UseCase -> Once user completes task, This particular task should come at top of list
     */
    public final long getTaskCompletionTime() {
        return 0L;
    }
    
    /**
     * On the basis of taskCompletionTime, we will sort the list
     * UseCase -> Once user completes task, This particular task should come at top of list
     */
    public final void setTaskCompletionTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem toRewardItem() {
        return null;
    }
}