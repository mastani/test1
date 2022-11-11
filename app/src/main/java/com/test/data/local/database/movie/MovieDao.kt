package com.test.data.local.database.movie

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Single

@Dao
interface MovieDao {

    @Query("SELECT * FROM movies WHERE title LIKE '%' || :query || '%' ORDER BY year DESC")
    fun getAll(query: String): Single<List<MovieEntity>>

    @Query("SELECT * FROM movies WHERE imdbID = :id")
    fun find(id: String): Single<MovieEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(movies: List<MovieEntity>)
}