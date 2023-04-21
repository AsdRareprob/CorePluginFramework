package com.rareprob.core_pulgin.payment.in_app_purchase.data.model

import androidx.annotation.Keep
import com.android.billingclient.api.ProductDetails
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class InAppProductData(
    var appId: String, //it is package name of application
    var productId: String,
    var productType: String,
    var productName: String,
    var active: String,
    var isPurchased: Boolean,
    var sortSequence: Int
)

