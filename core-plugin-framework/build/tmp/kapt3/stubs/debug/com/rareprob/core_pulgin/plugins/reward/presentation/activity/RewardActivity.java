package com.rareprob.core_pulgin.plugins.reward.presentation.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rareprob.core_pulgin.R;
import com.rareprob.core_pulgin.core.base.NetworkUtils;
import com.rareprob.core_pulgin.databinding.ActivityRefferalBinding;
import com.rareprob.core_pulgin.plugins.reward.animation.Coin;
import com.rareprob.core_pulgin.plugins.reward.animation.CoinCollectingAnimUtils;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardPreferenceManager;
import com.rareprob.core_pulgin.plugins.reward.domain.model.FirebaseRewardData;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem;
import com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel;
import com.rareprob.core_pulgin.plugins.reward.presentation.ViewPagerAdapter;
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.parcel.Parcelize;
import kotlinx.coroutines.*;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 <2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002<=B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\u0018\u0010,\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\bH\u0002J\u0012\u0010.\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020*H\u0014J\b\u00102\u001a\u00020*H\u0014J\b\u00103\u001a\u00020*H\u0016J\b\u00104\u001a\u00020*H\u0002J\b\u00105\u001a\u00020*H\u0002J\u000e\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020\nJ\b\u00108\u001a\u00020*H\u0002J\b\u00109\u001a\u00020*H\u0002J\b\u0010:\u001a\u00020*H\u0002J\b\u0010;\u001a\u00020*H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b&\u0010\'\u00a8\u0006>"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/activity/RewardActivity;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/activity/RewardBaseActivity;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "coinAnimHandler", "Landroid/os/Handler;", "coinAnimInvokeView", "Landroid/view/View;", "coinCount", "", "coinInvokeViewLocation", "", "coinMaxCount", "frmlCoinContainer", "Landroid/widget/FrameLayout;", "mBinding", "Lcom/rareprob/core_pulgin/databinding/ActivityRefferalBinding;", "getMBinding", "()Lcom/rareprob/core_pulgin/databinding/ActivityRefferalBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "mViewPagerAdapter", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/ViewPagerAdapter;", "rewardItem", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "getRewardItem", "()Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "setRewardItem", "(Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;)V", "targetView", "Landroid/widget/LinearLayout;", "totalCoins", "", "tvCoinCount", "Landroid/widget/TextView;", "viewModel", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel;", "getViewModel", "()Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel;", "viewModel$delegate", "initDi", "", "initUi", "onClickClaimRewardCallback", "view", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "run", "setListener", "setProfileInfoData", "setTab", "position", "setupCoinAnim", "setupTabs", "syncUserRewards", "updateCoinCount", "Companion", "Params", "core-plugin-framework_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RewardActivity extends com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardBaseActivity implements java.lang.Runnable {
    private final android.os.Handler coinAnimHandler = null;
    private int coinMaxCount = 15;
    private int coinCount = 0;
    private android.widget.LinearLayout targetView;
    private android.widget.FrameLayout frmlCoinContainer;
    private android.view.View coinAnimInvokeView;
    public com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem rewardItem;
    private android.widget.TextView tvCoinCount;
    private long totalCoins = 0L;
    private int[] coinInvokeViewLocation;
    private final kotlin.Lazy mBinding$delegate = null;
    private com.rareprob.core_pulgin.plugins.reward.presentation.ViewPagerAdapter mViewPagerAdapter;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardActivity.Companion Companion = null;
    public static final int RequestCode = 10000;
    private static final java.lang.String PARAMS = "params";
    private java.util.HashMap _$_findViewCache;
    
    public RewardActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem getRewardItem() {
        return null;
    }
    
    public final void setRewardItem(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem p0) {
    }
    
    private final com.rareprob.core_pulgin.databinding.ActivityRefferalBinding getMBinding() {
        return null;
    }
    
    private final com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void setProfileInfoData() {
    }
    
    private final void initDi() {
    }
    
    private final void initUi() {
    }
    
    private final void setupTabs() {
    }
    
    private final void setListener() {
    }
    
    /**
     * Get all coins of user from firebase server
     * and
     * put these coins into shared pref
     * In case of user clear app data or reinstall app
     */
    private final void syncUserRewards() {
    }
    
    public final void setTab(int position) {
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    private final void setupCoinAnim() {
    }
    
    private final void updateCoinCount() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    /**
     * We get this callback when Reward Item is clicked from recycler View of EarnCoinFragment
     */
    private final void onClickClaimRewardCallback(com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem rewardItem, android.view.View view) {
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/activity/RewardActivity$Params;", "Landroid/os/Parcelable;", "userName", "", "imagePath", "(Ljava/lang/String;Ljava/lang/String;)V", "getImagePath", "()Ljava/lang/String;", "getUserName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core-plugin-framework_debug"})
    public static final class Params implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String userName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String imagePath = null;
        public static final android.os.Parcelable.Creator<com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardActivity.Params> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardActivity.Params copy(@org.jetbrains.annotations.NotNull()
        java.lang.String userName, @org.jetbrains.annotations.NotNull()
        java.lang.String imagePath) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Params() {
            super();
        }
        
        public Params(@org.jetbrains.annotations.NotNull()
        java.lang.String userName, @org.jetbrains.annotations.NotNull()
        java.lang.String imagePath) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImagePath() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardActivity.Params> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardActivity.Params createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardActivity.Params[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Always start this activity as a sub activity
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\fJ \u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/activity/RewardActivity$Companion;", "", "()V", "PARAMS", "", "RequestCode", "", "getLaunchIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "params", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/activity/RewardActivity$Params;", "launch", "", "Landroid/app/Activity;", "launchForResult", "requestCode", "core-plugin-framework_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void launch(@org.jetbrains.annotations.NotNull()
        android.app.Activity context, @org.jetbrains.annotations.NotNull()
        com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardActivity.Params params) {
        }
        
        public final void launchForResult(@org.jetbrains.annotations.NotNull()
        android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull()
        com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardActivity.Params params) {
        }
        
        private final android.content.Intent getLaunchIntent(android.content.Context context, com.rareprob.core_pulgin.plugins.reward.presentation.activity.RewardActivity.Params params) {
            return null;
        }
    }
}