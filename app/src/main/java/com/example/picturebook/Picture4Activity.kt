package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Picture4Activity : AppCompatActivity() {
    lateinit var btnbackward: Button
    lateinit var btnfront: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture4)

        btnfront=findViewById(R.id.btnfront)
        btnfront.setOnClickListener {
            var intent= Intent(this,Picture6Activity::class.java)
            startActivity(intent)
        }
        btnbackward=findViewById(R.id.btnbackward)
        btnbackward.setOnClickListener {
            var intent= Intent(this,Picture3Activity::class.java)
            startActivity(intent)
        }
    }
}