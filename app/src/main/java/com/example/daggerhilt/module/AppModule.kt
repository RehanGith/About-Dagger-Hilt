package com.example.daggerhilt.module

import com.example.daggerhilt.model.Engine
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

import javax.inject.Singleton

@InstallIn(ActivityComponent::class)
@Module
object AppModule {

    @Provides
    fun provideEngine() : Engine {
        return Engine("My App Module")
    }
}