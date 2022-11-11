package com.test.domain.repository.remote

import com.test.data.local.database.movie.MovieEntity
import io.reactivex.Single

interface MovieRemoteRepository {
    fun getMovies(query: String): Single<List<MovieEntity>>
    fun getMovie(id: String): Single<MovieEntity>
}