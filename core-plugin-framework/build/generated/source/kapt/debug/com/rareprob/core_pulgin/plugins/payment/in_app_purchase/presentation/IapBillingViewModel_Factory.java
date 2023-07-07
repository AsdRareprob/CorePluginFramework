// Generated by Dagger (https://dagger.dev).
package com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation;

import android.app.Application;
import com.rareprob.core_pulgin.core.base.CoreDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class IapBillingViewModel_Factory implements Factory<IapBillingViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<CoreDatabase> coreDatabaseProvider;

  public IapBillingViewModel_Factory(Provider<Application> applicationProvider,
      Provider<CoreDatabase> coreDatabaseProvider) {
    this.applicationProvider = applicationProvider;
    this.coreDatabaseProvider = coreDatabaseProvider;
  }

  @Override
  public IapBillingViewModel get() {
    return newInstance(applicationProvider.get(), coreDatabaseProvider.get());
  }

  public static IapBillingViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<CoreDatabase> coreDatabaseProvider) {
    return new IapBillingViewModel_Factory(applicationProvider, coreDatabaseProvider);
  }

  public static IapBillingViewModel newInstance(Application application,
      CoreDatabase coreDatabase) {
    return new IapBillingViewModel(application, coreDatabase);
  }
}
