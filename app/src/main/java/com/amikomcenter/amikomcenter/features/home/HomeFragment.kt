package com.amikomcenter.amikomcenter.features.home

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.amikomcenter.amikomcenter.CategoryActivity
import com.amikomcenter.amikomcenter.R
import com.amikomcenter.amikomcenter.adapter.HomeAmikomCenterBlogAdapter
import com.amikomcenter.amikomcenter.adapter.HomeCarouselAdapter
import com.amikomcenter.amikomcenter.adapter.HomeTopCourseAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvCarousel.adapter = HomeCarouselAdapter(view.context)
        rvTopCourse.adapter = HomeTopCourseAdapter(view.context)
        rv_amikomcenterblog.adapter = HomeAmikomCenterBlogAdapter(view.context)

        imageButton2.setOnClickListener {
            val iCategory = Intent(context, CategoryActivity::class.java)
            startActivity(iCategory)
        }

    }





}