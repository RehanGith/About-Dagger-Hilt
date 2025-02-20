package com.example.daggerhilt.module

import com.example.daggerhilt.binds.BindInterface
import com.example.daggerhilt.binds.BindInterfaceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class BindModule {

    @Binds
    abstract fun bindsInterface(bindInterfaceImpl: BindInterfaceImpl) : BindInterface
}