package com.rareprob.core_pulgin.plugins.reward.data.local;

import android.content.Context;
import android.widget.TextView;
import com.google.firebase.FirebaseApp;
import com.rareprob.core_pulgin.core.utils.AppPreferencesUtils;
import com.rareprob.core_pulgin.plugins.reward.data.repository.RewardRepositoryImpl;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/data/local/RewardPreferenceManager;", "", "()V", "DEAFULT_REWARD_COINS", "", "getSavedCoins", "context", "Landroid/content/Context;", "saveCoins", "", "updatedTotalCoins", "setEarnedCoinsToView", "", "rewardTextView", "Landroid/widget/TextView;", "core-plugin-framework_debug"})
public final class RewardPreferenceManager {
    
    /**
     * We give 500 coins to user by default
     */
    private final long DEAFULT_REWARD_COINS = 100L;
    
    public RewardPreferenceManager() {
        super();
    }
    
    /**
     * Get total earned coins by a user
     */
    public final long getSavedCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0L;
    }
    
    public final void setEarnedCoinsToView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.TextView rewardTextView) {
    }
    
    /**
     * Persist total earned coins by a user
     */
    public final boolean saveCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long updatedTotalCoins) {
        return false;
    }
}