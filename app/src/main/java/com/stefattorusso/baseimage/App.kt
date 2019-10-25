package com.stefattorusso.baseimage

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import androidx.core.content.ContextCompat.getSystemService
import javax.inject.Inject


class App : DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }


}