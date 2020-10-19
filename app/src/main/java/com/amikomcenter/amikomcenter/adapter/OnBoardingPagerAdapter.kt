package com.amikomcenter.amikomcenter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amikomcenter.amikomcenter.R
import com.amikomcenter.amikomcenter.features.onboarding.OnBoardingSlide

class OnBoardingPagerAdapter(private val onBoardingSlides: List<OnBoardingSlide>)
    :RecyclerView.Adapter<OnBoardingPagerAdapter.OnBoardingPagerViewHolder>() {

    inner class OnBoardingPagerViewHolder(v: View) : RecyclerView.ViewHolder(v){
        private val imageSlider = v.findViewById<ImageView>(R.id.imageOnboarding)
        private val descriptionOnboarding = v.findViewById<TextView>(R.id.descriptionOnboarding)

        fun bind(onBoardingSlide: OnBoardingSlide){

            descriptionOnboarding.text = onBoardingSlide.description

            imageSlider.setImageResource(onBoardingSlide.Image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingPagerViewHolder {
        return OnBoardingPagerViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.onboarding_item_container,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnBoardingPagerViewHolder, position: Int) {
        holder.bind(onBoardingSlides[position])
    }

    override fun getItemCount(): Int {
        return onBoardingSlides.size
    }

}