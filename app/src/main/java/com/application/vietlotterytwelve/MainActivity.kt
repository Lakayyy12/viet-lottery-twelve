package com.application.vietlotterytwelve

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.application.vietlotterytwelve.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var exit = 0
    private var tabLayout: TabLayout? = null
    private var viewPager2: ViewPager2? = null

    private var btn2 : TextView? = null
    private var btn3 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        initListener()

        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener{
            val intent = Intent(this, PrivacyPage::class.java)
            startActivity(intent)
        }
        btn3 = findViewById(R.id.btn3)
        btn3?.setOnClickListener{
            val intent = Intent(this, TermsConditionPage::class.java)
            startActivity(intent)
        }
    }
    private fun initComponents(){
        tabLayout = findViewById(R.id.tab_layout)
        viewPager2 = findViewById(R.id.view_pager_2)

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager2?.adapter = adapter
    }
    private fun initListener(){
        TabLayoutMediator(tabLayout!!, viewPager2!!){ tab,position->
            when(position){
                0-> tab.text="HƯỚNG DẪN"
                1-> tab.text = "CÁCH"
                2-> tab.text="THỦ THUẬT"
            }
        }.attach()
    }
    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "BẤM ĐÔI ĐỂ Thoát", Toast.LENGTH_SHORT).show()
        }else{
            super.finishAffinity()
        }
    }
    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}