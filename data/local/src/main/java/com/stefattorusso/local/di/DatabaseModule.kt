package com.stefattorusso.local.di

import android.content.Context
import androidx.room.Room
import com.stefattorusso.local.BaseImageDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(context: Context): BaseImageDatabase =
        Room.databaseBuilder(context, BaseImageDatabase::class.java, "images.db").build()
}