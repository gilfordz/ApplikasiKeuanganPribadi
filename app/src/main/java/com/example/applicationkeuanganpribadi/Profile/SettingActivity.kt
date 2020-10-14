package com.example.applicationkeuanganpribadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationkeuanganpribadi.Profile.ProfileActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        upset.setOnClickListener {
            startActivity(Intent(this@SettingActivity,ProfileActivity::class.java))
        }
    }
}