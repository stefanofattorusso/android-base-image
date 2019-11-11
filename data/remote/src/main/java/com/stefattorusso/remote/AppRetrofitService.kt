package com.stefattorusso.remote

import android.content.Context
import com.stefattorusso.data.remote.BuildConfig
import com.stefattorusso.data.remote.BuildConfig.API_BASE_URL
import com.stefattorusso.model.ImageEntity
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.io.File
import java.util.concurrent.TimeUnit

interface AppRetrofitService {

    @GET("v2/list")
    suspend fun retrieveImageList(
        @Query("page") page: Int,
        @Query("limit") limit: Int
    ): List<ImageEntity>

    companion object {

        private const val CACHE_SIZE = (10 * 1024 * 1024).toLong()
        private const val TIMEOUT = 60L

        fun create(context: Context): AppRetrofitService {

            val cacheFile = File(context.cacheDir, "http-cache")

            val cache = Cache(cacheFile, CACHE_SIZE)

            val builder = OkHttpClient.Builder()
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                .cache(cache)

            if (BuildConfig.DEBUG) {
                val logging = HttpLoggingInterceptor()
                logging.level = HttpLoggingInterceptor.Level.BODY
                builder.addInterceptor(logging)
            }

            val okHttpClient = builder.build()

            return Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
                .create(AppRetrofitService::class.java)
        }
    }
}
