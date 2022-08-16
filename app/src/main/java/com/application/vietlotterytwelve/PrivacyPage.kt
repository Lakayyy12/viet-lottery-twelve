package com.application.vietlotterytwelve

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PrivacyPage : AppCompatActivity() {

    private var pp1 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_page)

        pp1 = findViewById(R.id.pp1)
        pp1?.setOnClickListener{
            onBackPressed()
        }
    }
}