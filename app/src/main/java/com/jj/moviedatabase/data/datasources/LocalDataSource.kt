package com.jj.moviedatabase.data.datasources

import com.jj.moviedatabase.domain.InterfaceLocalDataSource
import com.jj.moviedatabase.domain.MovieDTO

class LocalDataSource : InterfaceLocalDataSource {
    override fun fetchMovies(): List<MovieDTO> {
        TODO("Not yet implemented")
    }
}