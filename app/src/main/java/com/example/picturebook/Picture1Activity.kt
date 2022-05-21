package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Picture1Activity : AppCompatActivity() {
    lateinit var btnprevious: Button
    lateinit var btngo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture1)

        btngo=findViewById(R.id.btngo)
        btngo.setOnClickListener {
            var intent= Intent(this,Picture3Activity::class.java)
            startActivity(intent)
        }
        btnprevious=findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}


