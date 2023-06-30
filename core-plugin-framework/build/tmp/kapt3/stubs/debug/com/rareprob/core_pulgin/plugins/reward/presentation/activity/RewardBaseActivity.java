package com.rareprob.core_pulgin.plugins.reward.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\nJ2\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011J\u0014\u0010\u0013\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/activity/RewardBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "coinCollectDialog", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/dialog/CoinCollectDialog;", "rewardExchangeDialog", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/dialog/RewardExchangeDialog;", "rewardExchangeFailDialog", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/dialog/RewardExchangeFailDialog;", "onSetResult", "", "showCoinCollectDialog", "showRewardExchangeDialog", "currentThemeCoinCount", "", "totalEarnedCoins", "redeemSuccessCallback", "Lkotlin/Function0;", "redeemFailureCallback", "showRewardExchangeFailDialog", "unlockForFreeCallback", "core-plugin-framework_debug"})
public abstract class RewardBaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog coinCollectDialog;
    private com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog rewardExchangeDialog;
    private com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog rewardExchangeFailDialog;
    private java.util.HashMap _$_findViewCache;
    
    public RewardBaseActivity() {
        super();
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
}