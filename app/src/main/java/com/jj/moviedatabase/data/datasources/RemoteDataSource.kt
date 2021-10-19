package com.jj.moviedatabase.data.datasources

import com.jj.moviedatabase.domain.InterfaceRemoteDataSource
import com.jj.moviedatabase.domain.MovieDTO
import com.jj.moviedatabase.services.InterfaceMovieDbService
import retrofit2.Retrofit

class RemoteDataSource(private val retrofit: Retrofit, private val service: InterfaceMovieDbService) :
    InterfaceRemoteDataSource {
    override fun fetchMovies(): List<MovieDTO> {
        TODO("Not yet implemented")
    }
}