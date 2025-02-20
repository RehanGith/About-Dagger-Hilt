package com.example.daggerhilt.module

import com.example.daggerhilt.viewmodel.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
object ModuleViewModel {
    @Provides
    fun provideViewModel(): MainViewModel{
        return MainViewModel("Muhammad Rehan")
    }

}