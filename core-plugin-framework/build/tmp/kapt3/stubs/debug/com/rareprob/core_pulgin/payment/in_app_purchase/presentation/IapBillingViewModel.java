package com.rareprob.core_pulgin.payment.in_app_purchase.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0003YZ[B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\bH\u0002J.\u0010C\u001a\u00020D2\u0006\u0010@\u001a\u00020A2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010\u00192\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\bJ\u000e\u0010I\u001a\u00020D2\u0006\u0010J\u001a\u00020\bJ\u0006\u0010K\u001a\u00020DJ\u0006\u0010L\u001a\u00020DJ\u0016\u0010M\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u0019H\u0002J\b\u0010P\u001a\u00020DH\u0014J\u000e\u0010Q\u001a\u00020D2\u0006\u0010R\u001a\u00020\bJ$\u0010S\u001a\b\u0012\u0004\u0012\u00020O0\u00192\f\u0010N\u001a\b\u0012\u0004\u0012\u00020O0T2\u0006\u0010H\u001a\u00020\bH\u0002J\u0018\u0010U\u001a\u00020D2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J \u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\b2\u0006\u0010X\u001a\u00020\bH\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0004\n\u0002\b\tR\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u00160\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u00190&\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120-\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\f01\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00102R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\f01\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001901\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00102R#\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u001601\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001901\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u000e\u0010:\u001a\u00020;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\\"}, d2 = {"Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "coreDatabase", "Lcom/rareprob/core_pulgin/core/base/CoreDatabase;", "(Landroid/app/Application;Lcom/rareprob/core_pulgin/core/base/CoreDatabase;)V", "TAG", "", "TAG$1", "_billingConnectionState", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_destinationScreen", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingViewModel$DestinationScreen;", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingViewModel$UIEvent;", "_isPremiumUserFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_purchasedProductMap", "", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/data/model/InAppProductData;", "_rcProductItemList", "", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/data/model/ProductListingData;", "billingClient", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingClientWrapper;", "getBillingClient", "()Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingClientWrapper;", "setBillingClient", "(Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingClientWrapper;)V", "billingConnectionState", "Landroidx/lifecycle/LiveData;", "getBillingConnectionState", "()Landroidx/lifecycle/LiveData;", "currentPurchasesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/android/billingclient/api/Purchase;", "getCurrentPurchasesFlow", "()Lkotlinx/coroutines/flow/Flow;", "destinationScreen", "getDestinationScreen", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "isNewPurchaseAcknowledged", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isPremiumUserFlow", "productsForSaleFlows", "getProductsForSaleFlows", "purchasedProductMap", "getPurchasedProductMap", "rcProductItemList", "getRcProductItemList", "repo", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/domain/repository/IapBillingDataRepository;", "userCurrentSubscriptionFlow", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/data/model/MainState;", "billingFlowParamsBuilder", "Lcom/android/billingclient/api/BillingFlowParams$Builder;", "productDetails", "Lcom/android/billingclient/api/ProductDetails;", "offerToken", "buy", "", "currentPurchases", "activity", "Landroid/app/Activity;", "tag", "getInAppPacksFromRc", "defaultLocalPackJson", "getPurchasedItemsList", "isPremiumUser", "leastPricedOfferToken", "offerDetails", "Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;", "onCleared", "persistRecentlyPurchasedProduct", "purchasedProductId", "retrieveEligibleOffers", "", "startBillingConnection", "upDowngradeBillingFlowParamsBuilder", "Lcom/android/billingclient/api/BillingFlowParams;", "oldToken", "Companion", "DestinationScreen", "UIEvent", "core-plugin-framework_debug"})
public final class IapBillingViewModel extends androidx.lifecycle.AndroidViewModel {
    private final android.app.Application application = null;
    private final com.rareprob.core_pulgin.core.base.CoreDatabase coreDatabase = null;
    private final java.lang.String TAG$1 = "InAppPurchaseViewModel";
    @org.jetbrains.annotations.NotNull()
    private com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingClientWrapper billingClient;
    private com.rareprob.core_pulgin.payment.in_app_purchase.domain.repository.IapBillingDataRepository repo;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _billingConnectionState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> billingConnectionState = null;
    private final androidx.lifecycle.MutableLiveData<com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingViewModel.DestinationScreen> _destinationScreen = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingViewModel.DestinationScreen> destinationScreen = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingViewModel.UIEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingViewModel.UIEvent> eventFlow = null;
    
    /**
     * Prepare ProductItemList from Remote config
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData>> _rcProductItemList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData>> rcProductItemList = null;
    
    /**
     * Fetched already purchased product from db
     * or iab billing restore data
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.rareprob.core_pulgin.payment.in_app_purchase.data.model.InAppProductData>> _purchasedProductMap = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.Map<java.lang.String, com.rareprob.core_pulgin.payment.in_app_purchase.data.model.InAppProductData>> purchasedProductMap = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData>> productsForSaleFlows = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isNewPurchaseAcknowledged = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isPremiumUserFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPremiumUserFlow = null;
    private final kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.MainState> userCurrentSubscriptionFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.android.billingclient.api.Purchase>> currentPurchasesFlow = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingViewModel.Companion Companion = null;
    private static final java.lang.String TAG = "MainViewModel";
    private static final int MAX_CURRENT_PURCHASES_ALLOWED = 1;
    
    @javax.inject.Inject()
    public IapBillingViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.core.base.CoreDatabase coreDatabase) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingClientWrapper getBillingClient() {
        return null;
    }
    
    public final void setBillingClient(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingClientWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getBillingConnectionState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingViewModel.DestinationScreen> getDestinationScreen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingViewModel.UIEvent> getEventFlow() {
        return null;
    }
    
    private final void startBillingConnection(java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData> rcProductItemList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData>> getRcProductItemList() {
        return null;
    }
    
    public final void getInAppPacksFromRc(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultLocalPackJson) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.Map<java.lang.String, com.rareprob.core_pulgin.payment.in_app_purchase.data.model.InAppProductData>> getPurchasedProductMap() {
        return null;
    }
    
    public final void getPurchasedItemsList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData>> getProductsForSaleFlows() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isNewPurchaseAcknowledged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPremiumUserFlow() {
        return null;
    }
    
    public final void isPremiumUser() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.android.billingclient.api.Purchase>> getCurrentPurchasesFlow() {
        return null;
    }
    
    /**
     * Retrieves all eligible base plans and offers using tags from ProductDetails.
     *
     * @param offerDetails offerDetails from a ProductDetails returned by the library.
     * @param tag string representing tags associated with offers and base plans.
     *
     * @return the eligible offers and base plans in a list.
     */
    private final java.util.List<com.android.billingclient.api.ProductDetails.SubscriptionOfferDetails> retrieveEligibleOffers(java.util.List<com.android.billingclient.api.ProductDetails.SubscriptionOfferDetails> offerDetails, java.lang.String tag) {
        return null;
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
    private final java.lang.String leastPricedOfferToken(java.util.List<com.android.billingclient.api.ProductDetails.SubscriptionOfferDetails> offerDetails) {
        return null;
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
    private final com.android.billingclient.api.BillingFlowParams upDowngradeBillingFlowParamsBuilder(com.android.billingclient.api.ProductDetails productDetails, java.lang.String offerToken, java.lang.String oldToken) {
        return null;
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
    private final com.android.billingclient.api.BillingFlowParams.Builder billingFlowParamsBuilder(com.android.billingclient.api.ProductDetails productDetails, java.lang.String offerToken) {
        return null;
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
    public final void buy(@org.jetbrains.annotations.NotNull()
    com.android.billingclient.api.ProductDetails productDetails, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.android.billingclient.api.Purchase> currentPurchases, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void persistRecentlyPurchasedProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String purchasedProductId) {
    }
    
    /**
     * Enum representing the various screens a user can be redirected to.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingViewModel$DestinationScreen;", "", "(Ljava/lang/String;I)V", "SUBSCRIPTIONS_OPTIONS_SCREEN", "BASIC_PREPAID_PROFILE_SCREEN", "BASIC_RENEWABLE_PROFILE", "PREMIUM_PREPAID_PROFILE_SCREEN", "PREMIUM_RENEWABLE_PROFILE", "core-plugin-framework_debug"})
    public static enum DestinationScreen {
        /*public static final*/ SUBSCRIPTIONS_OPTIONS_SCREEN /* = new SUBSCRIPTIONS_OPTIONS_SCREEN() */,
        /*public static final*/ BASIC_PREPAID_PROFILE_SCREEN /* = new BASIC_PREPAID_PROFILE_SCREEN() */,
        /*public static final*/ BASIC_RENEWABLE_PROFILE /* = new BASIC_RENEWABLE_PROFILE() */,
        /*public static final*/ PREMIUM_PREPAID_PROFILE_SCREEN /* = new PREMIUM_PREPAID_PROFILE_SCREEN() */,
        /*public static final*/ PREMIUM_RENEWABLE_PROFILE /* = new PREMIUM_RENEWABLE_PROFILE() */;
        
        DestinationScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingViewModel$UIEvent;", "", "()V", "ShowSnackbar", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingViewModel$UIEvent$ShowSnackbar;", "core-plugin-framework_debug"})
    public static abstract class UIEvent {
        
        private UIEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingViewModel$UIEvent$ShowSnackbar;", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingViewModel$UIEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-plugin-framework_debug"})
        public static final class ShowSnackbar extends com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingViewModel.UIEvent {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.rareprob.core_pulgin.payment.in_app_purchase.presentation.IapBillingViewModel.UIEvent.ShowSnackbar copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ShowSnackbar(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingViewModel$Companion;", "", "()V", "MAX_CURRENT_PURCHASES_ALLOWED", "", "TAG", "", "core-plugin-framework_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}