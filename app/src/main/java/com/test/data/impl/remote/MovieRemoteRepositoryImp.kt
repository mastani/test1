package com.test.data.impl.remote

import com.test.data.local.database.movie.MovieEntity
import com.test.data.mapper.MovieMapper
import com.test.data.remote.APIService
import com.test.domain.repository.remote.MovieRemoteRepository
import io.reactivex.Single
import javax.inject.Inject

class MovieRemoteRepositoryImp @Inject constructor(
    private val apiService: APIService,
    private var movieMapper: MovieMapper
) : MovieRemoteRepository {

    override fun getMovies(query: String): Single<List<MovieEntity>> {
        return apiService.getMovies(query)
            .map {
                it.body()?.movies?.map {
                    movieMapper.toMovieEntity(it)
                }
            }
    }

    override fun getMovie(id: String): Single<MovieEntity> {
        return apiService.getMovie(id)
            .map {
                movieMapper.toMovieEntity(it.body()!!)
            }
    }
}