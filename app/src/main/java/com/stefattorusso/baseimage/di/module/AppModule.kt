package com.stefattorusso.baseimage.di.module

import android.content.Context
import com.stefattorusso.baseimage.App
import com.stefattorusso.core.utils.AppCoroutineDispatchers
import com.stefattorusso.remote.AppRetrofitService
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module(includes = arrayOf(AppModuleBinds::class))
object AppModule {

    @JvmStatic
    @Provides
    fun provideContext(application: App): Context = application.applicationContext

    @JvmStatic
    @Singleton
    @Provides
    fun provideCoroutineDispatchers() = AppCoroutineDispatchers(
        io = Dispatchers.IO,
        computation = Dispatchers.Default,
        main = Dispatchers.Main
    )

    @JvmStatic
    @Singleton
    @Provides
    fun provideRetrofitService(context: Context): AppRetrofitService =
        AppRetrofitService.create(context)
}