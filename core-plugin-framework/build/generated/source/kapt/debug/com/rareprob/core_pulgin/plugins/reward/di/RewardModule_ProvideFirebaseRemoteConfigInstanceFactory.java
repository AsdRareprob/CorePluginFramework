// Generated by Dagger (https://dagger.dev).
package com.rareprob.core_pulgin.plugins.reward.di;

import android.app.Application;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RewardModule_ProvideFirebaseRemoteConfigInstanceFactory implements Factory<FirebaseRemoteConfig> {
  private final Provider<Application> applicationProvider;

  public RewardModule_ProvideFirebaseRemoteConfigInstanceFactory(
      Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public FirebaseRemoteConfig get() {
    return provideFirebaseRemoteConfigInstance(applicationProvider.get());
  }

  public static RewardModule_ProvideFirebaseRemoteConfigInstanceFactory create(
      Provider<Application> applicationProvider) {
    return new RewardModule_ProvideFirebaseRemoteConfigInstanceFactory(applicationProvider);
  }

  public static FirebaseRemoteConfig provideFirebaseRemoteConfigInstance(Application application) {
    return Preconditions.checkNotNullFromProvides(RewardModule.INSTANCE.provideFirebaseRemoteConfigInstance(application));
  }
}