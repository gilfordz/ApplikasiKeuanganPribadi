package com.example.applicationkeuanganpribadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_category.*
import kotlinx.android.synthetic.main.activity_add_rec2.*
import kotlinx.android.synthetic.main.activity_add_rec2.addRec

class AddCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_category)
        addCtg.setOnClickListener {
            startActivity(Intent(this@AddCategoryActivity,HomeActivity::class.java))
        }

    }
}