package com.rareprob.core_pulgin.core.utils

import android.content.Context
import android.content.Intent
import com.rareprob.core_pulgin.core.base.BaseCoreApplication
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.IapBillingConstants
import java.io.IOException
import java.nio.charset.Charset

object AppUtils {

    fun loadJSONFromAsset(context: Context,fileName:String = ""): String {
        var json: String = ""
        json = try {
            val inputStream = context.assets.open(fileName)
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            String(buffer, Charset.forName("UTF-8"))
        } catch (ex: IOException) {
            ex.printStackTrace()
            return ""
        }
        return json
    }

    fun openTargetActivity(context: Context?,targetActivityIntentFilter: String){
        val intent = Intent(targetActivityIntentFilter)
        context?.startActivity(intent)
    }

    fun isPremiumUser(): Boolean {
//        if(BuildConfig.DEBUG)
//            return true
        val context = BaseCoreApplication.getInstance()
        val appSpecificKey =
            context.packageName + "-"+ IapBillingConstants.PREMIUM_USER_PREFS_KEY
        return AppPreferences.getBoolean(appSpecificKey)

    }
}