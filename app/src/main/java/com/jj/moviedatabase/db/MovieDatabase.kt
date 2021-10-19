package com.jj.moviedatabase.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jj.moviedatabase.entity.MovieListInfo
import com.jj.moviedatabase.entity.MovieResult

@Database(
    entities = [MovieListInfo::class, MovieResult::class],
    version = 1
)
abstract class MovieDatabase : RoomDatabase() {
    companion object {
        @Volatile private var instance: MovieDatabase ? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: build(context).also { instance = it }
        }

        private fun build(context: Context) =
            Room.databaseBuilder(context.applicationContext, MovieDatabase::class.java, "movie.db")
                .build()
    }
}