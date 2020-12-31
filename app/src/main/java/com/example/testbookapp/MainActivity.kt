package com.example.testbookapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_row.*

class MainActivity : AppCompatActivity() {

    private lateinit var listUsers: MutableList<Classes>
    private lateinit var adapter: UsersAdapter
    private lateinit var list: List<Classes>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycler_main.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
        listUsers = mutableListOf<Classes>()
        adapter = UsersAdapter(
            this,
            listUsers
        )
        recycler_main.adapter = adapter

        val userViewModel =
            ViewModelProviders.of(this, ViewModelFactory(this)).get(ViewModel::class.java)

        userViewModel.getData().observe(this, { t ->
            list= t?.data?.classes!!
            listUsers.clear()
            list.let{
                listUsers.addAll(it)
            }
            adapter.notifyDataSetChanged()
        })

    }
}