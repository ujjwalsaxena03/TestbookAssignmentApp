package com.example.testbookapp

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testbookapp.Repository
import com.example.testbookapp.Utility.isInternetAvailable

class ViewModel(private val context: Context) : ViewModel() {

    private var listData = MutableLiveData<Responses>()

    init {
        val Repository: Repository by lazy {
            Repository
        }
        if (context.isInternetAvailable()) {
            listData = Repository.getMutableLiveData(context)
        }
    }

    fun getData(): MutableLiveData<Responses> {
        return listData

    }
}