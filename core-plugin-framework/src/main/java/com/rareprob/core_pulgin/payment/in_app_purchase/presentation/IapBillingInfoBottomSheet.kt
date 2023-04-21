package com.rareprob.core_pulgin.payment.in_app_purchase.presentation

import android.app.Activity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.rareprob.core_pulgin.R
import com.rareprob.core_pulgin.core.base.extention.FONT
import com.rareprob.core_pulgin.core.base.extention.setTextFont

object IapBillingInfoBottomSheet {
    fun show(
        activity: Activity, featureIcon: Int, featureTitle: String,
        description: String
    ) {
        var mBottomSheetDialog = BottomSheetDialog(activity, R.style.CustomBottomSheetDialogTheme)
        val view =
            activity.layoutInflater.inflate(R.layout.view_iap_billing_info_bottom_sheet, null)
        mBottomSheetDialog?.setContentView(view)
        mBottomSheetDialog?.show()
        mBottomSheetDialog?.setCanceledOnTouchOutside(true)
        initViews(view, featureIcon, featureTitle, description)

        view.findViewById<TextView>(R.id.tvGotItLabel).setOnClickListener {
            mBottomSheetDialog?.dismiss()
        }
    }

    private fun initViews(
        view: View,
        featureIcon: Int,
        featureTitle: String,
        description: String
    ) {
        var ivFeatureIcon = view.findViewById<ImageView>(R.id.ivFeatureIcon)
        ivFeatureIcon.setImageResource(featureIcon)
        var tvFeatureTitle = view.findViewById<TextView>(R.id.tvFeatureTitle)
        tvFeatureTitle.setTextFont(FONT.SEMI_BOLD)
        tvFeatureTitle.text = featureTitle
        var tvDescription = view.findViewById<TextView>(R.id.tvDescription)
        tvDescription.text = description
        tvDescription.setTextFont(FONT.MEDIUM)
        var tvGotItLabel = view.findViewById<TextView>(R.id.tvGotItLabel)
        tvGotItLabel.setTextFont(FONT.SEMI_BOLD)
    }

}