package com.rareprob.core_pulgin.payment.in_app_purchase.data.model


data class InAppProductsDataState(
    val inAppProductItems: List<ProductListingData> = emptyList(),
    val isLoading: Boolean = false
)
