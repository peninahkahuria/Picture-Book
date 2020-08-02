package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cat.*
import kotlinx.android.synthetic.main.activity_horse.*
import kotlinx.android.synthetic.main.activity_horse.btnNext
import kotlinx.android.synthetic.main.activity_horse.btnPrevious

class cat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)
        btnPrevious.setOnClickListener {
            startActivity(Intent(baseContext,cat::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,cat::class.java))
        }
    }
}
