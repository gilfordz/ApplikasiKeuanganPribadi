package com.example.applicationkeuanganpribadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_free.setOnClickListener {
           startActivity(Intent(this@MainActivity,PrivasiActivity::class.java))
        }
        btn_google.setOnClickListener {
            startActivity(Intent(this@MainActivity,ContohActivity::class.java))
        }
    }
}