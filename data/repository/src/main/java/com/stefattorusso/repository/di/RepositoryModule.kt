package com.stefattorusso.repository.di

import com.stefattorusso.domain.repository.ImageRepositoryContract
import com.stefattorusso.repository.ImageRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule{

    @Binds
    fun imageRepository(repository: ImageRepositoryContract): ImageRepository
}