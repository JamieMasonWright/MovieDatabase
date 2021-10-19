package com.jj.moviedatabase.services

import com.jj.moviedatabase.domain.MovieDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface InterfaceMovieDbService {
    @GET("/3/movie/popular?language=en-US")
    suspend fun getMovieList(@Query("api_key") key: String, @Query("page") page: Int): List<MovieDTO>
}