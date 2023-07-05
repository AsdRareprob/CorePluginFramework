package com.rareprob.core_pulgin.plugins.reward.utils

import android.content.Context
import android.provider.Settings
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog


object RewardUtils  {

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
        const val PLAY_ONLINE_GAMES = "PLAY_ONLINE_GAMES"
        const val FILE_HIDER = "FILE_HIDER"
        const val DOWNLOADER = "DOWNLOADER"
        const val FILTER_DUPLICATE = "FILTER_DUPLICATE"
        const val LISTEN_MUSIC = "LISTEN_MUSIC"
        const val APPLY_ONLINE_LYRICS = "APPLY_ONLINE_LYRICS"
        const val CROP_PHOTOS = "CROP_PHOTOS"
    }


    var NAVIGATION_SOURCE = "NAVIGATION_FROM_REWARD"

    object AppsScreenIntentFilterAction {
        object VideoPlayerActionIntent {
            var WATCH_VIDEO = "ACTION_VIDEO_PLAYER_SCREEN_REWARD_CTA"
        }
    }

    object RareprobAppsInfo {
        var VIDEO_PLAYER = "com.rocks.music.videoplayer"
    }

    fun getAppSpecificLaunchScreenActionIntent(applicationId: String): String {
        return when (applicationId) {
            RareprobAppsInfo.VIDEO_PLAYER -> {
                AppsScreenIntentFilterAction.VideoPlayerActionIntent.WATCH_VIDEO
            }
            else -> {
                AppsScreenIntentFilterAction.VideoPlayerActionIntent.WATCH_VIDEO
            }
        }
    }

    fun getAndroidId(context: Context): String =
        Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
}