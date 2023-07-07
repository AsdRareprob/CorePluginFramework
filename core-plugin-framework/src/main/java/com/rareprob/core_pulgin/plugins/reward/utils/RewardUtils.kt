package com.rareprob.core_pulgin.plugins.reward.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Environment
import android.provider.Settings
import com.rareprob.core_pulgin.core.utils.AppPreferencesUtils
import com.rareprob.core_pulgin.core.utils.AppUtils
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog


object RewardUtils {

    object RewardBroadCastAction {
        var ACTION_DOWNLOAD_COMPLETE =
            "marabillas.loremar.lmvideodownloader.action.ACTION_DOWNLOAD_COMPLETE"
    }

    private lateinit var coinCollectDialog: CoinCollectDialog

    fun showCoinCollectDialog(displayMsg: String, context: Activity) {
        if (!this::coinCollectDialog.isInitialized) {
            coinCollectDialog = CoinCollectDialog(context, ::onSetResult, displayMsg)
        }
        coinCollectDialog.show()
    }

    private fun onSetResult() {
    }

    object RewardViewType {
        object CoinExchangeViewType {
            const val PREMIUM = 0
            const val PALLTONE_THEME = 1
            const val MUSIC_LYRICS = 2
            const val MUSIC_THEME = 3
        }

        object EarnCoinViewType {
            const val TASK_LABEL = 0
            const val ITEM = 1
        }
    }

    /**
     *
     *  is the bundle key for passing coins across android components
     */
    object BundleKey {
        const val REWARD_COINS = "RewardCoins"
    }

    object RewardConstant {
        const val TOTAL_EARNED_COINS_PREFS_KEY = "total_earned_coins_prefs_key"
        const val FirebaseTableName = "Reward"
        const val FieldUid = "uid"
        const val FieldEarnedCoins = "earnedCoins"
    }

    object RewardTaskType {
        //        const val WATCH_ONLINE_VIDEO = 1
//        const val WATCH_OFF_LINE_VIDEO = 2
        const val WATCH_VIDEO = "WATCH_VIDEO"
        const val VIDEO_DOWNLOADER = "VIDEO_DOWNLOADER"
        const val IMAGE_FILE_HIDER = "IMAGE_FILE_HIDER"
        const val VIDEO_FILE_HIDER = "VIDEO_FILE_HIDER"

        const val PLAY_ONLINE_GAMES = "PLAY_ONLINE_GAMES"


        const val FILTER_DUPLICATE = "FILTER_DUPLICATE"
        const val LISTEN_MUSIC = "LISTEN_MUSIC"
        const val APPLY_ONLINE_LYRICS = "APPLY_ONLINE_LYRICS"
        const val CROP_PHOTOS = "CROP_PHOTOS"
    }


    var NAVIGATION_SOURCE = "NAVIGATION_FROM_REWARD"

//    object AppsScreenIntentFilterAction {
//        object VideoPlayerActionIntent {
//            var WATCH_VIDEO = "ACTION_VIDEO_PLAYER_SCREEN_REWARD_CTA"
//        }
//    }

    object RareprobAppsInfo {
        var VIDEO_PLAYER = "com.rocks.music.videoplayer"
    }

    object VidePlayerAppLaunchComponents {

        val WATCH_VIDEO = "com.rocks.music.videoplayer.VideoActivity"
        val IMAGE_FILE_HIDER = "com.rocks.music.videoplayer.PrivateVideoActivity"
        val VIDEO_FILE_HIDER = "com.rocks.music.videoplayer.PrivateVideoActivity"
        val FILE_DOWNLOADER = "marabillas.loremar.lmvideodownloader.RocksDownloaderMainScreen"
    }


    fun getAppSpecificLaunchScreenActionIntent(
        context: Context,
        applicationId: String,
        rewardItem: RewardItem
    ): Intent? {
        return when (applicationId) {
            RareprobAppsInfo.VIDEO_PLAYER -> {
                return getVideoPlayLaunchComponents(context, rewardItem)
            }
            else -> {
                null
            }
        }
    }


    private fun getVideoPlayLaunchComponents(context: Context, rewardItem: RewardItem): Intent? {
        return when (rewardItem.taskType) {
            RewardTaskType.WATCH_VIDEO -> {
                AppPreferencesUtils.putString(NAVIGATION_SOURCE, rewardItem.taskType, context)
                val intent =
                    Intent(context, Class.forName(VidePlayerAppLaunchComponents.WATCH_VIDEO))
                intent.putExtra(NAVIGATION_SOURCE, rewardItem.taskType)
                intent.putExtra(RewardUtils.BundleKey.REWARD_COINS, rewardItem.rewardCoins)
                intent.putExtra("Path", Environment.getExternalStorageDirectory().absolutePath)
                intent.putExtra("IsFetchAllVideos", true)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            RewardTaskType.VIDEO_DOWNLOADER -> {
                AppPreferencesUtils.putString(NAVIGATION_SOURCE, rewardItem.taskType, context)
                val intent =
                    Intent(context, Class.forName(VidePlayerAppLaunchComponents.FILE_DOWNLOADER))
                intent.putExtra(NAVIGATION_SOURCE, rewardItem.taskType)
                intent.putExtra(RewardUtils.BundleKey.REWARD_COINS, rewardItem.rewardCoins)
                intent.putExtra("Path", Environment.getExternalStorageDirectory().absolutePath)
                intent.putExtra("IsFetchAllVideos", true)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

            }
            RewardTaskType.IMAGE_FILE_HIDER -> {
                val intent =
                    Intent(context, Class.forName(VidePlayerAppLaunchComponents.IMAGE_FILE_HIDER))
                intent.putExtra(NAVIGATION_SOURCE, rewardItem.taskType)
                intent.putExtra(RewardUtils.BundleKey.REWARD_COINS, rewardItem.rewardCoins)
                intent.putExtra("Path", Environment.getExternalStorageDirectory().absolutePath)
                intent.putExtra("IsFetchAllVideos", true)
                intent.putExtra("MEDIA_TYPE", 1)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            RewardTaskType.VIDEO_FILE_HIDER -> {
                val intent =
                    Intent(context, Class.forName(VidePlayerAppLaunchComponents.VIDEO_FILE_HIDER))
                intent.putExtra(NAVIGATION_SOURCE, rewardItem.taskType)
                intent.putExtra(RewardUtils.BundleKey.REWARD_COINS, rewardItem.rewardCoins)
                intent.putExtra("Path", Environment.getExternalStorageDirectory().absolutePath)
                intent.putExtra("IsFetchAllVideos", true)
                intent.putExtra("MEDIA_TYPE", 0)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            else -> {
                null
            }
        }
    }

    fun getRewardDefaultJson(context: Context?): String {
        if (context != null) {
            return when (context.applicationContext.packageName) {
                RareprobAppsInfo.VIDEO_PLAYER -> {
                    return getDefaultJson(context, "DefaultRewardVideoPlayerJsonData")
                }
                else -> {
                    ""
                }
            }
        }
        return ""
    }


    fun getDefaultJson(context: Context?, defaultFile: String): String {
        if (context == null)
            return ""
        return AppUtils.loadJSONFromAsset(
            context, defaultFile
        )
    }

    fun getAndroidId(context: Context): String =
        Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
}