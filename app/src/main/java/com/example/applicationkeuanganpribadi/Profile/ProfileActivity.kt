package com.example.applicationkeuanganpribadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        set_category.setOnClickListener {
            startActivity(Intent(this@ProfileActivity,SetCategoryActivity::class.java))
        }
        pi.setOnClickListener {
            startActivity(Intent(this@ProfileActivity,ProfileInfoActivity::class.java))
        }
    }
}