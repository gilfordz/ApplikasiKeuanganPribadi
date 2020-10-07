package com.example.applicationkeuanganpribadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_privasi.*

class PrivasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privasi)
        btn_agree.setOnClickListener {
            startActivity(Intent(this@PrivasiActivity,CurrActivity::class.java))
        }
    }
}