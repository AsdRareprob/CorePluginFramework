package com.rareprob.core_pulgin.core.utils

import android.content.Context
import android.content.Intent
import java.io.IOException
import java.nio.charset.Charset

object CoreUtils {

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
}