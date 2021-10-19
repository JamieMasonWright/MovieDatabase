package com.jj.moviedatabase.domain

interface InterfaceLocalDataSource {
    fun fetchMovies(): List<MovieDTO>
}