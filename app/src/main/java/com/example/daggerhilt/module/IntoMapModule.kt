package com.example.daggerhilt.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey

@InstallIn(SingletonComponent::class)
@Module
object IntoMapModule {
    @Provides
    @IntoMap
    @StringKey("first")
    fun provideFirstString() : String {
        return "Hello "
    }
    @Provides
    @IntoMap
    @StringKey("second")
    fun provideSecondString() : String {
        return "World"
    }
}