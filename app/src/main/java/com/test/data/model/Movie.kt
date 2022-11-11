package com.test.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieResponse(
    @SerializedName("Response")
    var response: String = "",

    @SerializedName("Search")
    var movies: List<Movie> = emptyList()
) : Parcelable

@Parcelize
data class Movie(
    @SerializedName("imdbID")
    var imdbID: String,

    @SerializedName("Title")
    var title: String? = null,

    @SerializedName("Year")
    var year: String? = null,

    @SerializedName("Rated")
    var rated: String? = null,

    @SerializedName("Released")
    var released: String? = null,

    @SerializedName("Runtime")
    var runtime: String? = null,

    @SerializedName("Genre")
    var genre: String? = null,

    @SerializedName("Director")
    var director: String? = null,

    @SerializedName("Writer")
    var writer: String? = null,

    @SerializedName("Actors")
    var actors: String? = null,

    @SerializedName("Plot")
    var plot: String? = null,

    @SerializedName("Language")
    var language: String? = null,

    @SerializedName("Country")
    var country: String? = null,

    @SerializedName("Awards")
    var awards: String? = null,

    @SerializedName("Poster")
    var poster: String? = null,

    @SerializedName("Metascore")
    var metascore: String? = null,

    @SerializedName("imdbRating")
    var imdbRating: String? = null,

    @SerializedName("imdbVotes")
    var imdbVotes: String? = null,

    @SerializedName("BoxOffice")
    var boxOffice: String? = null
) : Parcelable