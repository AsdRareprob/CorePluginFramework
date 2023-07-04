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

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0004J\u0006\u0010\u0016\u001a\u00020\u0010J2\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bJ\u0014\u0010\u001d\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/activity/RewardBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "coinCollectDialog", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/dialog/CoinCollectDialog;", "repository", "Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "getRepository", "()Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "setRepository", "(Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;)V", "rewardExchangeDialog", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/dialog/RewardExchangeDialog;", "rewardExchangeFailDialog", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/dialog/RewardExchangeFailDialog;", "onSetResult", "", "persistWatchVideoTaskProgressData", "context", "Landroid/content/Context;", "watchStartTime", "", "showCoinCollectDialog", "showRewardExchangeDialog", "currentThemeCoinCount", "totalEarnedCoins", "redeemSuccessCallback", "Lkotlin/Function0;", "redeemFailureCallback", "showRewardExchangeFailDialog", "unlockForFreeCallback", "core-plugin-framework_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public class RewardBaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository;
    private com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog coinCollectDialog;
    private com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog rewardExchangeDialog;
    private com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog rewardExchangeFailDialog;
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
    
    public final void showRewardExchangeDialog(long currentThemeCoinCount, long totalEarnedCoins, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> redeemSuccessCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> redeemFailureCallback) {
    }
    
    public final void showRewardExchangeFailDialog(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> unlockForFreeCallback) {
    }
    
    private final void onSetResult() {
    }
    
    protected final void persistWatchVideoTaskProgressData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long watchStartTime) {
    }
}