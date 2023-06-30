package com.rareprob.core_pulgin.plugins.reward.domain.use_case;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.rareprob.core_pulgin.core.utils.Resource;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData;
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/domain/use_case/RewardUseCase;", "", "remoteConfigInstance", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "repository", "Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;)V", "getData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rareprob/core_pulgin/core/utils/Resource;", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ReferralData;", "rckey", "", "context", "Landroid/content/Context;", "core-plugin-framework_debug"})
public final class RewardUseCase {
    private final com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfigInstance = null;
    private final com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository = null;
    
    public RewardUseCase(@org.jetbrains.annotations.NotNull()
    com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfigInstance, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData>>> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String rckey, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
}