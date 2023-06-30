package com.rareprob.core_pulgin.plugins.reward.presentation.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.rareprob.core_pulgin.R;
import com.rareprob.core_pulgin.core.base.data.AppData;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType.CoinExchangeViewType;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010\u0014\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0015R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010\u0016\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0017R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010\u0018\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0019R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010\u001a\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u001bR\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013H\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0013H\u0002J\b\u0010%\u001a\u00020\u0010H\u0002J\b\u0010&\u001a\u00020\u0010H\u0002J\u0018\u0010\'\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010(\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006/"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/rareprob/core_pulgin/core/base/data/AppData;", "itemCallbackListener", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$ItemCallbackListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$ItemCallbackListener;)V", "getItemCallbackListener", "()Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$ItemCallbackListener;", "setItemCallbackListener", "(Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$ItemCallbackListener;)V", "bindDataToViews", "", "viewHolder", "position", "", "bindMusicLyricsDataToViews", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$MusicLyricsViewHolder;", "bindMusicThemeDataToViews", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$MusicThemeCardViewHolder;", "bindPalltoneThemeDataToViews", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$PalltoneThemeViewHolder;", "bindPremiumDataToViews", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$PremiumViewHolder;", "getItemCount", "getItemViewType", "getViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "inflateView", "Landroid/view/View;", "layoutId", "navigateToMusicThemeScreen", "navigateToThemeScreen", "onBindViewHolder", "onClickViewItem", "onCreateViewHolder", "ItemCallbackListener", "MusicLyricsViewHolder", "MusicThemeCardViewHolder", "PalltoneThemeViewHolder", "PremiumViewHolder", "core-plugin-framework_debug"})
public final class CoinExchangeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final android.content.Context context = null;
    private java.util.List<? extends com.rareprob.core_pulgin.core.base.data.AppData> dataList;
    @org.jetbrains.annotations.NotNull()
    private com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter.ItemCallbackListener itemCallbackListener;
    
    public CoinExchangeAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.rareprob.core_pulgin.core.base.data.AppData> dataList, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter.ItemCallbackListener itemCallbackListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter.ItemCallbackListener getItemCallbackListener() {
        return null;
    }
    
    public final void setItemCallbackListener(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter.ItemCallbackListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int position) {
    }
    
    private final void bindMusicThemeDataToViews(com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter.MusicThemeCardViewHolder viewHolder, int position) {
    }
    
    private final void bindMusicLyricsDataToViews(com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter.MusicLyricsViewHolder viewHolder, int position) {
    }
    
    private final void bindPalltoneThemeDataToViews(com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter.PalltoneThemeViewHolder viewHolder, int position) {
    }
    
    private final void bindPremiumDataToViews(com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter.PremiumViewHolder viewHolder, int position) {
    }
    
    private final void navigateToThemeScreen() {
    }
    
    private final void navigateToMusicThemeScreen() {
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ViewHolder getViewHolder(android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final android.view.View inflateView(android.view.ViewGroup parent, int layoutId) {
        return null;
    }
    
    private final void bindDataToViews(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void onClickViewItem(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$ItemCallbackListener;", "", "core-plugin-framework_debug"})
    public static abstract interface ItemCallbackListener {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$PremiumViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter;Landroid/view/View;)V", "llExchangePremiumReward", "Landroid/widget/LinearLayout;", "getLlExchangePremiumReward", "()Landroid/widget/LinearLayout;", "setLlExchangePremiumReward", "(Landroid/widget/LinearLayout;)V", "core-plugin-framework_debug"})
    public final class PremiumViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llExchangePremiumReward;
        
        public PremiumViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlExchangePremiumReward() {
            return null;
        }
        
        public final void setLlExchangePremiumReward(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$PalltoneThemeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter;Landroid/view/View;)V", "core-plugin-framework_debug"})
    public final class PalltoneThemeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public PalltoneThemeViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$MusicLyricsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter;Landroid/view/View;)V", "core-plugin-framework_debug"})
    public final class MusicLyricsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public MusicLyricsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$MusicThemeCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter;Landroid/view/View;)V", "llExchangeMusicThemeReward", "Landroid/widget/LinearLayout;", "getLlExchangeMusicThemeReward", "()Landroid/widget/LinearLayout;", "setLlExchangeMusicThemeReward", "(Landroid/widget/LinearLayout;)V", "core-plugin-framework_debug"})
    public final class MusicThemeCardViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llExchangeMusicThemeReward;
        
        public MusicThemeCardViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlExchangeMusicThemeReward() {
            return null;
        }
        
        public final void setLlExchangeMusicThemeReward(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
    }
}