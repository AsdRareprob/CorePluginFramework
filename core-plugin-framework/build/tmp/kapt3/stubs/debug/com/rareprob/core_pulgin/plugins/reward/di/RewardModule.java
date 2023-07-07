package com.rareprob.core_pulgin.plugins.reward.di;

import android.app.Application;
import androidx.room.Room;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.rareprob.core_pulgin.core.base.CoreDatabase;
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDatabase;
import com.rareprob.core_pulgin.plugins.reward.data.repository.RewardRepositoryImpl;
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository;
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.RewardUseCase;
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.ThemeUseCase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000bH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/rareprob/core_pulgin/plugins/reward/di/RewardModule;", "", "()V", "provideFirebaseRemoteConfigInstance", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "application", "Landroid/app/Application;", "provideRewardDatabase", "Lcom/rareprob/core_pulgin/plugins/reward/data/local/RewardDatabase;", "app", "provideRewardRepository", "Lcom/rareprob/core_pulgin/plugins/reward/domain/repository/RewardRepository;", "db", "remoteConfigInstance", "provideRewardUseCase", "Lcom/rareprob/core_pulgin/plugins/reward/domain/use_case/RewardUseCase;", "repository", "provideThemeUseCase", "Lcom/rareprob/core_pulgin/plugins/reward/domain/use_case/ThemeUseCase;", "core-plugin-framework_debug"})
@dagger.Module()
public final class RewardModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.plugins.reward.di.RewardModule INSTANCE = null;
    
    private RewardModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rareprob.core_pulgin.plugins.reward.domain.use_case.RewardUseCase provideRewardUseCase(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rareprob.core_pulgin.plugins.reward.domain.use_case.ThemeUseCase provideThemeUseCase(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository provideRewardRepository(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.plugins.reward.data.local.RewardDatabase db, @org.jetbrains.annotations.NotNull()
    com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfigInstance) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.firebase.remoteconfig.FirebaseRemoteConfig provideFirebaseRemoteConfigInstance(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rareprob.core_pulgin.plugins.reward.data.local.RewardDatabase provideRewardDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
}