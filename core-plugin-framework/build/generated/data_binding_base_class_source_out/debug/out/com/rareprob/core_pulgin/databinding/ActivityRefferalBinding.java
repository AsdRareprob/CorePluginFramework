// Generated by data binding compiler. Do not edit!
package com.rareprob.core_pulgin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.rareprob.core_pulgin.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRefferalBinding extends ViewDataBinding {
  @NonNull
  public final ViewProfileSectionBinding clProfileSection;

  @NonNull
  public final LinearLayout earnCoins;

  @NonNull
  public final View earnIndicator;

  @NonNull
  public final LinearLayout exchange;

  @NonNull
  public final View exchangeIndicator;

  @NonNull
  public final FrameLayout frmlCoinContainer;

  @NonNull
  public final ImageView ivEarn;

  @NonNull
  public final ImageView ivExchange;

  @NonNull
  public final TextView tvEarn;

  @NonNull
  public final TextView tvExchange;

  @NonNull
  public final ViewPager viewPager;

  protected ActivityRefferalBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ViewProfileSectionBinding clProfileSection, LinearLayout earnCoins, View earnIndicator,
      LinearLayout exchange, View exchangeIndicator, FrameLayout frmlCoinContainer,
      ImageView ivEarn, ImageView ivExchange, TextView tvEarn, TextView tvExchange,
      ViewPager viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clProfileSection = clProfileSection;
    this.earnCoins = earnCoins;
    this.earnIndicator = earnIndicator;
    this.exchange = exchange;
    this.exchangeIndicator = exchangeIndicator;
    this.frmlCoinContainer = frmlCoinContainer;
    this.ivEarn = ivEarn;
    this.ivExchange = ivExchange;
    this.tvEarn = tvEarn;
    this.tvExchange = tvExchange;
    this.viewPager = viewPager;
  }

  @NonNull
  public static ActivityRefferalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_refferal, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRefferalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRefferalBinding>inflateInternal(inflater, R.layout.activity_refferal, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRefferalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_refferal, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRefferalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRefferalBinding>inflateInternal(inflater, R.layout.activity_refferal, null, false, component);
  }

  public static ActivityRefferalBinding bind(@NonNull View view) {
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
  public static ActivityRefferalBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRefferalBinding)bind(component, view, R.layout.activity_refferal);
  }
}