package com.rareprob.core_pulgin.plugins.reward.utils;

import android.content.Context;
import android.provider.Settings;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils;", "", "()V", "NAVIGATION_SOURCE", "", "getNAVIGATION_SOURCE", "()Ljava/lang/String;", "setNAVIGATION_SOURCE", "(Ljava/lang/String;)V", "getAndroidId", "context", "Landroid/content/Context;", "getAppSpecificLaunchScreenActionIntent", "applicationId", "AppsScreenIntentFilterAction", "BundleKey", "RareprobAppsInfo", "RewardConstant", "RewardTaskType", "RewardViewType", "core-plugin-framework_debug"})
public final class RewardUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String NAVIGATION_SOURCE = "NAVIGATION_FROM_REWARD";
    
    private RewardUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNAVIGATION_SOURCE() {
        return null;
    }
    
    public final void setNAVIGATION_SOURCE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppSpecificLaunchScreenActionIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String applicationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAndroidId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$RewardViewType;", "", "()V", "CoinExchangeViewType", "EarnCoinViewType", "core-plugin-framework_debug"})
    public static final class RewardViewType {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType INSTANCE = null;
        
        private RewardViewType() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$RewardViewType$CoinExchangeViewType;", "", "()V", "MUSIC_LYRICS", "", "MUSIC_THEME", "PALLTONE_THEME", "PREMIUM", "core-plugin-framework_debug"})
        public static final class CoinExchangeViewType {
            @org.jetbrains.annotations.NotNull()
            public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType.CoinExchangeViewType INSTANCE = null;
            public static final int PREMIUM = 0;
            public static final int PALLTONE_THEME = 1;
            public static final int MUSIC_LYRICS = 2;
            public static final int MUSIC_THEME = 3;
            
            private CoinExchangeViewType() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$RewardViewType$EarnCoinViewType;", "", "()V", "ITEM", "", "TASK_LABEL", "core-plugin-framework_debug"})
        public static final class EarnCoinViewType {
            @org.jetbrains.annotations.NotNull()
            public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType.EarnCoinViewType INSTANCE = null;
            public static final int TASK_LABEL = 0;
            public static final int ITEM = 1;
            
            private EarnCoinViewType() {
                super();
            }
        }
    }
    
    /**
     * is the bundle key for passing coins across android components
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$BundleKey;", "", "()V", "REWARD_COINS", "", "core-plugin-framework_debug"})
    public static final class BundleKey {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.BundleKey INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REWARD_COINS = "RewardCoins";
        
        private BundleKey() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$RewardConstant;", "", "()V", "FieldEarnedCoins", "", "FieldUid", "FirebaseTableName", "TOTAL_EARNED_COINS_PREFS_KEY", "core-plugin-framework_debug"})
    public static final class RewardConstant {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardConstant INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TOTAL_EARNED_COINS_PREFS_KEY = "total_earned_coins_prefs_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FirebaseTableName = "Reward";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FieldUid = "uid";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FieldEarnedCoins = "earnedCoins";
        
        private RewardConstant() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$RewardTaskType;", "", "()V", "APPLY_ONLINE_LYRICS", "", "CROP_PHOTOS", "DOWNLOADER", "FILE_HIDER", "FILTER_DUPLICATE", "LISTEN_MUSIC", "PLAY_ONLINE_GAMES", "WATCH_VIDEO", "core-plugin-framework_debug"})
    public static final class RewardTaskType {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardTaskType INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WATCH_VIDEO = "WATCH_VIDEO";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PLAY_ONLINE_GAMES = "PLAY_ONLINE_GAMES";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FILE_HIDER = "FILE_HIDER";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DOWNLOADER = "DOWNLOADER";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FILTER_DUPLICATE = "FILTER_DUPLICATE";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LISTEN_MUSIC = "LISTEN_MUSIC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String APPLY_ONLINE_LYRICS = "APPLY_ONLINE_LYRICS";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CROP_PHOTOS = "CROP_PHOTOS";
        
        private RewardTaskType() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$AppsScreenIntentFilterAction;", "", "()V", "VideoPlayerActionIntent", "core-plugin-framework_debug"})
    public static final class AppsScreenIntentFilterAction {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.AppsScreenIntentFilterAction INSTANCE = null;
        
        private AppsScreenIntentFilterAction() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$AppsScreenIntentFilterAction$VideoPlayerActionIntent;", "", "()V", "WATCH_VIDEO", "", "getWATCH_VIDEO", "()Ljava/lang/String;", "setWATCH_VIDEO", "(Ljava/lang/String;)V", "core-plugin-framework_debug"})
        public static final class VideoPlayerActionIntent {
            @org.jetbrains.annotations.NotNull()
            public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.AppsScreenIntentFilterAction.VideoPlayerActionIntent INSTANCE = null;
            @org.jetbrains.annotations.NotNull()
            private static java.lang.String WATCH_VIDEO = "ACTION_VIDEO_PLAYER_SCREEN_REWARD_CTA";
            
            private VideoPlayerActionIntent() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getWATCH_VIDEO() {
                return null;
            }
            
            public final void setWATCH_VIDEO(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$RareprobAppsInfo;", "", "()V", "VIDEO_PLAYER", "", "getVIDEO_PLAYER", "()Ljava/lang/String;", "setVIDEO_PLAYER", "(Ljava/lang/String;)V", "core-plugin-framework_debug"})
    public static final class RareprobAppsInfo {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RareprobAppsInfo INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String VIDEO_PLAYER = "com.rocks.music.videoplayer";
        
        private RareprobAppsInfo() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVIDEO_PLAYER() {
            return null;
        }
        
        public final void setVIDEO_PLAYER(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}