package com.example.testbookapp

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.card_layout.view.*


class UsersAdapter(private val context: Context, private var list: MutableList<Classes>) : RecyclerView.Adapter<UsersAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.card_layout, parent, false)

        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        Log.d("listData size", list.size.toString())
        return list.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val user = list[position]
        holder.name?.text = user.titles
        val color = user.classProperties?.color

        val shape = ContextCompat.getDrawable(context, R.drawable.card_bg) as LayerDrawable?
        val gradRect = shape!!.findDrawableByLayerId(R.id.rectangle) as GradientDrawable
        val gradCircBig = shape.findDrawableByLayerId(R.id.circlebig) as GradientDrawable
        val gradCircSmall= shape.findDrawableByLayerId(R.id.circlesmall) as GradientDrawable

        holder.view.layoutCons.setBackgroundResource(R.drawable.card_bg)

        var colorAPI=0
        var color30d=0
        var color60d=0

        colorAPI = if(color!=null) {
            Color.parseColor("#$color") //api-color
        }
        else {                                                  // cz 2 color values from API are null, total:13/15
            Color.parseColor("#3472A5")              //assigning random color for missing color value
        }

        color30d = manipulateColor(colorAPI,0.7f) //30%darker
        color60d = manipulateColor(colorAPI,0.4f) //60%darker

        val colorArray30: IntArray = intArrayOf(color30d,colorAPI) //30%dark-light-circles
        val colorArray60: IntArray = intArrayOf(color60d,colorAPI) //60%dark-light-rectangle

        gradRect.colors=colorArray60
        gradCircBig.colors=colorArray30
        gradCircSmall.colors=colorArray30

        val a = "https:"
        val imageView : ImageView = holder.view.faculty
        Picasso.get().load(a.plus(user.classInfo?.facultiesImage))
                .into(imageView)

        Log.d("Title name", user.titles.toString())
        Log.d("Faculty image link", a.plus(user.classInfo?.facultiesImage))
        Log.d("Card color", color.toString())

    }


    class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view){

        var name: TextView? = null
        var facultyImage: ImageView?=null

        init {
            name = view.findViewById(R.id.title)
            facultyImage = view.findViewById(R.id.faculty)

        }

    }

      fun manipulateColor(color: Int, factor: Float): Int {     //function to get darker shade of input color
          val a = Color.alpha(color)
          val r = Math.round(Color.red(color) * factor)
          val g = Math.round(Color.green(color) * factor)
          val b = Math.round(Color.blue(color) * factor)
          return Color.argb(a,
                  Math.min(r, 255),
                  Math.min(g, 255),
                  Math.min(b, 255))
      }

}
