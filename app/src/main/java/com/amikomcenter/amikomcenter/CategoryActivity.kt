package com.amikomcenter.amikomcenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.amikomcenter.amikomcenter.adapter.CategoryItemCourseAdapter
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val toolbar = findViewById<Toolbar>(R.id.my_appbar)

//        set action bar
        setActionBar(toolbar, "Category Name",true)

//        set recyclerview item course
        rvCourseCategory.adapter = CategoryItemCourseAdapter(this)

    }

//    Set ActionBar title, backbutton show or not
    private fun setActionBar(toolbar: Toolbar, title : String, backButton : Boolean){
        setSupportActionBar(toolbar)
        toolbar.title = title
        supportActionBar?.setDisplayHomeAsUpEnabled(backButton)
    }

//    ActionBar Back Button Handler
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}