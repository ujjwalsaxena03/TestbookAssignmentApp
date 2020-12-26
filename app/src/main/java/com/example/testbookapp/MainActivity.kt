package com.example.testbookapp

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listUsers: MutableList<Classes>
    private lateinit var adapter: UsersAdapter
    private lateinit var list: List<Classes>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        recycler_main.layoutManager = LinearLayoutManager(this@MainActivity)
        listUsers = mutableListOf<Classes>()
        adapter = UsersAdapter(
            this,
            listUsers
        )
        recycler_main.adapter = adapter


        val userViewModel =
            ViewModelProviders.of(this, ViewModelFactory(this)).get(ViewModel::class.java)

        userViewModel.getData().observe(this, object :Observer<Responses>
        {
            override fun onChanged(t: Responses?) {
               list= t?.data?.classes!!
                listUsers.clear()
                list.let{
                    listUsers.addAll(it)
                }
                adapter.notifyDataSetChanged()

            }

        })

    }
}