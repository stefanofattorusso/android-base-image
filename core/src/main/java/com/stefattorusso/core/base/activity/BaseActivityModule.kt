package com.stefattorusso.core.base.activity

import androidx.lifecycle.ViewModelProvider
import com.stefattorusso.common.di.ViewModelFactory
import com.stefattorusso.core.inject.PerActivity
import dagger.Binds
import dagger.Module

@Module
interface BaseActivityModule {

    @Binds
    @PerActivity
    fun viewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}