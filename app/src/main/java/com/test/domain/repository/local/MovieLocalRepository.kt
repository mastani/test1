package com.test.domain.repository.local

import com.test.data.local.database.movie.MovieEntity
import io.reactivex.Single

interface MovieLocalRepository {
    fun getMovies(query: String): Single<List<MovieEntity>>
    fun getMovie(id: String): Single<MovieEntity>
    fun insert(movies: List<MovieEntity>)
}