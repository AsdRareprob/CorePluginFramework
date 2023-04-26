package com.rareprob.core_pulgin.payment.in_app_purchase.presentation

import android.app.Activity
import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.android.billingclient.api.BillingFlowParams
import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.Purchase
import com.rareprob.core_pulgin.core.base.CoreDatabase
import com.rareprob.core_pulgin.core.utils.AppPreferences
import com.rareprob.core_pulgin.payment.in_app_purchase.data.model.MainState
import com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.payment.in_app_purchase.IapBillingConstants
import com.rareprob.core_pulgin.payment.in_app_purchase.data.model.InAppProductData
import com.rareprob.core_pulgin.payment.in_app_purchase.domain.repository.IapBillingDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class IapBillingViewModel @Inject constructor(
    private val application: Application,
    private val coreDatabase: CoreDatabase
) :
    AndroidViewModel(application) {

    private val TAG = "InAppPurchaseViewModel"

    var billingClient: IapBillingClientWrapper = IapBillingClientWrapper(application, coreDatabase)

    private var repo: IapBillingDataRepository =
        IapBillingDataRepository(application, billingClient, coreDatabase)

    private val _billingConnectionState = MutableLiveData(false)
    val billingConnectionState: LiveData<Boolean> = _billingConnectionState

    private val _destinationScreen = MutableLiveData<DestinationScreen>()
    val destinationScreen: LiveData<DestinationScreen> = _destinationScreen


    private val _eventFlow = MutableSharedFlow<UIEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    //Start the billing connection when the viewModel is initialized.
    private fun startBillingConnection(rcProductItemList: List<ProductListingData> = emptyList()) {
        if (rcProductItemList.isNullOrEmpty()) {
            //We can emit empty data list here //TODO KP
        } else {
            billingClient.startBillingConnection(
                billingConnectionState = _billingConnectionState,
                rcProductItemList = rcProductItemList
            )
        }
    }


    /**
     * Prepare ProductItemList from Remote config
     */
    private val _rcProductItemList =
        MutableStateFlow<List<ProductListingData>>(listOf())
    val rcProductItemList = _rcProductItemList.asStateFlow()

    fun getInAppPacksFromRc(defaultLocalPackJson: String) {
        viewModelScope.launch {
            repo.getInAppProducts(defaultLocalPackJson).onEach { result ->
                when (result) {
                    is Resource.Success -> {
                        var productList = result.data ?: emptyList()
                        productList.sortedBy {
                            it.sortSequence
                        }
                        _rcProductItemList.value = productList
                        startBillingConnection(_rcProductItemList.value)
                    }
                    is Resource.Error -> {
                        _eventFlow.emit(
                            UIEvent.ShowSnackbar(
                                result.message ?: "Unknown error"
                            )
                        )
                    }
                    is Resource.Loading -> {
                    }
                }
            }.launchIn(this)
        }
    }


    /**
     * Fetched already purchased product from db
     * or iab billing restore data
     */
    private val _purchasedProductMap = billingClient._purchasedProductMap

    //        MutableStateFlow<Map<String, InAppProductData>>(emptyMap())
    val purchasedProductMap =
        _purchasedProductMap.asStateFlow()

    fun getPurchasedItemsList() {
        viewModelScope.launch {
            repo.getPurchasedItemsList().onEach { result ->
                when (result) {
                    is Resource.Success -> {
                        //Result list
                        var resultList = result.data ?: emptyList<InAppProductData>()
                        //Create map of purchased products
                        var productMap = emptyMap<String, InAppProductData>()
                        productMap = resultList.associateBy {
                            it.productId
                        }
                        _purchasedProductMap.value = productMap
                    }
                    is Resource.Error -> {
//                        _state.value = state.value.copy(
//                            inAppProductItems = result.data ?: emptyList(),
//                            isLoading = false
//                        )
                        _eventFlow.emit(
                            UIEvent.ShowSnackbar(
                                result.message ?: "Unknown error"
                            )
                        )
                    }
                    is Resource.Loading -> {
//                        _state.value = state.value.copy(
//                            inAppProductItems = result.data ?: emptyList(),
//                            isLoading = true
//                        )
                    }
                }
            }.launchIn(this)
        }

    }

    val productsForSaleFlows = billingClient.purchasesDetailNew
//        MutableStateFlow<List<ProductDetails>>(listOf())
//    val purchasesDetailNew = _purchasesDetailNew.asStateFlow()

    // Tracks new purchases acknowledgement state.
    // Set to true when a purchase is acknowledged and false when not.
    val isNewPurchaseAcknowledged = billingClient.isNewPurchaseAcknowledged

    private val _isPremiumUserFlow = MutableStateFlow(false)
    val isPremiumUserFlow =_isPremiumUserFlow.asStateFlow()

    val isPurchasedRestored = billingClient.isPurchasedRestored

    fun isPremiumUser() {
        viewModelScope.launch {
            val inAppPurchaseDao = coreDatabase?.inAppPurchaseDao
            if (inAppPurchaseDao != null) {
                var purchasedItemsList  = inAppPurchaseDao.isPremiumUser(application.packageName)
                _isPremiumUserFlow.value =  purchasedItemsList?.isNotEmpty()
            }
        }
    }


    // The userCurrentSubscriptionFlow object combines all the possible subscription flows into one
    // for emission.
    private val userCurrentSubscriptionFlow = combine(
        repo.hasRenewableBasic,
        repo.hasPrepaidBasic,
        repo.hasRenewablePremium,
        repo.hasPrepaidPremium
    ) { hasRenewableBasic,
        hasPrepaidBasic,
        hasRenewablePremium,
        hasPrepaidPremium
        ->
        MainState(
            hasRenewableBasic = hasRenewableBasic,
            hasPrepaidBasic = hasPrepaidBasic,
            hasRenewablePremium = hasRenewablePremium,
            hasPrepaidPremium = hasPrepaidPremium
        )
    }

    // Current purchases.
    val currentPurchasesFlow = repo.purchases

    init {
        viewModelScope.launch {
            userCurrentSubscriptionFlow.collectLatest { collectedSubscriptions ->
                when {
                    collectedSubscriptions.hasRenewableBasic == true &&
                            collectedSubscriptions.hasRenewablePremium == false -> {
                        _destinationScreen.postValue(DestinationScreen.BASIC_RENEWABLE_PROFILE)
                    }
                    collectedSubscriptions.hasRenewablePremium == true &&
                            collectedSubscriptions.hasRenewableBasic == false -> {
                        _destinationScreen.postValue(DestinationScreen.PREMIUM_RENEWABLE_PROFILE)
                    }
                    collectedSubscriptions.hasPrepaidBasic == true &&
                            collectedSubscriptions.hasPrepaidPremium == false -> {
                        _destinationScreen.postValue(DestinationScreen.BASIC_PREPAID_PROFILE_SCREEN)
                    }
                    collectedSubscriptions.hasPrepaidPremium == true &&
                            collectedSubscriptions.hasPrepaidBasic == false -> {
                        _destinationScreen.postValue(
                            DestinationScreen.PREMIUM_PREPAID_PROFILE_SCREEN
                        )
                    }
                    else -> {
                        _destinationScreen.postValue(DestinationScreen.SUBSCRIPTIONS_OPTIONS_SCREEN)
                    }
                }
            }

        }
    }

    /**
     * Retrieves all eligible base plans and offers using tags from ProductDetails.
     *
     * @param offerDetails offerDetails from a ProductDetails returned by the library.
     * @param tag string representing tags associated with offers and base plans.
     *
     * @return the eligible offers and base plans in a list.
     *
     */
    private fun retrieveEligibleOffers(
        offerDetails: MutableList<ProductDetails.SubscriptionOfferDetails>,
        tag: String
    ): List<ProductDetails.SubscriptionOfferDetails> {
        val eligibleOffers = emptyList<ProductDetails.SubscriptionOfferDetails>().toMutableList()
        offerDetails.forEach { offerDetail ->
            if (offerDetail.offerTags.contains(tag)) {
                eligibleOffers.add(offerDetail)
            }
        }

        return eligibleOffers
    }

    /**
     * Calculates the lowest priced offer amongst all eligible offers.
     * In this implementation the lowest price of all offers' pricing phases is returned.
     * It's possible the logic can be implemented differently.
     * For example, the lowest average price in terms of month could be returned instead.
     *
     * @param offerDetails List of of eligible offers and base plans.
     *
     * @return the offer id token of the lowest priced offer.
     */
    private fun leastPricedOfferToken(
        offerDetails: List<ProductDetails.SubscriptionOfferDetails>
    ): String {
        var offerToken = String()
        var leastPricedOffer: ProductDetails.SubscriptionOfferDetails
        var lowestPrice = Int.MAX_VALUE

        if (!offerDetails.isNullOrEmpty()) {
            for (offer in offerDetails) {
                for (price in offer.pricingPhases.pricingPhaseList) {
                    if (price.priceAmountMicros < lowestPrice) {
                        lowestPrice = price.priceAmountMicros.toInt()
                        leastPricedOffer = offer
                        offerToken = leastPricedOffer.offerToken
                    }
                }
            }
        }
        return offerToken
    }

    /**
     * BillingFlowParams Builder for upgrades and downgrades.
     *
     * @param productDetails ProductDetails object returned by the library.
     * @param offerToken the least priced offer's offer id token returned by
     * [leastPricedOfferToken].
     * @param oldToken the purchase token of the subscription purchase being upgraded or downgraded.
     *
     * @return [BillingFlowParams] builder.
     */
    private fun upDowngradeBillingFlowParamsBuilder(
        productDetails: ProductDetails,
        offerToken: String,
        oldToken: String
    ): BillingFlowParams {
        return BillingFlowParams.newBuilder().setProductDetailsParamsList(
            listOf(
                BillingFlowParams.ProductDetailsParams.newBuilder()
                    .setProductDetails(productDetails)
                    .setOfferToken(offerToken)
                    .build()
            )
        ).setSubscriptionUpdateParams(
            BillingFlowParams.SubscriptionUpdateParams.newBuilder()
                .setOldPurchaseToken(oldToken)
                .setReplaceProrationMode(
                    BillingFlowParams.ProrationMode.IMMEDIATE_AND_CHARGE_FULL_PRICE
                )
                .build()
        ).build()
    }

    /**
     * BillingFlowParams Builder for normal purchases.
     *
     * @param productDetails ProductDetails object returned by the library.
     * @param offerToken the least priced offer's offer id token returned by
     * [leastPricedOfferToken].
     *
     * @return [BillingFlowParams] builder.
     */
    private fun billingFlowParamsBuilder(
        productDetails: ProductDetails,
        offerToken: String
    ): BillingFlowParams.Builder {
        return BillingFlowParams.newBuilder().setProductDetailsParamsList(
            listOf(
                BillingFlowParams.ProductDetailsParams.newBuilder()
                    .setProductDetails(productDetails)
                    .setOfferToken(offerToken)
                    .build()
            )
        )
    }

    /**
     * Use the Google Play Billing Library to make a purchase.
     *
     * @param productDetails ProductDetails object returned by the library.
     * @param currentPurchases List of current [Purchase] objects needed for upgrades or downgrades.
     * @param billingClient Instance of [IapBillingClientWrapper].
     * @param activity [Activity] instance.
     * @param tag String representing tags associated with offers and base plans.
     */
    fun buy(
        productDetails: ProductDetails,
        currentPurchases: List<Purchase>?,
        activity: Activity,
        tag: String
    ) {
        val offers =
            productDetails.subscriptionOfferDetails?.let {
                retrieveEligibleOffers(
                    offerDetails = it,
                    tag = "Rareprob Product Purchase"
                )
            }
        val offerToken = offers?.let { leastPricedOfferToken(it) }
        val oldPurchaseToken: String

        // Get current purchase. In this app, a user can only have one current purchase at
        // any given time.
        if (!currentPurchases.isNullOrEmpty() &&
            currentPurchases.size == MAX_CURRENT_PURCHASES_ALLOWED
        ) {
            // This either an upgrade, downgrade, or conversion purchase.
            val currentPurchase = currentPurchases.first()

            // Get the token from current purchase.
            oldPurchaseToken = currentPurchase.purchaseToken

            val billingParams = offerToken?.let {
                upDowngradeBillingFlowParamsBuilder(
                    productDetails = productDetails,
                    offerToken = it,
                    oldToken = oldPurchaseToken
                )
            }

            if (billingParams != null) {
                billingClient.launchBillingFlow(
                    activity,
                    billingParams
                )
            }
        } else if (currentPurchases == null) {
            // This is a normal purchase.
//            val billingParams = offerToken?.let {
//                billingFlowParamsBuilder(
//                    productDetails = productDetails,
//                    offerToken = it
//                )
//            }

            val billingParams =
                billingFlowParamsBuilder(
                    productDetails = productDetails,
                    offerToken = ""
                )

            if (billingParams != null) {
                billingClient.launchBillingFlow(
                    activity,
                    billingParams.build()
                )
            }
        } else if (!currentPurchases.isNullOrEmpty() &&
            currentPurchases.size > MAX_CURRENT_PURCHASES_ALLOWED
        ) {
            // The developer has allowed users  to have more than 1 purchase, so they need to
            /// implement a logic to find which one to use.
            Log.d(TAG, "User has more than 1 current purchase.")
        }
    }

    // When an activity is destroyed the viewModel's onCleared is called, so we terminate the
    // billing connection.
    override fun onCleared() {
        billingClient.terminateBillingConnection()
    }

    fun persistRecentlyPurchasedProduct(purchasedProductId: String){
        viewModelScope.launch {
            _isPremiumUserFlow.value = true
            billingClient.persistPurchasedProduct(purchasedProductId)
        }
    }
    /**
     * Enum representing the various screens a user can be redirected to.
     */
    enum class DestinationScreen {
        SUBSCRIPTIONS_OPTIONS_SCREEN,
        BASIC_PREPAID_PROFILE_SCREEN,
        BASIC_RENEWABLE_PROFILE,
        PREMIUM_PREPAID_PROFILE_SCREEN,
        PREMIUM_RENEWABLE_PROFILE;
    }

    companion object {
        private const val TAG: String = "MainViewModel"

        private const val MAX_CURRENT_PURCHASES_ALLOWED = 1
    }

    sealed class UIEvent {
        data class ShowSnackbar(val message: String) : UIEvent()
    }
}
