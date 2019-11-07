package com.stefattorusso.remote.datasource

import com.stefattorusso.model.ImageEntity
import com.stefattorusso.remote.AppRetrofitService

class ImageDataSource(private val service: AppRetrofitService) {

    suspend fun retrieveImageList(): List<ImageEntity> = service.retrieveImageList(1, 100)
}