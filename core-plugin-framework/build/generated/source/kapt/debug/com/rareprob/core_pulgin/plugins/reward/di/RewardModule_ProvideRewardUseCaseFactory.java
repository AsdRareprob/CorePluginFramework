// Generated by Dagger (https://dagger.dev).
package com.rareprob.core_pulgin.plugins.reward.di;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository;
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.RewardUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RewardModule_ProvideRewardUseCaseFactory implements Factory<RewardUseCase> {
  private final Provider<RewardRepository> repositoryProvider;

  private final Provider<FirebaseRemoteConfig> remoteConfigInstanceProvider;

  public RewardModule_ProvideRewardUseCaseFactory(Provider<RewardRepository> repositoryProvider,
      Provider<FirebaseRemoteConfig> remoteConfigInstanceProvider) {
    this.repositoryProvider = repositoryProvider;
    this.remoteConfigInstanceProvider = remoteConfigInstanceProvider;
  }

  @Override
  public RewardUseCase get() {
    return provideRewardUseCase(repositoryProvider.get(), remoteConfigInstanceProvider.get());
  }

  public static RewardModule_ProvideRewardUseCaseFactory create(
      Provider<RewardRepository> repositoryProvider,
      Provider<FirebaseRemoteConfig> remoteConfigInstanceProvider) {
    return new RewardModule_ProvideRewardUseCaseFactory(repositoryProvider, remoteConfigInstanceProvider);
  }

  public static RewardUseCase provideRewardUseCase(RewardRepository repository,
      FirebaseRemoteConfig remoteConfigInstance) {
    return Preconditions.checkNotNullFromProvides(RewardModule.INSTANCE.provideRewardUseCase(repository, remoteConfigInstance));
  }
}
