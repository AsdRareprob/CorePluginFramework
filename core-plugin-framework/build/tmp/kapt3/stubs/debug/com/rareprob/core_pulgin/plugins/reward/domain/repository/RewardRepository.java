package com.rareprob.core_pulgin.plugins.reward.domain.repository;

import android.content.Context;
import com.rareprob.core_pulgin.core.utils.Resource;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J2\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u00040\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u000f"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "", "getReferralItems", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rareprob/core_pulgin/core/utils/Resource;", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ReferralData;", "rckey", "", "context", "Landroid/content/Context;", "getThemesData", "", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ThemeData;", "core-plugin-framework_debug"})
public abstract interface RewardRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData>>> getReferralItems(@org.jetbrains.annotations.NotNull()
    java.lang.String rckey, @org.jetbrains.annotations.Nullable()
    android.content.Context context);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.rareprob.core_pulgin.core.utils.Resource<java.util.Map<java.lang.Long, com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData>>> getThemesData(@org.jetbrains.annotations.NotNull()
    java.lang.String rckey, @org.jetbrains.annotations.Nullable()
    android.content.Context context);
}