package com.rareprob.core_pulgin.plugins.reward.presentation.dialog

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.Image
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.rareprob.core_pulgin.R


class CoinCollectDialog(val activity: Activity, val callbackListener: () -> Unit,
                        private val displayMsg:String) :
    Dialog(activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setCanceledOnTouchOutside(false)
        setupUi()
    }

    private fun setupUi() {
        setContentView(R.layout.view_earned_coins_dialog)
        var ivCancelIcon = findViewById<ImageView>(R.id.ivCancelIcon)
        var btnLayout = findViewById<LinearLayout>(R.id.btnLayout)
        ivCancelIcon.setOnClickListener{
            if(activity!= null && activity.isFinishing.not()){
                dismiss()
                activity.finish()
            }
        }

        btnLayout.setOnClickListener{
            if(activity!= null && activity.isFinishing.not()){
                dismiss()
                activity.finish()
            }
        }

        var tvDescription = findViewById<TextView>(R.id.tvDescription)
        tvDescription.text = displayMsg
    }

}