package com.stefattorusso.baseimage.di

import androidx.lifecycle.ViewModelProvider
import com.stefattorusso.common.di.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
internal abstract class ViewModelBuilder {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}