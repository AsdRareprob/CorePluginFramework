package com.rareprob.core_pulgin.plugins.reward.presentation.activity;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.rareprob.core_pulgin.core.utils.AppPreferencesUtils;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardPreferenceManager;
import com.rareprob.core_pulgin.plugins.reward.data.repository.RewardRepositoryImpl;
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.CoinCollectDialog;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeDialog;
import com.rareprob.core_pulgin.plugins.reward.presentation.dialog.RewardExchangeFailDialog;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0004R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/activity/RewardBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "repository", "Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "getRepository", "()Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "setRepository", "(Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;)V", "persistWatchVideoTaskProgressData", "", "watchStartTime", "", "core-plugin-framework_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public class RewardBaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository;
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
    
    protected final void persistWatchVideoTaskProgressData(long watchStartTime) {
    }
}