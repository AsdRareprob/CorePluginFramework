package com.rareprob.core_pulgin.core.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.rareprob.core_pulgin.core.base.CoreDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoreModule {
    @Provides
    @Singleton
    fun provideCoreDatabase(app: Application): CoreDatabase {
        return Room.databaseBuilder(
            app, CoreDatabase::class.java, CoreDatabase.DB_NAME
        )//.addTypeConverter(Converters(GsonParser(Gson())))
            .build()
    }

//    @Provides
//    fun providesApplicationInstance(@ApplicationContext context: Context): BaseCoreApplication {
//        return context as BaseCoreApplication
//    }

}