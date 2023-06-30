package com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.rareprob.core_pulgin.R;
import com.rareprob.core_pulgin.core.base.CoreBaseActivity;
import com.rareprob.core_pulgin.core.base.NetworkUtils;
import com.rareprob.core_pulgin.core.base.extention.*;
import com.rareprob.core_pulgin.core.utils.AppUtils;
import com.rareprob.core_pulgin.plugins.payment.FeatureInfo;
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.InAppProductData;
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData;
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.PurchaseRestoreState;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.parcel.Parcelize;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002&\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006("}, d2 = {"Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingPurchaseRestoreActivity;", "Lcom/rareprob/core_pulgin/core/base/CoreBaseActivity;", "()V", "btnDone", "Landroid/widget/Button;", "lottieRestoreError", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieRestoreLoading", "lottieRestoreSuccessful", "params", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingPurchaseRestoreActivity$Params;", "getParams", "()Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingPurchaseRestoreActivity$Params;", "params$delegate", "Lkotlin/Lazy;", "productDataList", "", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/data/model/ProductListingData;", "tvMsg", "Landroid/widget/TextView;", "viewModel", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingViewModel;", "getViewModel", "()Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingViewModel;", "viewModel$delegate", "initUi", "", "launchIapBillingActivity", "onClickBtn", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailurePurchaseRestore", "onSetResult", "onSuccessPurchaseRestore", "setupDataList", "Companion", "Params", "core-plugin-framework_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class IapBillingPurchaseRestoreActivity extends com.rareprob.core_pulgin.core.base.CoreBaseActivity {
    private final kotlin.Lazy params$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingPurchaseRestoreActivity.Companion Companion = null;
    public static final int RequestCode = 20000;
    private static final java.lang.String PARAMS = "params";
    private final kotlin.Lazy viewModel$delegate = null;
    private android.widget.Button btnDone;
    private android.widget.TextView tvMsg;
    private java.util.List<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData> productDataList;
    private com.airbnb.lottie.LottieAnimationView lottieRestoreLoading;
    private com.airbnb.lottie.LottieAnimationView lottieRestoreSuccessful;
    private com.airbnb.lottie.LottieAnimationView lottieRestoreError;
    private java.util.HashMap _$_findViewCache;
    
    public IapBillingPurchaseRestoreActivity() {
        super();
    }
    
    private final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingPurchaseRestoreActivity.Params getParams() {
        return null;
    }
    
    private final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi() {
    }
    
    private final void setupDataList() {
    }
    
    private final void onSuccessPurchaseRestore() {
    }
    
    private final void onFailurePurchaseRestore() {
    }
    
    private final void launchIapBillingActivity() {
    }
    
    private final void onSetResult() {
    }
    
    public final void onClickBtn(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingPurchaseRestoreActivity$Params;", "Landroid/os/Parcelable;", "defaultLocalPackJson", "", "(Ljava/lang/String;)V", "getDefaultLocalPackJson", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core-plugin-framework_debug"})
    public static final class Params implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String defaultLocalPackJson = null;
        public static final android.os.Parcelable.Creator<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingPurchaseRestoreActivity.Params> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingPurchaseRestoreActivity.Params copy(@org.jetbrains.annotations.NotNull()
        java.lang.String defaultLocalPackJson) {
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
        
        public Params() {
            super();
        }
        
        public Params(@org.jetbrains.annotations.NotNull()
        java.lang.String defaultLocalPackJson) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDefaultLocalPackJson() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingPurchaseRestoreActivity.Params> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingPurchaseRestoreActivity.Params createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingPurchaseRestoreActivity.Params[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Always start this activity as a sub activity
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingPurchaseRestoreActivity$Companion;", "", "()V", "PARAMS", "", "RequestCode", "", "getLaunchIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "params", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingPurchaseRestoreActivity$Params;", "launchForResult", "", "Landroid/app/Activity;", "requestCode", "core-plugin-framework_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void launchForResult(@org.jetbrains.annotations.NotNull()
        android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull()
        com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingPurchaseRestoreActivity.Params params) {
        }
        
        private final android.content.Intent getLaunchIntent(android.content.Context context, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingPurchaseRestoreActivity.Params params) {
            return null;
        }
    }
}