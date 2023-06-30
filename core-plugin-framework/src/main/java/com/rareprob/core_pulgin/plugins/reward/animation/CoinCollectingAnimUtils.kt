package com.rareprob.core_pulgin.plugins.reward.animation

import android.view.View
import android.view.ViewGroup
import com.rareprob.core_pulgin.plugins.reward.animation.Coin

object CoinCollectingAnimUtils {

     fun animateCoins(
         parentView:ViewGroup,
         coin: Coin,
         targetX: Float,
         targetY: Float,
         rotationXBy: Float,
         duration: Long
    ) {
        coin.animate().scaleXBy(-.5f)
            .alpha(1f)
            .rotationXBy(rotationXBy)
            //.rotationBy(500f)
            //.scaleYBy(-.5f).rotationX(.5f)
            .x(targetX)
            .y(targetY)
            .setDuration(duration)
            .withStartAction{
                coin.visibility = View.VISIBLE
            }
            .withEndAction {
                coin.visibility = View.GONE
                parentView.removeView(coin)
            }
            .start()
    }

}