package com.rareprob.core_pulgin.plugins.reward.presentation.activity;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Override;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
public abstract class Hilt_RewardActivity extends RewardBaseActivity {
  private boolean injected = false;

  Hilt_RewardActivity() {
    super();
    _initHiltInternal();
  }

  private void _initHiltInternal() {
    addOnContextAvailableListener(new OnContextAvailableListener() {
      @Override
      public void onContextAvailable(Context context) {
        inject();
      }
    });
  }

  protected void inject() {
    if (!injected) {
      injected = true;
      ((RewardActivity_GeneratedInjector) UnsafeCasts.<GeneratedComponentManagerHolder>unsafeCast(this).generatedComponent()).injectRewardActivity(UnsafeCasts.<RewardActivity>unsafeCast(this));
    }
  }
}
