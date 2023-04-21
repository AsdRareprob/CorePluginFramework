package com.rareprob.core_pulgin.payment.in_app_purchase.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u000fH\u0002J\u0016\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u001e\u0010/\u001a\u00020&2\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f03H\u0016J \u00104\u001a\u00020&2\u0006\u00100\u001a\u0002012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016J\u0019\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107JF\u00108\u001a\u00020&2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\t0:j\b\u0012\u0004\u0012\u00020\t`;2\u0016\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\t0:j\b\u0012\u0004\u0012\u00020\t`;H\u0002J\u001e\u0010=\u001a\u00020&2\b\b\u0001\u0010>\u001a\u00020\t2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\t0\u0015J\b\u0010@\u001a\u00020&H\u0002J\"\u0010A\u001a\u00020&2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\f0C2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015J\u0006\u0010D\u001a\u00020&J\u0018\u0010E\u001a\u00020&2\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020G\u0018\u000103H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u000e0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00150\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001dR#\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u000e0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00150\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006H"}, d2 = {"Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/IapBillingClientWrapper;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Lcom/android/billingclient/api/ProductDetailsResponseListener;", "context", "Landroid/content/Context;", "coreDatabase", "Lcom/rareprob/core_pulgin/core/base/CoreDatabase;", "(Landroid/content/Context;Lcom/rareprob/core_pulgin/core/base/CoreDatabase;)V", "TAG", "", "_isNewPurchaseAcknowledged", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_productWithProductDetails", "", "Lcom/android/billingclient/api/ProductDetails;", "_purchasedProductMap", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/data/model/InAppProductData;", "get_purchasedProductMap", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_purchases", "", "Lcom/android/billingclient/api/Purchase;", "_purchasesDetailNew", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/data/model/ProductListingData;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "isNewPurchaseAcknowledged", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "productWithProductDetails", "getProductWithProductDetails", "purchases", "getPurchases", "purchasesDetailNew", "getPurchasesDetailNew", "rcProductItemList", "acknowledgePurchases", "", "purchase", "getProductPrice", "productDetail", "launchBillingFlow", "activity", "Landroid/app/Activity;", "params", "Lcom/android/billingclient/api/BillingFlowParams;", "onProductDetailsResponse", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "productDetailsList", "", "onPurchasesUpdated", "persistPurchasedProduct", "purchasedProductId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareProductIdsList", "inAppTypeSkuItemList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "subscriptionTypeSkuItemList", "queryProductDetails", "productType", "skuList", "restorePurchase", "startBillingConnection", "billingConnectionState", "Landroidx/lifecycle/MutableLiveData;", "terminateBillingConnection", "updateProductPurchaseStatus", "p1", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "core-plugin-framework_debug"})
public final class IapBillingClientWrapper implements com.android.billingclient.api.PurchasesUpdatedListener, com.android.billingclient.api.ProductDetailsResponseListener {
    private final android.content.Context context = null;
    private final com.rareprob.core_pulgin.core.base.CoreDatabase coreDatabase = null;
    private final java.lang.String TAG = "BillingClient";
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.android.billingclient.api.ProductDetails>> _productWithProductDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.Map<java.lang.String, com.android.billingclient.api.ProductDetails>> productWithProductDetails = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData>> _purchasesDetailNew = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData>> purchasesDetailNew = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.android.billingclient.api.Purchase>> _purchases = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.android.billingclient.api.Purchase>> purchases = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isNewPurchaseAcknowledged = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isNewPurchaseAcknowledged = null;
    private final com.android.billingclient.api.BillingClient billingClient = null;
    private java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData> rcProductItemList;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.rareprob.core_pulgin.payment.in_app_purchase.data.model.InAppProductData>> _purchasedProductMap = null;
    
    public IapBillingClientWrapper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.core.base.CoreDatabase coreDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.Map<java.lang.String, com.android.billingclient.api.ProductDetails>> getProductWithProductDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData>> getPurchasesDetailNew() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.android.billingclient.api.Purchase>> getPurchases() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isNewPurchaseAcknowledged() {
        return null;
    }
    
    public final void startBillingConnection(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> billingConnectionState, @org.jetbrains.annotations.NotNull()
    java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData> rcProductItemList) {
    }
    
    /**
     * Get the product type list.
     * For every product we have product id and pack id for actual price and offer price.
     * For this we main two product id and map it to a original product id
     */
    private final void prepareProductIdsList(java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData> rcProductItemList, java.util.ArrayList<java.lang.String> inAppTypeSkuItemList, java.util.ArrayList<java.lang.String> subscriptionTypeSkuItemList) {
    }
    
    /**
     * Query Google Play Billing for products available to sell and present them in the UI
     * and Also Query Google Play Billing for existing purchases.
     * New purchases will be provided to PurchasesUpdatedListener.onPurchasesUpdated().
     */
    public final void queryProductDetails(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String productType, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> skuList) {
    }
    
    @java.lang.Override()
    public void onProductDetailsResponse(@org.jetbrains.annotations.NotNull()
    com.android.billingclient.api.BillingResult billingResult, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.billingclient.api.ProductDetails> productDetailsList) {
    }
    
    private final java.lang.String getProductPrice(com.android.billingclient.api.ProductDetails productDetail) {
        return null;
    }
    
    public final void launchBillingFlow(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.android.billingclient.api.BillingFlowParams params) {
    }
    
    @java.lang.Override()
    public void onPurchasesUpdated(@org.jetbrains.annotations.NotNull()
    com.android.billingclient.api.BillingResult billingResult, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.android.billingclient.api.Purchase> purchases) {
    }
    
    private final void acknowledgePurchases(com.android.billingclient.api.Purchase purchase) {
    }
    
    /**
     * Saving product info to db for future restore purpose
     */
    public final void terminateBillingConnection() {
    }
    
    /**
     * This function helps in restoring of already purchased items
     */
    private final void restorePurchase() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.rareprob.core_pulgin.payment.in_app_purchase.data.model.InAppProductData>> get_purchasedProductMap() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object persistPurchasedProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String purchasedProductId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void updateProductPurchaseStatus(java.util.List<com.android.billingclient.api.PurchaseHistoryRecord> p1) {
    }
}