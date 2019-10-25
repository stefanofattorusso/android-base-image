package com.stefattorusso.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.stefattorusso.model.ImageEntity

@Database(entities = [ImageEntity::class], version = 1, exportSchema = false)
abstract class BaseImageDatabase: RoomDatabase()