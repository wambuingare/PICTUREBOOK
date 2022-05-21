package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture6Activity: AppCompatActivity() {
    lateinit var btnfinal: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture6)
        btnfinal=findViewById(R.id.btnfinal)
        btnfinal.setOnClickListener {
            var intent= Intent(this,Picture4Activity::class.java)
            startActivity(intent)
        }
    }
}