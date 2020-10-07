package com.example.applicationkeuanganpribadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_rec.*
import kotlinx.android.synthetic.main.activity_success.*

class AddRecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_rec)
        AddNew.setOnClickListener {
            startActivity(Intent(this@AddRecActivity,AddRecActivity2::class.java))
        }
    }
}