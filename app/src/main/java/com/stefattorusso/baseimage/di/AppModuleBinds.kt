package com.stefattorusso.baseimage.di

import android.app.Application
import com.stefattorusso.baseimage.App
import dagger.Binds
import dagger.Module

@Module
interface AppModuleBinds {

    @Binds
    fun provideApplication(bind: App): Application
}