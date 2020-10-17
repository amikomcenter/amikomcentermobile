package com.amikomcenter.amikomcenter.features.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amikomcenter.amikomcenter.R
import com.amikomcenter.amikomcenter.features.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_masuk.setOnClickListener {
            val i = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(i)
        }

    }
}