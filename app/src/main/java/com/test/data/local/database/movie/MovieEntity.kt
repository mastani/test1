package com.test.data.local.database.movie

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class MovieEntity(
    @PrimaryKey(autoGenerate = false)
    var imdbID: String,

    var title: String? = null,
    var year: String? = null,
    var rated: String? = null,
    var released: String? = null,
    var runtime: String? = null,
    var genre: String? = null,
    var director: String? = null,
    var writer: String? = null,
    var actors: String? = null,
    var plot: String? = null,
    var language: String? = null,
    var country: String? = null,
    var awards: String? = null,
    var poster: String? = null,
    var metascore: String? = null,
    var imdbRating: String? = null,
    var imdbVotes: String? = null,
    var boxOffice: String? = null
)