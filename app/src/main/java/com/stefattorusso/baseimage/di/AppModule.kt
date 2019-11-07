package com.stefattorusso.baseimage.di

import android.content.Context
import com.stefattorusso.baseimage.App
import com.stefattorusso.core.utils.AppCoroutineDispatchers
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module(includes = arrayOf(AppModuleBinds::class))
abstract class AppModule {

    @Provides
    fun provideContext(application: App): Context = application.applicationContext

    @Singleton
    @Provides
    fun provideCoroutineDispatchers() = AppCoroutineDispatchers(
        io = Dispatchers.IO,
        computation = Dispatchers.Default,
        main = Dispatchers.Main
    )
}