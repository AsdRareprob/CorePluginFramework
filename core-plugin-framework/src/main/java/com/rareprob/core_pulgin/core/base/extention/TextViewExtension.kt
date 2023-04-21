package com.rareprob.core_pulgin.core.base.extention

import android.graphics.Typeface
import android.widget.TextView


interface FONT {
    companion object {
        const val SEMI_BOLD = "fonts/OpenSans-SemiBold.ttf"
        const val MEDIUM = "fonts/OpenSans-Regular.ttf"

    }
}


fun TextView.setTextFont(fontName: String) {
    try {
        val typeface = Typeface.createFromAsset(context.assets, fontName)
        this.typeface = typeface
    } catch (e: Exception) {
        // FirebaseCrashlytics.getInstance().recordException(e)
    }

}


