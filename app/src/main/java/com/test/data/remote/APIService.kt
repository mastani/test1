package com.test.data.remote

import com.test.data.model.Movie
import com.test.data.model.MovieResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("/")
    fun getMovies(@Query("s") query: String): Single<Response<MovieResponse>>

    @GET("/")
    fun getMovie(@Query("id") id: String): Single<Response<Movie>>
}