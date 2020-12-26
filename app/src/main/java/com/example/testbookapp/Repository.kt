package com.example.testbookapp

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.testbookapp.Utility.hideProgressBar
import com.example.testbookapp.Utility.showProgressBar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object Repository {


    fun getMutableLiveData(context: Context) : MutableLiveData<Responses>{

        val mutableLiveData = MutableLiveData<Responses>()

        context.showProgressBar()

        ApiClient.apiService.getCourses(isPremium = true, includeIndividual = true).enqueue(object : Callback<Responses> {
            override fun onFailure(call: Call<Responses>, t: Throwable) {
                hideProgressBar()
//                Log.e("error", t.localizedMessage)
            }

            override fun onResponse(
                call: Call<Responses>,
                response: Response<Responses>
            ) {
                hideProgressBar()
                val usersResponse = response.body()
                usersResponse?.let { mutableLiveData.value = it }
            }

        })

        return mutableLiveData
    }

}