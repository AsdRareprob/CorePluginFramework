package com.rareprob.core_pulgin.plugins.reward.presentation.activity;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardPreferenceManager;
import com.rareprob.core_pulgin.plugins.reward.data.repository.RewardRepositoryImpl;
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0004J\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/activity/RewardBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "coinCollectDialog", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/dialog/CoinCollectDialog;", "repository", "Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "getRepository", "()Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "setRepository", "(Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;)V", "onSetResult", "", "persistWatchVideoTaskProgressData", "context", "Landroid/content/Context;", "watchStartTime", "", "showCoinCollectDialog", "core-plugin-framework_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public class RewardBaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository;
    private com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog coinCollectDialog;
    private java.util.HashMap _$_findViewCache;
    
    public RewardBaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository p0) {
    }
    
    public final void showCoinCollectDialog() {
    }
    
    private final void onSetResult() {
    }
    
    protected final void persistWatchVideoTaskProgressData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long watchStartTime) {
    }
}