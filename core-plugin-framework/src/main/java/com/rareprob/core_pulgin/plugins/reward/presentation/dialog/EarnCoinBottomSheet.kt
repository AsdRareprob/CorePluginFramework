package com.rareprob.core_pulgin.plugins.reward.presentation.dialog

import android.app.Activity
import android.view.View
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.rareprob.core_pulgin.R

object EarnCoinBottomSheet {
    fun show(
        activity: Activity
    ) {
        var mBottomSheetDialog = BottomSheetDialog(activity, R.style.CustomBottomSheetDialogTheme)
        val view =
            activity.layoutInflater.inflate(R.layout.view_reward_earn_coin_bottom_sheet, null)
        mBottomSheetDialog?.setContentView(view)
        mBottomSheetDialog?.show()
       mBottomSheetDialog?.setCanceledOnTouchOutside(false)
        initViews(view)
        view.findViewById<LinearLayout>(R.id.btnLayout).setOnClickListener {
            mBottomSheetDialog?.dismiss()
        }
    }

    private fun initViews(
        view: View
    ) {
    }

}