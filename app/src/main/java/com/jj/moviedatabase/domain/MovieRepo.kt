package com.jj.moviedatabase.domain

import android.graphics.Movie

interface MovieRepo {
    fun fetchDataOnline(offset: Int, limit: Int): List<Movie>;
}