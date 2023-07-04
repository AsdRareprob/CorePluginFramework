package com.rareprob.core_pulgin.plugins.reward.presentation.dialog

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.ViewGroup
import android.view.Window
import android.widget.TextView
import com.rareprob.core_pulgin.R
import com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardActivity


class RewardExchangeFailDialog(val activity: Activity, val unlockForFreeCallback: () -> Unit) :
    Dialog(activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setCanceledOnTouchOutside(false)
        setupUi()
        val metrics: DisplayMetrics = context.getResources().getDisplayMetrics()
        val width = metrics.widthPixels
        window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    private fun setupUi() {
        setContentView(R.layout.dialog_reward_exchange_fail)
//        findViewById<TextView>(R.id.tvTitle).setTextFont(FONT.SEMI_BOLD)
//        findViewById<TextView>(R.id.tvSubTitle).setTextFont(FONT.MEDIUM)
//        var btnContinue = findViewById<TextView>(R.id.btn_continue)
//        btnContinue.setTextFont(FONT.SEMI_BOLD)
        var tvCancel = findViewById<TextView>(R.id.tvCancel)
        tvCancel.setOnClickListener {
            if (activity != null && activity.isFinishing.not()) {
                dismiss()
                unlockForFreeCallback()
            }
        }

        var tvEarnCoins = findViewById<TextView>(R.id.tvEarnCoins)
        tvEarnCoins.setOnClickListener {
            if (activity != null && activity.isFinishing.not()) {
                dismiss()
                RewardActivity.launch(activity)
            }
        }

        //TODO KP
//        btnContinue.setOnTouchAnimationListener {
//            dismiss()
//            //CoreUtils.openTargetActivity(activity, "ACTION_FILE_MANAGER_MAIN_SCREEN")
//            callbackListener()
//        }
    }

}