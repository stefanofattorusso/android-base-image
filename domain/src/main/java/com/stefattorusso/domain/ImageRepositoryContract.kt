package com.stefattorusso.domain

import com.stefattorusso.model.ImageEntity

interface ImageRepositoryContract {

    suspend fun retrieveImageList(): List<ImageEntity>
}
