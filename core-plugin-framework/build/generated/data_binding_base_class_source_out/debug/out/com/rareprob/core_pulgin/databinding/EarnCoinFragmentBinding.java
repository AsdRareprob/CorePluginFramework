// Generated by data binding compiler. Do not edit!
package com.rareprob.core_pulgin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.rareprob.core_pulgin.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EarnCoinFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar loadingProgressbar;

  @NonNull
  public final RecyclerView recyclerview;

  protected EarnCoinFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar loadingProgressbar, RecyclerView recyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.loadingProgressbar = loadingProgressbar;
    this.recyclerview = recyclerview;
  }

  @NonNull
  public static EarnCoinFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.earn_coin_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EarnCoinFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EarnCoinFragmentBinding>inflateInternal(inflater, R.layout.earn_coin_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static EarnCoinFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.earn_coin_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EarnCoinFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EarnCoinFragmentBinding>inflateInternal(inflater, R.layout.earn_coin_fragment, null, false, component);
  }

  public static EarnCoinFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static EarnCoinFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (EarnCoinFragmentBinding)bind(component, view, R.layout.earn_coin_fragment);
  }
}