package com.example.daggerhilt.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@InstallIn(SingletonComponent::class)
@Module
class IntoSetModule {

    @Provides
    @IntoSet
    fun provideFirstString() : String {
        return "Hello "
    }
    @Provides
    @IntoSet
    fun provideSecondString() : String {
        return "World"
    }
}