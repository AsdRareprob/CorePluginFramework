package com.rareprob.core_pulgin.plugins.reward.animation

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.FrameLayout.LayoutParams.WRAP_CONTENT
import androidx.appcompat.widget.AppCompatImageView
import com.rareprob.core_pulgin.R

class Coin(context: Context) : AppCompatImageView(context) {
    init {
        setImageResource(R.drawable.ic_coin)
    }

    companion object {
        fun addTo(
            frameLayout: FrameLayout,
            layoutParams: FrameLayout.LayoutParams =
                FrameLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
                    .apply {
                        gravity = Gravity.CENTER
                    }
        ): Coin {
            val coin = Coin(frameLayout.context)
            coin.layoutParams = layoutParams
            coin.visibility = View.GONE
            coin.alpha = .4f
            frameLayout.addView(coin)
            return coin
        }
    }

}