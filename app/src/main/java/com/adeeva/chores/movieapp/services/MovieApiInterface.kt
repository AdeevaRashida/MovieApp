package com.adeeva.chores.movieapp.services

import com.adeeva.chores.movieapp.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=05932d9baa937eae2987ac36007e68c1")
    fun getMovieList(): Call<MovieResponse>

}