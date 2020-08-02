package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_horse.*

class puppy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puppy)
        btnPrevious.setOnClickListener {
            startActivity(Intent(baseContext,puppy::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,puppy::class.java))
        }
    }
}
