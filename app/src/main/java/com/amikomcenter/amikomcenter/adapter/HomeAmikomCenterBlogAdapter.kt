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

class HomeAmikomCenterBlogAdapter (val context: Context) : RecyclerView.Adapter<HomeAmikomCenterBlogViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAmikomCenterBlogViewHolder {
        return HomeAmikomCenterBlogViewHolder(LayoutInflater.from(context).inflate(R.layout.item_amikomcenterblog, parent, false))
    }

    override fun onBindViewHolder(holder: HomeAmikomCenterBlogViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 2
    }

}

class HomeAmikomCenterBlogViewHolder(inflate: View) : RecyclerView.ViewHolder(inflate) {

}
