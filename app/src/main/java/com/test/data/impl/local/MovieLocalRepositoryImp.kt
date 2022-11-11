package com.test.data.impl.local

import com.test.data.local.database.movie.MovieDao
import com.test.data.local.database.movie.MovieEntity
import com.test.domain.repository.local.MovieLocalRepository
import javax.inject.Inject

class MovieLocalRepositoryImp @Inject constructor(private val movieDao: MovieDao) : MovieLocalRepository {

    override fun getMovies(query: String) = movieDao.getAll(query)

    override fun getMovie(id: String) = movieDao.find(id)

    override fun insert(movies: List<MovieEntity>) {
        movieDao.insert(movies)
    }
}