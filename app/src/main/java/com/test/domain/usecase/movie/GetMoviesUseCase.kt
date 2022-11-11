package com.test.domain.usecase.movie

import android.app.Application
import com.test.data.impl.local.MovieLocalRepositoryImp
import com.test.data.impl.remote.MovieRemoteRepositoryImp
import com.test.data.local.database.movie.MovieEntity
import com.test.data.remote.errorhandle.ErrorHandler
import com.test.domain.usecase.base.SingleUseCase
import com.test.util.ConnectivityUtil
import io.reactivex.Single
import javax.inject.Inject

class GetMoviesUseCase @Inject constructor(
    private val context: Application,
    private val movieRemoteRepository: MovieRemoteRepositoryImp,
    private val movieLocalRepository: MovieLocalRepositoryImp,
    errorHandler: ErrorHandler
) : SingleUseCase<Any?, List<MovieEntity>>(errorHandler) {

    override fun execute(query: Any?): Single<List<MovieEntity>> {
        return if (!ConnectivityUtil.isConnected(context))
            movieLocalRepository.getMovies(query as String)
        else
            movieRemoteRepository.getMovies(query as String)
    }
}