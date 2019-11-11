package com.stefattorusso.domain.usecase

import com.stefattorusso.domain.repository.ImageRepositoryContract
import com.stefattorusso.model.ImageEntity
import javax.inject.Inject

class GetImageListUseCase @Inject constructor(
    private val repository: ImageRepositoryContract
) {

    suspend fun getImageList(): List<ImageEntity> {
        return repository.retrieveImageList()
    }
}