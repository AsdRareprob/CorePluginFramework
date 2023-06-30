package com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.rareprob.core_pulgin.R;
import com.rareprob.core_pulgin.core.base.extention.FONT;
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.InAppProductData;
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000234B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ$\u0010\u001d\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0010H\u0002J\u001c\u0010\"\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u0007H\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0010H\u0016J\b\u0010&\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\'\u001a\u00020\u0010J\u001c\u0010(\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u0010H\u0016J\u0016\u0010)\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0007J\u001c\u0010*\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0010H\u0017J$\u0010.\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0010H\u0002J\u0010\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u000201H\u0002J$\u00102\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u00065"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter$IapBillingViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/data/model/ProductListingData;", "itemCallbackListener", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter$ItemCallbackListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter$ItemCallbackListener;)V", "getItemCallbackListener", "()Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter$ItemCallbackListener;", "setItemCallbackListener", "(Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter$ItemCallbackListener;)V", "mPositon", "", "getMPositon", "()I", "setMPositon", "(I)V", "productStatusMap", "", "", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/data/model/InAppProductData;", "getProductStatusMap", "()Ljava/util/Map;", "setProductStatusMap", "(Ljava/util/Map;)V", "bindDataToViews", "", "holder", "iapItem", "position", "calculatePriceAndSetData", "getFormattedPrice", "productPrice", "getItemCount", "getSelectedProduct", "getSelectedProductIndex", "onBindViewHolder", "onClickViewItem", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickListener", "setTypeFaceOpenSensSmBold", "textView", "Landroid/widget/TextView;", "setViewStatus", "IapBillingViewHolder", "ItemCallbackListener", "core-plugin-framework_debug"})
public final class IapBillingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.IapBillingViewHolder> {
    private final android.content.Context context = null;
    private java.util.List<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData> dataList;
    @org.jetbrains.annotations.NotNull()
    private com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.ItemCallbackListener itemCallbackListener;
    private int mPositon = -1;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.InAppProductData> productStatusMap;
    
    public IapBillingAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData> dataList, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.ItemCallbackListener itemCallbackListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.ItemCallbackListener getItemCallbackListener() {
        return null;
    }
    
    public final void setItemCallbackListener(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.ItemCallbackListener p0) {
    }
    
    public final int getMPositon() {
        return 0;
    }
    
    public final void setMPositon(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.InAppProductData> getProductStatusMap() {
        return null;
    }
    
    public final void setProductStatusMap(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.InAppProductData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData getSelectedProduct() {
        return null;
    }
    
    public final int getSelectedProductIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    @java.lang.Override()
    public com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.IapBillingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.IapBillingViewHolder holder, int position) {
    }
    
    private final void setViewStatus(com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.IapBillingViewHolder holder, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData iapItem, int position) {
    }
    
    private final void bindDataToViews(com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.IapBillingViewHolder holder, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData iapItem, int position) {
    }
    
    private final void calculatePriceAndSetData(com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.IapBillingViewHolder holder, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData iapItem) {
    }
    
    private final java.lang.String getFormattedPrice(java.lang.String productPrice) {
        return null;
    }
    
    private final void setClickListener(com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation.IapBillingAdapter.IapBillingViewHolder holder, com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData iapItem, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void onClickViewItem(int position, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData iapItem) {
    }
    
    private final void setTypeFaceOpenSensSmBold(android.widget.TextView textView) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter$ItemCallbackListener;", "", "togglePurchaseBtn", "", "buttonStatus", "", "core-plugin-framework_debug"})
    public static abstract interface ItemCallbackListener {
        
        public abstract void togglePurchaseBtn(boolean buttonStatus);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter$IapBillingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/presentation/IapBillingAdapter;Landroid/view/View;)V", "clParent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getClParent", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setClParent", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "radioButton", "Landroid/widget/RadioButton;", "getRadioButton", "()Landroid/widget/RadioButton;", "setRadioButton", "(Landroid/widget/RadioButton;)V", "tvPackName", "Landroid/widget/TextView;", "getTvPackName", "()Landroid/widget/TextView;", "setTvPackName", "(Landroid/widget/TextView;)V", "tvRecommended", "getTvRecommended", "setTvRecommended", "tvShowPrice", "getTvShowPrice", "setTvShowPrice", "tvStrikeThroughPrice", "getTvStrikeThroughPrice", "setTvStrikeThroughPrice", "tvValidity", "getTvValidity", "setTvValidity", "core-plugin-framework_debug"})
    public final class IapBillingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private androidx.constraintlayout.widget.ConstraintLayout clParent;
        @org.jetbrains.annotations.NotNull()
        private android.widget.RadioButton radioButton;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvPackName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvValidity;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvRecommended;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvShowPrice;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvStrikeThroughPrice;
        
        public IapBillingViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.widget.ConstraintLayout getClParent() {
            return null;
        }
        
        public final void setClParent(@org.jetbrains.annotations.NotNull()
        androidx.constraintlayout.widget.ConstraintLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RadioButton getRadioButton() {
            return null;
        }
        
        public final void setRadioButton(@org.jetbrains.annotations.NotNull()
        android.widget.RadioButton p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvPackName() {
            return null;
        }
        
        public final void setTvPackName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvValidity() {
            return null;
        }
        
        public final void setTvValidity(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvRecommended() {
            return null;
        }
        
        public final void setTvRecommended(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvShowPrice() {
            return null;
        }
        
        public final void setTvShowPrice(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvStrikeThroughPrice() {
            return null;
        }
        
        public final void setTvStrikeThroughPrice(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}