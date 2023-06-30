package com.rareprob.core_pulgin.plugins.reward.domain.use_case;

import android.content.Context;
import com.rareprob.core_pulgin.core.utils.Resource;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData;
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/domain/use_case/ThemeUseCase;", "", "repository", "Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "(Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;)V", "getData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rareprob/core_pulgin/core/utils/Resource;", "", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ThemeData;", "rckey", "", "context", "Landroid/content/Context;", "core-plugin-framework_debug"})
public final class ThemeUseCase {
    private final com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository = null;
    
    public ThemeUseCase(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.Map<java.lang.Long, com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData>>> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String rckey, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
}