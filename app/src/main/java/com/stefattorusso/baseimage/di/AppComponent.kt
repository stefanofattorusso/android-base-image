package com.stefattorusso.baseimage.di

import com.stefattorusso.baseimage.App
import com.stefattorusso.baseimage.ui.home.HomeBuilder
import com.stefattorusso.local.di.DatabaseModule
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
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: App): AppComponent
    }
}
