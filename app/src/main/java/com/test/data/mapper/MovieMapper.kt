package com.test.data.mapper

import com.test.data.local.database.movie.MovieEntity
import com.test.data.model.Movie
import com.test.data.model.MovieResponse
import javax.inject.Inject

class MovieMapper @Inject constructor() {

    fun toMoviesEntity(movieResponse: MovieResponse): List<MovieEntity> {
        return movieResponse.movies.map { toMovieEntity(it) }
    }

    fun toMovieEntity(movie: Movie) = MovieEntity(
        imdbID = movie.imdbID,
        title = movie.title,
        year = movie.year,
        rated = movie.rated,
        released = movie.released,
        runtime = movie.runtime,
        genre = movie.genre,
        director = movie.director,
        writer = movie.writer,
        actors = movie.actors,
        plot = movie.plot,
        language = movie.language,
        country = movie.country,
        awards = movie.awards,
        poster = movie.poster,
        metascore = movie.metascore,
        imdbRating = movie.imdbRating,
        imdbVotes = movie.imdbVotes,
        boxOffice = movie.boxOffice
    )
}