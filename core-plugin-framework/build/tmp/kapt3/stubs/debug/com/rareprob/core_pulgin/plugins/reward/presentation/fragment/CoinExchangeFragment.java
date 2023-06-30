package com.rareprob.core_pulgin.plugins.reward.presentation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.rareprob.core_pulgin.R;
import com.rareprob.core_pulgin.core.base.data.AppData;
import com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter;
import com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel;
import java.util.ArrayList;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType.CoinExchangeViewType;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/fragment/CoinExchangeFragment;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/fragment/RewardBaseFragment;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/adapter/CoinExchangeAdapter$ItemCallbackListener;", "()V", "loadingProgressbar", "Landroid/widget/ProgressBar;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewModel", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel;", "getDataList", "Ljava/util/ArrayList;", "Lcom/rareprob/core_pulgin/core/base/data/AppData;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setAdapter", "Companion", "core-plugin-framework_debug"})
public final class CoinExchangeFragment extends com.rareprob.core_pulgin.plugins.reward.presentation.fragment.RewardBaseFragment implements com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter.ItemCallbackListener {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel viewModel;
    private android.widget.ProgressBar loadingProgressbar;
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.plugins.reward.presentation.fragment.CoinExchangeFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public CoinExchangeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.util.ArrayList<com.rareprob.core_pulgin.core.base.data.AppData> getDataList() {
        return null;
    }
    
    private final void setAdapter() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/fragment/CoinExchangeFragment$Companion;", "", "()V", "newInstance", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/fragment/CoinExchangeFragment;", "args", "Landroid/os/Bundle;", "core-plugin-framework_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.rareprob.core_pulgin.plugins.reward.presentation.fragment.CoinExchangeFragment newInstance(@org.jetbrains.annotations.Nullable()
        android.os.Bundle args) {
            return null;
        }
    }
}