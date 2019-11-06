package com.stefattorusso.baseimage.ui.home

import android.content.Context
import androidx.lifecycle.ViewModel
import com.stefattorusso.baseimage.di.ViewModelBuilder
import com.stefattorusso.common.di.ViewModelKey
import com.stefattorusso.core.inject.PerActivity
import com.stefattorusso.grid.GridFragment
import com.stefattorusso.grid.GridViewModel
import com.stefattorusso.home.HomeFragment
import com.stefattorusso.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
internal abstract class HomeBuilder {

    @ContributesAndroidInjector(
        modules = [
            ViewModelBuilder::class,
            HomeModuleBinds::class
        ]
    )
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

    @Binds
    @IntoMap
    @ViewModelKey(GridViewModel::class)
    internal abstract fun gridViewModel(viewModel: GridViewModel): ViewModel

    @ContributesAndroidInjector
    internal abstract fun homeFragment(): HomeFragment

    @ContributesAndroidInjector
    internal abstract fun gridFragment(): GridFragment
}