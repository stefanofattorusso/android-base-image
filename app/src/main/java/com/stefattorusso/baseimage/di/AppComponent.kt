package com.stefattorusso.baseimage.di

import com.stefattorusso.baseimage.App
import com.stefattorusso.baseimage.di.module.AppModule
import com.stefattorusso.baseimage.ui.home.HomeBuilder
import com.stefattorusso.local.di.DatabaseModule
import com.stefattorusso.repository.di.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        DatabaseModule::class,
        HomeBuilder::class,
        AppModule::class,
        RepositoryModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: App): AppComponent
    }
}
