// Generated by Dagger (https://dagger.dev).
package com.rareprob.core_pulgin.plugins.reward.presentation;

import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDatabase;
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.RewardUseCase;
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.ThemeUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RewardViewModel_Factory implements Factory<RewardViewModel> {
  private final Provider<RewardUseCase> rewardUseCaseProvider;

  private final Provider<ThemeUseCase> themeUseCaseProvider;

  private final Provider<RewardDatabase> dbProvider;

  public RewardViewModel_Factory(Provider<RewardUseCase> rewardUseCaseProvider,
      Provider<ThemeUseCase> themeUseCaseProvider, Provider<RewardDatabase> dbProvider) {
    this.rewardUseCaseProvider = rewardUseCaseProvider;
    this.themeUseCaseProvider = themeUseCaseProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public RewardViewModel get() {
    return newInstance(rewardUseCaseProvider.get(), themeUseCaseProvider.get(), dbProvider.get());
  }

  public static RewardViewModel_Factory create(Provider<RewardUseCase> rewardUseCaseProvider,
      Provider<ThemeUseCase> themeUseCaseProvider, Provider<RewardDatabase> dbProvider) {
    return new RewardViewModel_Factory(rewardUseCaseProvider, themeUseCaseProvider, dbProvider);
  }

  public static RewardViewModel newInstance(RewardUseCase rewardUseCase, ThemeUseCase themeUseCase,
      RewardDatabase db) {
    return new RewardViewModel(rewardUseCase, themeUseCase, db);
  }
}
