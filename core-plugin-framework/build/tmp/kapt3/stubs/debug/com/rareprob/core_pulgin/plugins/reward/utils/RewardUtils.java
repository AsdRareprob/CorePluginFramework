package com.rareprob.core_pulgin.plugins.reward.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.provider.Settings;
import com.rareprob.core_pulgin.core.utils.AppPreferencesUtils;
import com.rareprob.core_pulgin.core.utils.AppUtils;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\u001c\u001d\u001e\u001f !\"B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils;", "", "()V", "NAVIGATION_SOURCE", "", "getNAVIGATION_SOURCE", "()Ljava/lang/String;", "setNAVIGATION_SOURCE", "(Ljava/lang/String;)V", "coinCollectDialog", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/dialog/CoinCollectDialog;", "getAndroidId", "context", "Landroid/content/Context;", "getAppSpecificLaunchScreenActionIntent", "Landroid/content/Intent;", "applicationId", "rewardItem", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "getDefaultJson", "defaultFile", "getRewardDefaultJson", "getVideoPlayLaunchComponents", "onSetResult", "", "showCoinCollectDialog", "displayMsg", "Landroid/app/Activity;", "BundleKey", "RareprobAppsInfo", "RewardBroadCastAction", "RewardConstant", "RewardTaskType", "RewardViewType", "VidePlayerAppLaunchComponents", "core-plugin-framework_debug"})
public final class RewardUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils INSTANCE = null;
    private static com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog coinCollectDialog;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String NAVIGATION_SOURCE = "NAVIGATION_FROM_REWARD";
    
    private RewardUtils() {
        super();
    }
    
    public final void showCoinCollectDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String displayMsg, @org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
    }
    
    private final void onSetResult() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNAVIGATION_SOURCE() {
        return null;
    }
    
    public final void setNAVIGATION_SOURCE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent getAppSpecificLaunchScreenActionIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String applicationId, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem rewardItem) {
        return null;
    }
    
    private final android.content.Intent getVideoPlayLaunchComponents(android.content.Context context, com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem rewardItem) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRewardDefaultJson(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefaultJson(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultFile) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAndroidId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$RewardBroadCastAction;", "", "()V", "ACTION_DOWNLOAD_COMPLETE", "", "getACTION_DOWNLOAD_COMPLETE", "()Ljava/lang/String;", "setACTION_DOWNLOAD_COMPLETE", "(Ljava/lang/String;)V", "core-plugin-framework_debug"})
    public static final class RewardBroadCastAction {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardBroadCastAction INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String ACTION_DOWNLOAD_COMPLETE = "marabillas.loremar.lmvideodownloader.action.ACTION_DOWNLOAD_COMPLETE";
        
        private RewardBroadCastAction() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getACTION_DOWNLOAD_COMPLETE() {
            return null;
        }
        
        public final void setACTION_DOWNLOAD_COMPLETE(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$RewardTaskType;", "", "()V", "APPLY_ONLINE_LYRICS", "", "CROP_PHOTOS", "FILTER_DUPLICATE", "IMAGE_FILE_HIDER", "LISTEN_MUSIC", "PLAY_ONLINE_GAMES", "VIDEO_DOWNLOADER", "VIDEO_FILE_HIDER", "WATCH_VIDEO", "core-plugin-framework_debug"})
    public static final class RewardTaskType {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardTaskType INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WATCH_VIDEO = "WATCH_VIDEO";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIDEO_DOWNLOADER = "VIDEO_DOWNLOADER";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IMAGE_FILE_HIDER = "IMAGE_FILE_HIDER";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIDEO_FILE_HIDER = "VIDEO_FILE_HIDER";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PLAY_ONLINE_GAMES = "PLAY_ONLINE_GAMES";
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/utils/RewardUtils$VidePlayerAppLaunchComponents;", "", "()V", "FILE_DOWNLOADER", "", "getFILE_DOWNLOADER", "()Ljava/lang/String;", "IMAGE_FILE_HIDER", "getIMAGE_FILE_HIDER", "VIDEO_FILE_HIDER", "getVIDEO_FILE_HIDER", "WATCH_VIDEO", "getWATCH_VIDEO", "core-plugin-framework_debug"})
    public static final class VidePlayerAppLaunchComponents {
        @org.jetbrains.annotations.NotNull()
        public static final com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.VidePlayerAppLaunchComponents INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String WATCH_VIDEO = "com.rocks.music.videoplayer.VideoActivity";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String IMAGE_FILE_HIDER = "com.rocks.music.videoplayer.PrivateVideoActivity";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String VIDEO_FILE_HIDER = "com.rocks.music.videoplayer.PrivateVideoActivity";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String FILE_DOWNLOADER = "marabillas.loremar.lmvideodownloader.RocksDownloaderMainScreen";
        
        private VidePlayerAppLaunchComponents() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWATCH_VIDEO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIMAGE_FILE_HIDER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVIDEO_FILE_HIDER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFILE_DOWNLOADER() {
            return null;
        }
    }
}