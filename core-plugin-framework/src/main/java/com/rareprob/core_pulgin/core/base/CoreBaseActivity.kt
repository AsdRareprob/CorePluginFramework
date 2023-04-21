package com.rareprob.core_pulgin.core.base

import android.app.AlertDialog
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.os.Build
import android.view.View

open class CoreBaseActivity : AppCompatActivity() {

    fun setFullScreenMode() {
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true)
        }
        if (Build.VERSION.SDK_INT >= 19) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            window.statusBarColor = Color.TRANSPARENT
        }

    }

    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = window
        val winParams = win.attributes
        if (on) {
            winParams.flags = winParams.flags or bits
        } else {
            winParams.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }

    open fun showPopupMessage(message: String?, title: String = "", buttonMessage: String = "") {
        var buttonMessage = buttonMessage
        val alertBuilder = AlertDialog.Builder(this)
        if (title != null) {
            alertBuilder.setTitle(title)
        }
        if (message != null) {
            alertBuilder.setMessage(message)
        }
        if (buttonMessage == null) {
            buttonMessage = "OK"
        }
        alertBuilder.setPositiveButton(
            buttonMessage
        ) { dialogInterface, i -> dialogInterface.dismiss() }
        alertBuilder.show()
    }


}