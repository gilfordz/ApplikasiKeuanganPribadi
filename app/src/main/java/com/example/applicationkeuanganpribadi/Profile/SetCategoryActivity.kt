package com.example.applicationkeuanganpribadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationkeuanganpribadi.Adapter.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_set_category.*

class SetCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_set_category)

        val adapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = adapter
        tabs_main.setupWithViewPager(viewpager_main)
        NewCategory.setOnClickListener {
            startActivity(Intent(this@SetCategoryActivity,AddCategoryActivity::class.java))
        }
    }
}