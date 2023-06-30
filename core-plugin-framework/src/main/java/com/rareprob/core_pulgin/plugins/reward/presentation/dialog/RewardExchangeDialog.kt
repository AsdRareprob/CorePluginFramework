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


class RewardExchangeDialog(
    val currentThemeCoinCount: Long,
    val totalEarnedCoins: Long,
    val activity: Activity,
    val redeemSuccessCallback: () -> Unit,
    val redeemFailureCallback: () -> Unit
) :
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
        setContentView(R.layout.dialog_reward_exchange)

        var tvCancel = findViewById<TextView>(R.id.tvCancel)
        tvCancel.setOnClickListener {
            if (activity != null && activity.isFinishing.not()) {
                dismiss()
                redeemFailureCallback()
            }
        }

        var tvApplyExchangeReward = findViewById<TextView>(R.id.tvApplyExchangeReward)
        tvApplyExchangeReward.setOnClickListener {
            if (activity != null && activity.isFinishing.not()) {
                dismiss()
                redeemSuccessCallback()
            }
        }


//        findViewById<TextView>(R.id.tvTitle).setTextFont(FONT.SEMI_BOLD)
//        findViewById<TextView>(R.id.tvSubTitle).setTextFont(FONT.MEDIUM)
//        var btnContinue = findViewById<TextView>(R.id.btn_continue)
//        btnContinue.setTextFont(FONT.SEMI_BOLD)
//        btnContinue.setOnTouchAnimationListener {
//            dismiss()
//            //CoreUtils.openTargetActivity(activity, "ACTION_FILE_MANAGER_MAIN_SCREEN")
//            callbackListener()
//        }
    }


}