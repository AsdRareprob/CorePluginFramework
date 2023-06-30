package com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.rareprob.core_pulgin.R;
import com.rareprob.core_pulgin.core.base.CoreBaseActivity;
import com.rareprob.core_pulgin.core.base.extention.FONT;
import com.rareprob.core_pulgin.plugins.payment.FeatureInfo;
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.InAppProductData;
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.parcel.Parcelize;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002IJB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00101\u001a\u000202H\u0002J\u0012\u00103\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u000202H\u0002J\u0012\u00107\u001a\u0002022\b\u00108\u001a\u0004\u0018\u000109H\u0014J\b\u0010:\u001a\u000202H\u0002J,\u0010;\u001a\u0002022\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\u0014\b\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>H\u0002J\b\u0010A\u001a\u000202H\u0002J\b\u0010B\u001a\u000202H\u0002J\b\u0010C\u001a\u000202H\u0002J\b\u0010D\u001a\u000202H\u0002J\b\u0010E\u001a\u000202H\u0002J\u0010\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020HH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b.\u0010/\u00a8\u0006K"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingActivity;", "Lcom/rareprob/core_pulgin/core/base/CoreBaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter$ItemCallbackListener;", "()V", "dataItemsList", "Ljava/util/ArrayList;", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/data/model/ProductListingData;", "iapBillingAdapter", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter;", "ivClose", "Landroid/widget/ImageView;", "llPacksContainer", "Landroid/widget/LinearLayout;", "params", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingActivity$Params;", "getParams", "()Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingActivity$Params;", "params$delegate", "Lkotlin/Lazy;", "productDataList", "", "progressBarCyclic", "Landroid/widget/ProgressBar;", "purchaseCompleteDialog", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingCompleteDialog;", "purchaseProductBtn", "Landroid/widget/Button;", "selectedProduct", "getSelectedProduct", "()Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/data/model/ProductListingData;", "setSelectedProduct", "(Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/data/model/ProductListingData;)V", "subTitle", "Landroid/widget/TextView;", "title", "tvContinueWithAds", "tvCrop", "tvFilterDuplicate", "tvMusic", "tvNoAds", "tvPackLabel", "tvTheme", "tvTrash", "viewModel", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingViewModel;", "getViewModel", "()Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingViewModel;", "viewModel$delegate", "initUi", "", "onClick", "view", "Landroid/view/View;", "onClickBuyProduct", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSetResult", "setAdapter", "dataList", "productStatusMap", "", "", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/data/model/InAppProductData;", "setFont", "setListener", "setupDataList", "showAppSpecificFeature", "showPurchaseCompleteDialog", "togglePurchaseBtn", "buttonStatus", "", "Companion", "Params", "core-plugin-framework_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class IapBillingActivity extends com.rareprob.core_pulgin.core.base.CoreBaseActivity implements android.view.View.OnClickListener, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.ItemCallbackListener {
    private final kotlin.Lazy params$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingActivity.Companion Companion = null;
    public static final int RequestCode = 10000;
    private static final java.lang.String PARAMS = "params";
    private java.util.ArrayList<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData> dataItemsList;
    private com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter iapBillingAdapter;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.widget.Button purchaseProductBtn;
    private android.widget.TextView tvContinueWithAds;
    private android.widget.TextView title;
    private android.widget.TextView subTitle;
    private android.widget.TextView tvPackLabel;
    private android.widget.TextView tvTheme;
    private android.widget.TextView tvNoAds;
    private android.widget.TextView tvTrash;
    private android.widget.TextView tvMusic;
    private android.widget.TextView tvCrop;
    private android.widget.TextView tvFilterDuplicate;
    private android.widget.ProgressBar progressBarCyclic;
    private android.widget.LinearLayout llPacksContainer;
    private android.widget.ImageView ivClose;
    private java.util.List<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData> productDataList;
    
    /**
     * IT is called when item is clicked or Upgrade now btn is clicked
     */
    @org.jetbrains.annotations.Nullable()
    private com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData selectedProduct;
    private com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingCompleteDialog purchaseCompleteDialog;
    private java.util.HashMap _$_findViewCache;
    
    public IapBillingActivity() {
        super();
    }
    
    private final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingActivity.Params getParams() {
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
    
    private final void setFont() {
    }
    
    private final void setupDataList() {
    }
    
    private final void setListener() {
    }
    
    private final void setAdapter(java.util.List<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData> dataList, java.util.Map<java.lang.String, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.InAppProductData> productStatusMap) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData getSelectedProduct() {
        return null;
    }
    
    public final void setSelectedProduct(@org.jetbrains.annotations.Nullable()
    com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData p0) {
    }
    
    private final void onClickBuyProduct() {
    }
    
    @java.lang.Override()
    public void togglePurchaseBtn(boolean buttonStatus) {
    }
    
    private final void showPurchaseCompleteDialog() {
    }
    
    private final void onSetResult() {
    }
    
    private final void showAppSpecificFeature() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingActivity$Params;", "Landroid/os/Parcelable;", "defaultLocalPackJson", "", "(Ljava/lang/String;)V", "getDefaultLocalPackJson", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core-plugin-framework_debug"})
    public static final class Params implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String defaultLocalPackJson = null;
        public static final android.os.Parcelable.Creator<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingActivity.Params> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingActivity.Params copy(@org.jetbrains.annotations.NotNull()
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
        public static final class Creator implements android.os.Parcelable.Creator<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingActivity.Params> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingActivity.Params createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingActivity.Params[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Always start this activity as a sub activity
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingActivity$Companion;", "", "()V", "PARAMS", "", "RequestCode", "", "getLaunchIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "params", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingActivity$Params;", "launchForResult", "", "Landroid/app/Activity;", "requestCode", "core-plugin-framework_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void launchForResult(@org.jetbrains.annotations.NotNull()
        android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull()
        com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingActivity.Params params) {
        }
        
        private final android.content.Intent getLaunchIntent(android.content.Context context, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingActivity.Params params) {
            return null;
        }
    }
}