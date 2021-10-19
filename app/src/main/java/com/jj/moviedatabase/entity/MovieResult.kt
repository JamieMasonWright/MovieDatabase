package com.jj.moviedatabase.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.TypeConverters
import com.jj.moviedatabase.db.utils.ListIntDataConverter

@Entity(tableName = "movie_result")
data class MovieResult(
    @ColumnInfo(name = "adult") val adult: Boolean,
    @ColumnInfo(name = "backdrop_path") val backdropPath: String,
    @TypeConverters(ListIntDataConverter::class) @ColumnInfo(name = "genre_ids") val genreIds: List<Int>,
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "original_language") val originalLanguage: String,
    @ColumnInfo(name = "original_title") val originalTitle: String,
    @ColumnInfo(name = "overview") val overview: String,
    @ColumnInfo(name = "popularity") val popularity: Int,
    @ColumnInfo(name = "poster_path") val posterPath: String,
    @ColumnInfo(name = "release_date") val releaseDate: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "video") val video: String,
    @ColumnInfo(name = "vote_average") val voteAverage: Int,
    @ColumnInfo(name = "vote_count") val voteCount: Int,
    @ColumnInfo(name = "page") val page: Int
)