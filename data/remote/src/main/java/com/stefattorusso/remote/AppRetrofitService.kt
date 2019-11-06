package com.stefattorusso.remote

import com.stefattorusso.model.ImageEntity
import retrofit2.http.GET
import retrofit2.http.Query

interface AppRetrofitService {

    @GET("v2/list")
    suspend fun retrieveImageList(
        @Query("page") page: Int,
        @Query("limit") limit: Int
    ): List<ImageEntity>
}
