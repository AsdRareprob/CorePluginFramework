package com.rareprob.core_pulgin.core.utils

import android.content.Context
import android.text.TextUtils
import android.util.Log
import com.google.firebase.FirebaseApp
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.rareprob.core_pulgin.core.base.NetworkUtils
import com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData
import org.json.JSONObject
import java.lang.reflect.Type

object FirebaseRemoteConfigUtils {
    private const val PREMIUM_PACK_DATA_KEY = "premium_pack_data_test"

    fun getInAppProducts(
        defaultLocalPackJson: String,
        context: Context,
    ): List<ProductListingData>? {
        return try {
            //Assigning with default value
            var json = ""

            //Get remote config json
            FirebaseApp.initializeApp(context.applicationContext)
            val mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance()
            json =
                mFirebaseRemoteConfig.getString(PREMIUM_PACK_DATA_KEY)

            if (TextUtils.isEmpty(json) && defaultLocalPackJson.isNullOrEmpty().not()) {
                json = defaultLocalPackJson
            }
            if (TextUtils.isEmpty(json))
                return emptyList()

            val jsonObject = JSONObject(json)
            val array = jsonObject["data"]
            val gson = Gson()
            val type: Type =
                object : TypeToken<List<ProductListingData?>?>() {}.type
            gson.fromJson<List<ProductListingData>>(array.toString(), type)
        } catch (e: java.lang.Exception) {
            emptyList()
        }
    }
}