package com.amikomcenter.amikomcenter.features.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.amikomcenter.amikomcenter.R
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        bottomNavStyle()

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomnavView)
        val navController = findNavController(R.id.fragmentNav)

        bottomNav.setupWithNavController(navController)


    }

    fun bottomNavStyle(){
        bottomnavView.background = null
        bottomnavView.itemIconTintList = null
    }
}