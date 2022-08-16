package com.application.vietlotterytwelve

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TermsConditionPage : AppCompatActivity() {

    private var pp2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_condition_page)

        pp2 = findViewById(R.id.pp2)
        pp2?.setOnClickListener {
            onBackPressed()
        }
    }
}