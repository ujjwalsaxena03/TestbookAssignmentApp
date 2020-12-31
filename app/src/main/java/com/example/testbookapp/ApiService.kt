package com.example.testbookapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("api/v1/popular-courses")
    fun getCourses(
        @Query("isPremium") isPremium: Boolean?,
        @Query("includeIndividual") includeIndividual: Boolean?

    ): Call<Responses>

}




