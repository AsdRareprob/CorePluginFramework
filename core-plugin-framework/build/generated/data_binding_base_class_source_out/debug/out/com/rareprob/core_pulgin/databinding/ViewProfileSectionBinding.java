// Generated by data binding compiler. Do not edit!
package com.rareprob.core_pulgin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rareprob.core_pulgin.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewProfileSectionBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout btnLayout;

  @NonNull
  public final ImageView ivBackIcon;

  @NonNull
  public final ImageView ivCoinIcon;

  @NonNull
  public final ImageView ivPlusIcon;

  @NonNull
  public final ImageView ivUserProfile;

  @NonNull
  public final LinearLayout llProfileInfo;

  @NonNull
  public final CardView myCardView;

  @NonNull
  public final TextView tvCoinCount;

  @NonNull
  public final TextView tvRewardCountMsg;

  @NonNull
  public final TextView tvUserName;

  protected ViewProfileSectionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout btnLayout, ImageView ivBackIcon, ImageView ivCoinIcon, ImageView ivPlusIcon,
      ImageView ivUserProfile, LinearLayout llProfileInfo, CardView myCardView,
      TextView tvCoinCount, TextView tvRewardCountMsg, TextView tvUserName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLayout = btnLayout;
    this.ivBackIcon = ivBackIcon;
    this.ivCoinIcon = ivCoinIcon;
    this.ivPlusIcon = ivPlusIcon;
    this.ivUserProfile = ivUserProfile;
    this.llProfileInfo = llProfileInfo;
    this.myCardView = myCardView;
    this.tvCoinCount = tvCoinCount;
    this.tvRewardCountMsg = tvRewardCountMsg;
    this.tvUserName = tvUserName;
  }

  @NonNull
  public static ViewProfileSectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_profile_section, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewProfileSectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewProfileSectionBinding>inflateInternal(inflater, R.layout.view_profile_section, root, attachToRoot, component);
  }

  @NonNull
  public static ViewProfileSectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_profile_section, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewProfileSectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewProfileSectionBinding>inflateInternal(inflater, R.layout.view_profile_section, null, false, component);
  }

  public static ViewProfileSectionBinding bind(@NonNull View view) {
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
  public static ViewProfileSectionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ViewProfileSectionBinding)bind(component, view, R.layout.view_profile_section);
  }
}