package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture3Activity : AppCompatActivity() {
    lateinit var btnreturn: Button
    lateinit var btnforward: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture3)

        btnforward=findViewById(R.id.btnforward)
        btnforward.setOnClickListener {
            var intent= Intent(this,Picture4Activity::class.java)
            startActivity(intent)
        }
        btnreturn=findViewById(R.id.btnreturn)
        btnreturn.setOnClickListener {
            var intent= Intent(this,Picture1Activity::class.java)
            startActivity(intent)
        }
    }
}