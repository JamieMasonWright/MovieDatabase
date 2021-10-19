package com.jj.moviedatabase.repository

import android.graphics.Movie
import com.jj.moviedatabase.data.datasources.LocalDataSource
import com.jj.moviedatabase.data.datasources.RemoteDataSource
import com.jj.moviedatabase.domain.MovieRepo

class MovieRepoImpl(private val localSource: LocalDataSource, private val remoteSource: RemoteDataSource):
    MovieRepo {
    override fun fetchDataOnline(offset: Int, limit: Int): List<Movie> {
        TODO("Not yet implemented")
    }
}