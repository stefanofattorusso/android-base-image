package com.stefattorusso.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class ImageEntity(
    @PrimaryKey
    @SerializedName("id")
    val id: String
)
