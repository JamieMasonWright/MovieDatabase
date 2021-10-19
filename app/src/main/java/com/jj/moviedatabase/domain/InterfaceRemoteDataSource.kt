package com.jj.moviedatabase.domain

interface InterfaceRemoteDataSource {

    fun fetchMovies(): List<MovieDTO>
}