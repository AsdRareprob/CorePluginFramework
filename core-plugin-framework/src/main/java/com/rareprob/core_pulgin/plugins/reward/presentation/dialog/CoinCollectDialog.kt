package com.rareprob.core_pulgin.plugins.reward.presentation.dialog

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import com.rareprob.core_pulgin.R


class CoinCollectDialog(val activity: Activity, val callbackListener: () -> Unit) :
    Dialog(activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setCanceledOnTouchOutside(false)
        setupUi()
    }

    private fun setupUi() {
        setContentView(R.layout.view_collect_coins_dialog)
    }

}