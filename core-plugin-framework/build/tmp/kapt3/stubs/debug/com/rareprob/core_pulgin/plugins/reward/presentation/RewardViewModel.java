package com.rareprob.core_pulgin.plugins.reward.presentation;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.rareprob.core_pulgin.core.utils.Resource;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao;
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardRoomDatabase;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData;
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem;
import com.rareprob.core_pulgin.plugins.reward.data.repository.RewardRepositoryImpl;
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData;
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.RewardUseCase;
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.ThemeUseCase;
import com.rareprob.core_pulgin.plugins.reward.presentation.state.RewardState;
import com.rareprob.core_pulgin.plugins.reward.presentation.state.ThemeDataState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.*;
import kotlinx.coroutines.flow.*;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00016B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0016\u0010#\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%J,\u0010&\u001a\u00020\u001a2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(2\b\u0010\u001b\u001a\u0004\u0018\u00010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0,J$\u0010-\u001a\u00020\f2\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000(0/2\u0006\u00101\u001a\u000202H\u0002J*\u00103\u001a\u00020\u000e2\u0018\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u000205040/2\u0006\u00101\u001a\u000202H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel;", "Landroidx/lifecycle/ViewModel;", "rewardUseCase", "Lcom/rareprob/core_pulgin/plugins/reward/domain/use_case/RewardUseCase;", "themeUseCase", "Lcom/rareprob/core_pulgin/plugins/reward/domain/use_case/ThemeUseCase;", "(Lcom/rareprob/core_pulgin/plugins/reward/domain/use_case/RewardUseCase;Lcom/rareprob/core_pulgin/plugins/reward/domain/use_case/ThemeUseCase;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent;", "_referralState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/state/RewardState;", "_themeState", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/state/ThemeDataState;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "referralState", "Lkotlinx/coroutines/flow/StateFlow;", "getReferralState", "()Lkotlinx/coroutines/flow/StateFlow;", "themeState", "getThemeState", "claimRewardCoins", "", "context", "Landroid/content/Context;", "rewardData", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/entity/RewardEntity;", "getRewardItems", "rcKey", "", "getThemeData", "onRedeemRewardCoins", "redeemedCoin", "", "persistRewardsToDb", "rewardDataList", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/RewardItem;", "Landroid/app/Activity;", "onValidateListCallback", "Lkotlin/Function0;", "prepareReferralState", "result", "Lcom/rareprob/core_pulgin/core/utils/Resource;", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ReferralData;", "isLoading", "", "prepareThemeState", "", "Lcom/rareprob/core_pulgin/plugins/reward/domain/model/ThemeData;", "UIEvent", "core-plugin-framework_debug"})
public final class RewardViewModel extends androidx.lifecycle.ViewModel {
    private final com.rareprob.core_pulgin.plugins.reward.domain.use_case.RewardUseCase rewardUseCase = null;
    private final com.rareprob.core_pulgin.plugins.reward.domain.use_case.ThemeUseCase themeUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.rareprob.core_pulgin.plugins.reward.presentation.state.RewardState> _referralState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.rareprob.core_pulgin.plugins.reward.presentation.state.RewardState> referralState = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel.UIEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel.UIEvent> eventFlow = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.rareprob.core_pulgin.plugins.reward.presentation.state.ThemeDataState> _themeState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.rareprob.core_pulgin.plugins.reward.presentation.state.ThemeDataState> themeState = null;
    
    @javax.inject.Inject()
    public RewardViewModel(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.domain.use_case.RewardUseCase rewardUseCase, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.domain.use_case.ThemeUseCase themeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.rareprob.core_pulgin.plugins.reward.presentation.state.RewardState> getReferralState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel.UIEvent> getEventFlow() {
        return null;
    }
    
    public final void getRewardItems(@org.jetbrains.annotations.NotNull()
    java.lang.String rcKey, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.rareprob.core_pulgin.plugins.reward.presentation.state.ThemeDataState> getThemeState() {
        return null;
    }
    
    public final void getThemeData(@org.jetbrains.annotations.NotNull()
    java.lang.String rcKey, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public final void claimRewardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity rewardData) {
    }
    
    /**
     * When user redeems coin, we need to perform following actions
     * 1. Reduce a particular theme associated coin from total coins
     * 2. Post remaining coins to firebase server
     * 3.Update remaining coins as total coins in local
     */
    public final void onRedeemRewardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long redeemedCoin) {
    }
    
    private final com.rareprob.core_pulgin.plugins.reward.presentation.state.RewardState prepareReferralState(com.rareprob.core_pulgin.core.utils.Resource<java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData>> result, boolean isLoading) {
        return null;
    }
    
    private final com.rareprob.core_pulgin.plugins.reward.presentation.state.ThemeDataState prepareThemeState(com.rareprob.core_pulgin.core.utils.Resource<java.util.Map<java.lang.Long, com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData>> result, boolean isLoading) {
        return null;
    }
    
    public final void persistRewardsToDb(@org.jetbrains.annotations.NotNull()
    java.util.List<com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem> rewardDataList, @org.jetbrains.annotations.Nullable()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onValidateListCallback) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent;", "", "()V", "HideLoader", "ShowLoader", "ShowSnackbar", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent$ShowSnackbar;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent$ShowLoader;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent$HideLoader;", "core-plugin-framework_debug"})
    public static abstract class UIEvent {
        
        private UIEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent$ShowSnackbar;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-plugin-framework_debug"})
        public static final class ShowSnackbar extends com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel.UIEvent {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel.UIEvent.ShowSnackbar copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
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
            
            public ShowSnackbar(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent$ShowLoader;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-plugin-framework_debug"})
        public static final class ShowLoader extends com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel.UIEvent {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel.UIEvent.ShowLoader copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
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
            
            public ShowLoader(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent$HideLoader;", "Lcom/rareprob/core_pulgin/plugins/reward/presentation/RewardViewModel$UIEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-plugin-framework_debug"})
        public static final class HideLoader extends com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel.UIEvent {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel.UIEvent.HideLoader copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
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
            
            public HideLoader(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
        }
    }
}