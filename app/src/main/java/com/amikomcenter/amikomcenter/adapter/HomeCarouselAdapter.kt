package com.amikomcenter.amikomcenter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amikomcenter.amikomcenter.R
import kotlinx.android.synthetic.main.home_carousel.view.*

class HomeCarouselAdapter(val context: Context):RecyclerView.Adapter<HomeCarouselViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeCarouselViewHolder {
        return HomeCarouselViewHolder(LayoutInflater.from(context).inflate(R.layout.home_carousel, parent, false))
    }

    override fun onBindViewHolder(holder: HomeCarouselViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 5
    }

}

class HomeCarouselViewHolder(inflate: View) : RecyclerView.ViewHolder(inflate) {
    val img = inflate.imgCarousel
}
