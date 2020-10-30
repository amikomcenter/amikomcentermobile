package com.amikomcenter.amikomcenter.adapter

import android.content.Context
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amikomcenter.amikomcenter.R
import kotlinx.android.synthetic.main.item_category.view.*
import kotlinx.android.synthetic.main.item_topcourse.view.*

class CategoryItemCourseAdapter (val context: Context) : RecyclerView.Adapter<CategoryItemCourseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemCourseViewHolder {
        return CategoryItemCourseViewHolder(LayoutInflater.from(context).inflate(R.layout.item_category, parent, false))
    }

    override fun onBindViewHolder(holder: CategoryItemCourseViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 10
    }

}

class CategoryItemCourseViewHolder(inflate: View) : RecyclerView.ViewHolder(inflate) {
    fun TextView.showStrikeThrough(show: Boolean) {
        paintFlags =
            if (show) paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            else paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
    }

    val tvPriceStrike = inflate.courseItem_price_strike.showStrikeThrough(true)

}
