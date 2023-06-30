package com.rareprob.core_pulgin.plugins.reward.di

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.rareprob.core_pulgin.plugins.reward.data.repository.RewardRepositoryImpl
import com.rareprob.core_pulgin.plugins.reward.domain.repository.RewardRepository
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.RewardUseCase
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.ThemeUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RewardModule {

    @Provides
    @Singleton
    fun provideRewardUseCase(
        repository: RewardRepository,
        remoteConfigInstance: FirebaseRemoteConfig
    ): RewardUseCase {
        return RewardUseCase(
            remoteConfigInstance = remoteConfigInstance,
            repository = repository
        )
    }

    @Provides
    @Singleton
    fun provideThemeUseCase(repository: RewardRepository): ThemeUseCase {
        return ThemeUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideRewardRepository(
    ): RewardRepository {
        return RewardRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideFirebaseRemoteConfigInstance(application: Application): FirebaseRemoteConfig {
        FirebaseApp.initializeApp(application)
        return FirebaseRemoteConfig.getInstance()
    }
}