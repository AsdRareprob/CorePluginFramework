// Generated by Dagger (https://dagger.dev).
package com.rareprob.core_pulgin.core.notification;

import com.rareprob.core_pulgin.core.base.CoreDatabase;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FcmPushNotificationService_MembersInjector implements MembersInjector<FcmPushNotificationService> {
  private final Provider<CoreDatabase> coreDatabaseProvider;

  public FcmPushNotificationService_MembersInjector(Provider<CoreDatabase> coreDatabaseProvider) {
    this.coreDatabaseProvider = coreDatabaseProvider;
  }

  public static MembersInjector<FcmPushNotificationService> create(
      Provider<CoreDatabase> coreDatabaseProvider) {
    return new FcmPushNotificationService_MembersInjector(coreDatabaseProvider);
  }

  @Override
  public void injectMembers(FcmPushNotificationService instance) {
    injectCoreDatabase(instance, coreDatabaseProvider.get());
  }

  @InjectedFieldSignature("com.rareprob.core_pulgin.core.notification.FcmPushNotificationService.coreDatabase")
  public static void injectCoreDatabase(FcmPushNotificationService instance,
      CoreDatabase coreDatabase) {
    instance.coreDatabase = coreDatabase;
  }
}