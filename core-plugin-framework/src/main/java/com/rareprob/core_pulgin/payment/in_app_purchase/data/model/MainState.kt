package com.rareprob.core_pulgin.payment.in_app_purchase.data.model

import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.Purchase
import kotlinx.coroutines.flow.MutableStateFlow

data class MainState(
    val hasRenewableBasic: Boolean? = false,
    val hasPrepaidBasic: Boolean? = false,
    val hasRenewablePremium: Boolean? = false,
    val hasPrepaidPremium: Boolean? = false,
    val basicProductDetails: ProductDetails? = null,
    val premiumProductDetails: ProductDetails? = null,
    val purchases: List<Purchase>? = null,

    val inAppProductDetailList: ProductDetails? = null,

)
