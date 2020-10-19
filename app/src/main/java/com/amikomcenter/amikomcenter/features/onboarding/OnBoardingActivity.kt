package com.amikomcenter.amikomcenter.features.onboarding


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import com.amikomcenter.amikomcenter.R
import com.amikomcenter.amikomcenter.adapter.OnBoardingPagerAdapter
import com.amikomcenter.amikomcenter.features.login.LoginActivity
import com.amikomcenter.amikomcenter.utils.ResourceString
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnBoardingActivity : AppCompatActivity() {
    private val adapter = OnBoardingPagerAdapter(
        listOf(
            OnBoardingSlide(
                ResourceString.onboarding1,
                R.drawable.onboarding1,
                "Lanjut",
                false
            ),
            OnBoardingSlide(
                ResourceString.onboarding2,
                R.drawable.onboarding2,
                "Masuk",
                true
            )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        onboarding_viewpager.adapter = adapter

        //setup indicators
        setupIndicators()
        onboarding_viewpager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback(){

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
                if (position == 0){
                    btn_lanjut.text = "Lanjut"
                    btnTelusuri.visibility = View.INVISIBLE
                    btnTelusuri.isClickable = false
                }else{
                    btn_lanjut.text = "Masuk"
                    btnTelusuri.visibility = View.VISIBLE
                    btnTelusuri.isClickable = true
                }
            }

        })

        btn_lanjut.setOnClickListener {
            if (btn_lanjut.text == "Lanjut"){
                onboarding_viewpager.currentItem+=1
            }else{
                val i = Intent(baseContext, LoginActivity::class.java)
                startActivity(i)
            }
        }
    }

    private fun setupIndicators() {
        val indicators = arrayOfNulls<ImageView>(adapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(8,0,8,0)

        for (i in indicators.indices){
            indicators[i] = ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_innactive
                    )
                )
                this?.layoutParams = layoutParams
            }
            indicatorContainer.addView(indicators[i])
        }
    }

    private fun setCurrentIndicator(index: Int){
        val childCount = indicatorContainer.childCount
        for (i in 0 until childCount){
            val imageView = indicatorContainer[i] as ImageView

            if (i == index){
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_active
                    )
                )
            }else{
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_innactive
                    )
                )
            }
        }
    }
}
