package com.rareprob.core_pulgin.plugins.reward.presentation.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao;
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity;
import com.rareprob.core_pulgin.core.base.data.AppData;
import com.rareprob.core_pulgin.databinding.EarnCoinFragmentBinding;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem;
import com.rareprob.core_pulgin.plugins.reward.presentation.adapter.EarnCoinAdapter;
import com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils;
import kotlinx.coroutines.Dispatchers;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType.EarnCoinViewType;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0002J\b\u0010\u001e\u001a\u00020\u0007H\u0002J \u0010\u001f\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n` H\u0002J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0006H\u0002J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0006H\u0002J$\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0007H\u0016J \u0010-\u001a\u00020\u00072\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004J\u0018\u0010/\u001a\u00020\u00072\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\b\u00103\u001a\u00020\u0007H\u0002J\u0010\u00104\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0006H\u0002J$\u00105\u001a\u00020\u00072\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020:H\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006<"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/fragment/EarnCoinFragment;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/fragment/RewardBaseFragment;", "()V", "activityCallback", "Lkotlin/Function2;", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "Landroid/view/View;", "", "dataList", "Ljava/util/ArrayList;", "Lcom/rareprob/core_pulgin/core/base/data/AppData;", "getDataList", "()Ljava/util/ArrayList;", "mBinding", "Lcom/rareprob/core_pulgin/databinding/EarnCoinFragmentBinding;", "getMBinding", "()Lcom/rareprob/core_pulgin/databinding/EarnCoinFragmentBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "mEarnCoinAdapter", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/EarnCoinAdapter;", "viewModel", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel;", "getViewModel", "()Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel;", "viewModel$delegate", "getReferralItems", "rcKey", "", "handleUiEvents", "invalidateUi", "notifyAdapter", "Lkotlin/collections/ArrayList;", "onClickClaimCoin", "rewardItem", "view", "onClickEarnCoin", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setActivityCallbackListener", "activityCallbackListener1", "setupDataList", "referralItems", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ReferralData;", "showErrorMsg", "updateAdapter", "updateDataList", "completedTaskMap", "", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/entity/RewardEntity;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Companion", "core-plugin-framework_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class EarnCoinFragment extends com.rareprob.core_pulgin.plugins.reward.presentation.fragment.RewardBaseFragment {
    private final kotlin.Lazy mBinding$delegate = null;
    private com.rareprob.core_pulgin.plugins.reward.presentation.adapter.EarnCoinAdapter mEarnCoinAdapter;
    private final kotlin.Lazy viewModel$delegate = null;
    private kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> activityCallback;
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.plugins.reward.presentation.fragment.EarnCoinFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.rareprob.core_pulgin.core.base.data.AppData> dataList = null;
    private java.util.HashMap _$_findViewCache;
    
    public EarnCoinFragment() {
        super();
    }
    
    private final com.rareprob.core_pulgin.databinding.EarnCoinFragmentBinding getMBinding() {
        return null;
    }
    
    private final com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel getViewModel() {
        return null;
    }
    
    public final void setActivityCallbackListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem, ? super android.view.View, kotlin.Unit> activityCallbackListener1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * TODO : Data fetch code
     */
    private final void getReferralItems(java.lang.String rcKey) {
    }
    
    private final void handleUiEvents() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.rareprob.core_pulgin.core.base.data.AppData> getDataList() {
        return null;
    }
    
    private final void setupDataList(java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData> referralItems) {
    }
    
    private final void notifyAdapter(java.util.ArrayList<com.rareprob.core_pulgin.core.base.data.AppData> dataList) {
    }
    
    private final void onClickClaimCoin(com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem rewardItem, android.view.View view) {
    }
    
    /**
     * We rearrange Adapter ui once user claims coins
     * We place Claimed reward to bottom of list
     */
    private final void updateAdapter(android.view.View view) {
    }
    
    private final void onClickEarnCoin(com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem rewardItem, android.view.View view) {
    }
    
    private final void showErrorMsg() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void invalidateUi() {
    }
    
    private final void updateDataList(java.util.Map<java.lang.String, com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity> completedTaskMap, kotlinx.coroutines.CoroutineScope coroutineScope) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/fragment/EarnCoinFragment$Companion;", "", "()V", "newInstance", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/fragment/EarnCoinFragment;", "args", "Landroid/os/Bundle;", "core-plugin-framework_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.rareprob.core_pulgin.plugins.reward.presentation.fragment.EarnCoinFragment newInstance(@org.jetbrains.annotations.Nullable()
        android.os.Bundle args) {
            return null;
        }
    }
}