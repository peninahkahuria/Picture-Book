package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_horse.*

class horse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horse)
        btnPrevious.setOnClickListener {
            startActivity(Intent(baseContext, horse::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,horse::class.java))
        }
    }
}
