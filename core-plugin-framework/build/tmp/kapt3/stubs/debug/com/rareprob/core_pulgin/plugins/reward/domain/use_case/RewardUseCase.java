package com.rareprob.core_pulgin.plugins.reward.domain.use_case;

import android.content.Context;
import com.rareprob.core_pulgin.core.utils.Resource;
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData;
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/domain/use_case/RewardUseCase;", "", "repository", "Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "(Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;)V", "getRepository", "()Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "claimRewardCoins", "", "context", "Landroid/content/Context;", "rewardData", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/entity/RewardEntity;", "getData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rareprob/core_pulgin/core/utils/Resource;", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardData;", "onRedeemRewardCoins", "redeemedCoin", "", "core-plugin-framework_debug"})
public final class RewardUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository = null;
    
    public RewardUseCase(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData>>> getData(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    public final void claimRewardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData) {
    }
    
    public final void onRedeemRewardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long redeemedCoin) {
    }
}