package com.stefattorusso.repository

import com.stefattorusso.domain.repository.ImageRepositoryContract
import com.stefattorusso.model.ImageEntity
import com.stefattorusso.remote.datasource.ImageDataSource
import javax.inject.Inject

class ImageRepository @Inject constructor(
    private val dataSource: ImageDataSource
) : ImageRepositoryContract {

    override suspend fun retrieveImageList(): List<ImageEntity> {
        return dataSource.retrieveImageList()
    }

}