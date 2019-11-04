package com.stefattorusso.baseimage.ui.home

import android.content.Context
import androidx.lifecycle.ViewModel
import com.stefattorusso.common.di.ViewModelKey
import com.stefattorusso.core.inject.PerActivity
import com.stefattorusso.home.HomeFragment
import com.stefattorusso.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
internal abstract class HomeBuilder {

    @ContributesAndroidInjector(modules = [HomeModuleBinds::class])
    internal abstract fun homeActivity(): HomeActivity
}

@Module
abstract class HomeModuleBinds {

    @Binds
    @PerActivity
    abstract fun bindContext(activity: HomeActivity): Context

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    internal abstract fun homeViewModel(viewModel: HomeViewModel): ViewModel

    @ContributesAndroidInjector
    internal abstract fun fragment(): HomeFragment
}