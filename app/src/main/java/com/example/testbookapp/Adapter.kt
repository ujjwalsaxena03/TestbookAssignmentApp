package com.example.testbookapp

import android.content.Context
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testbookapp.Pitstop



class UsersAdapter(private val context: Context, private var list: MutableList<Classes>) : RecyclerView.Adapter<UsersAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.layout_row, parent, false)

        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        Log.d("listData size", list.size.toString())
        return list.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val user = list[position]
        holder.name?.text = user.titles
        Log.d("Title name", user.titles.toString())

    }

    class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view){
        var name: TextView? = null
        var facultyImage: ImageView?=null

        init {
            name = view.findViewById(R.id.title)
            facultyImage = view.findViewById(R.id.faculty)

        }



    }

}
