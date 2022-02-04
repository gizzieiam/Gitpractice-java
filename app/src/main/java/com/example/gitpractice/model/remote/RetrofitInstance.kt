package com.example.gitpractice.model.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitInstance {
    private val retrofit = Retrofit.Builder()
            //api url
        .baseUrl(MovieService.BASE_URL)
            // convert json to gson
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        // instance to access the retrofit
    val movieService : MovieService by lazy { retrofit.create() }
}