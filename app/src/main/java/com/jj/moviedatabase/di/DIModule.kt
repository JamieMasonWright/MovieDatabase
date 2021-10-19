package com.jj.moviedatabase.di

import com.jj.moviedatabase.data.datasources.LocalDataSource
import com.jj.moviedatabase.data.datasources.RemoteDataSource
import com.jj.moviedatabase.db.MovieDatabase
import com.jj.moviedatabase.domain.InterfaceLocalDataSource
import com.jj.moviedatabase.domain.InterfaceRemoteDataSource
import com.jj.moviedatabase.services.InterfaceMovieDbService
import com.jj.moviedatabase.services.ServiceBuilder
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DIModule {
    val modules = module {

        single {
            MovieDatabase(get())
        }

        single<InterfaceLocalDataSource> {
            LocalDataSource()
        }

        single<InterfaceRemoteDataSource> {
            RemoteDataSource(get(), get())
        }

        single<Retrofit> {
            Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        single {
            ServiceBuilder.build(get(), InterfaceMovieDbService::class.java)
        }
    }
}
