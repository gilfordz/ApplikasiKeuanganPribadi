package com.example.applicationkeuanganpribadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_pinn.*

class PinnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pinn)
        btnFinger.setOnClickListener {
            startActivity(Intent(this@PinnActivity,SuccessActivity::class.java))
        }
    }

    fun clickFinger(view: View) {
        startActivity(Intent(this@PinnActivity,SuccessActivity::class.java))
    }
}