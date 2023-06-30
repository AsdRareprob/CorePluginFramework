package com.rareprob.core_pulgin.plugins.reward.presentation;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem;
import com.rareprob.core_pulgin.plugins.reward.presentation.fragment.CoinExchangeFragment;
import com.rareprob.core_pulgin.plugins.reward.presentation.fragment.EarnCoinFragment;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t\u00a2\u0006\u0002\u0010\rJ\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016R,\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/ViewPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "mNumOfTabs", "", "mContext", "Landroid/content/Context;", "activityCallbackListener", "Lkotlin/Function2;", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "Landroid/view/View;", "", "(Landroidx/fragment/app/FragmentManager;ILandroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "getActivityCallbackListener", "()Lkotlin/jvm/functions/Function2;", "setActivityCallbackListener", "(Lkotlin/jvm/functions/Function2;)V", "fragments", "", "Landroidx/fragment/app/Fragment;", "[Landroidx/fragment/app/Fragment;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "getCount", "getItem", "position", "instantiateItem", "", "container", "Landroid/view/ViewGroup;", "saveState", "Landroid/os/Parcelable;", "core-plugin-framework_debug"})
public final class ViewPagerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
    private int mNumOfTabs;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> activityCallbackListener;
    private androidx.fragment.app.Fragment[] fragments;
    
    public ViewPagerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm, int mNumOfTabs, @org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> activityCallbackListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, android.view.View, kotlin.Unit> getActivityCallbackListener() {
        return null;
    }
    
    public final void setActivityCallbackListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment getItem(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.Parcelable saveState() {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
}