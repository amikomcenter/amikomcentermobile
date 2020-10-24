package com.amikomcenter.amikomcenter.adapter

import android.content.Context
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amikomcenter.amikomcenter.R
import kotlinx.android.synthetic.main.item_topcourse.view.*

class HomeTopCourseAdapter (val context: Context) : RecyclerView.Adapter<HomeTopCourseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeTopCourseViewHolder {
        return HomeTopCourseViewHolder(LayoutInflater.from(context).inflate(R.layout.item_topcourse, parent, false))
    }

    override fun onBindViewHolder(holder: HomeTopCourseViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 5
    }

}

class HomeTopCourseViewHolder(inflate: View) : RecyclerView.ViewHolder(inflate) {

    fun TextView.showStrikeThrough(show: Boolean) {
        paintFlags =
            if (show) paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            else paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
    }

    val tvPriceStrike = inflate.priceStrikeTopCourse.showStrikeThrough(true)

}
