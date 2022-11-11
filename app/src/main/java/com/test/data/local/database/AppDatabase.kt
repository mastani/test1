package com.test.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.test.data.local.database.movie.MovieDao
import com.test.data.local.database.movie.MovieEntity

@Database(entities = [MovieEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao
}