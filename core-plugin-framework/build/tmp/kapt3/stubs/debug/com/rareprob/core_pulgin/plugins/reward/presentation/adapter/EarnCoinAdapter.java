package com.rareprob.core_pulgin.plugins.reward.presentation.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.rareprob.core_pulgin.R;
import com.rareprob.core_pulgin.core.base.data.AppData;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType.EarnCoinViewType;
import kotlinx.android.synthetic.main.earn_coin_item_view.view.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0014\u0010\u0019\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R,\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012\u00a8\u0006#"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/EarnCoinAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/rareprob/core_pulgin/core/base/data/AppData;", "onClickEarnCoin", "Lkotlin/Function2;", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "Landroid/view/View;", "", "onClickClaimCoin", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getOnClickClaimCoin", "()Lkotlin/jvm/functions/Function2;", "setOnClickClaimCoin", "(Lkotlin/jvm/functions/Function2;)V", "getOnClickEarnCoin", "setOnClickEarnCoin", "getItemCount", "", "getItemViewType", "position", "invalidateAdapter", "notifyingDataList", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RewardItemVH", "TaskVH", "core-plugin-framework_debug"})
public final class EarnCoinAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final android.content.Context context = null;
    private java.util.List<? extends com.rareprob.core_pulgin.core.base.data.AppData> dataList;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> onClickEarnCoin;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> onClickClaimCoin;
    
    public EarnCoinAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.rareprob.core_pulgin.core.base.data.AppData> dataList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> onClickEarnCoin, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> onClickClaimCoin) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, android.view.View, kotlin.Unit> getOnClickEarnCoin() {
        return null;
    }
    
    public final void setOnClickEarnCoin(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, android.view.View, kotlin.Unit> getOnClickClaimCoin() {
        return null;
    }
    
    public final void setOnClickClaimCoin(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void invalidateAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.rareprob.core_pulgin.core.base.data.AppData> notifyingDataList) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013\u00a8\u0006%"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/EarnCoinAdapter$RewardItemVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/EarnCoinAdapter;Landroid/view/View;)V", "ivRewardIcon", "Landroid/widget/ImageView;", "getIvRewardIcon", "()Landroid/widget/ImageView;", "setIvRewardIcon", "(Landroid/widget/ImageView;)V", "taskIcon", "getTaskIcon", "setTaskIcon", "tvActionBtn", "Landroid/widget/TextView;", "getTvActionBtn", "()Landroid/widget/TextView;", "setTvActionBtn", "(Landroid/widget/TextView;)V", "tvClaimBtn", "getTvClaimBtn", "setTvClaimBtn", "tvRewardCount", "getTvRewardCount", "setTvRewardCount", "tvRewardTitle", "getTvRewardTitle", "setTvRewardTitle", "bindItems", "", "dataItem", "Lcom/rareprob/core_pulgin/core/base/data/AppData;", "loadBitmap", "rewardItem", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "setClaimStatusView", "core-plugin-framework_debug"})
    public final class RewardItemVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView taskIcon;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvRewardTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView ivRewardIcon;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvRewardCount;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvActionBtn;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvClaimBtn;
        
        public RewardItemVH(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getTaskIcon() {
            return null;
        }
        
        public final void setTaskIcon(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvRewardTitle() {
            return null;
        }
        
        public final void setTvRewardTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvRewardIcon() {
            return null;
        }
        
        public final void setIvRewardIcon(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvRewardCount() {
            return null;
        }
        
        public final void setTvRewardCount(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvActionBtn() {
            return null;
        }
        
        public final void setTvActionBtn(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvClaimBtn() {
            return null;
        }
        
        public final void setTvClaimBtn(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public final void bindItems(@org.jetbrains.annotations.NotNull()
        com.rareprob.core_pulgin.core.base.data.AppData dataItem) {
        }
        
        private final void setClaimStatusView(com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem rewardItem) {
        }
        
        private final void loadBitmap(com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem rewardItem) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/EarnCoinAdapter$TaskVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/EarnCoinAdapter;Landroid/view/View;)V", "tvRewardName", "Landroid/widget/TextView;", "getTvRewardName", "()Landroid/widget/TextView;", "setTvRewardName", "(Landroid/widget/TextView;)V", "bindItems", "", "dataItem", "Lcom/rareprob/core_pulgin/core/base/data/AppData;", "core-plugin-framework_debug"})
    public final class TaskVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvRewardName;
        
        public TaskVH(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvRewardName() {
            return null;
        }
        
        public final void setTvRewardName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public final void bindItems(@org.jetbrains.annotations.NotNull()
        com.rareprob.core_pulgin.core.base.data.AppData dataItem) {
        }
    }
}