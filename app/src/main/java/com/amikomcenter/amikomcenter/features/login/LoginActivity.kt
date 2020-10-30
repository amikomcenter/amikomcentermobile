package com.amikomcenter.amikomcenter.features.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.amikomcenter.amikomcenter.R
import com.amikomcenter.amikomcenter.features.dashboard.DashboardActivity
import com.amikomcenter.amikomcenter.features.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

//    override lateinit var presenter: LoginContract.Presenter
//    init {
//        LoginPresenter(this, this)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        daftar_textview.setOnClickListener{
            val i = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(i)
        }

        btn_masuk.setOnClickListener {
            val i = Intent(applicationContext, DashboardActivity::class.java)
            startActivity(i)
        }

    }
}