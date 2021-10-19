package com.jj.moviedatabase.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jj.moviedatabase.domain.MovieDTO

@Dao
interface MovieDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovieListInfo(movies: List<MovieDTO>)

    @Query("select * from movies where page=:page order by vote_average desc, popularity asc")
    fun fetchMovies(page: Int): List<MovieDTO>

    @Query("select COUNT(*) from movies where page=:page order by vote_average desc, popularity asc")
    fun getMoviesCount(page: Int): Int

}