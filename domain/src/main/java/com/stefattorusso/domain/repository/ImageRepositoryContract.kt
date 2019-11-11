package com.stefattorusso.domain.repository

import com.stefattorusso.model.ImageEntity

interface ImageRepositoryContract {

    suspend fun retrieveImageList(): List<ImageEntity>
}
