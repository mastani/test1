package com.test.di.module

import android.app.Application
import androidx.room.Room
import com.test.data.local.database.AppDatabase
import com.test.data.local.database.movie.MovieDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    internal fun provideAppDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "test.db")
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    fun provideMovieDao(database: AppDatabase): MovieDao {
        return database.movieDao()
    }
}