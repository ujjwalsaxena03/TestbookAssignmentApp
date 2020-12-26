package com.example.testbookapp

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("api/v1/popular-courses")
    fun getCourses(
        @Query("isPremium") isPremium: Boolean?,
        @Query("includeIndividual") includeIndividual: Boolean?

    ): Call<Responses>


/*    @GET("users")
    fun getUsers(): Call<MutableList<User>>*/

  /*   @GET("pitstop/webgetgarages")
 fun getGarages(
     @Query("appKey") appKey: String?,
     @Query("pincode") pincode: String?

 ): Call<Pitstop>*/

}




