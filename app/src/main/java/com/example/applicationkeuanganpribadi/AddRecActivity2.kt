package com.example.applicationkeuanganpribadi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_about2.*
import kotlinx.android.synthetic.main.activity_add_rec2.*
import kotlinx.android.synthetic.main.activity_curr.*

class AddRecActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_rec2)
        val spinner = findViewById(R.id.spinner) as Spinner
        val imageName = arrayOf("IDR - Indonesia", "USD - English")
        val image = intArrayOf(R.drawable.indo, R.drawable.eng)
        val spinnerCustomAdapter =
            CurrActivity.SpinnerCustomAdapter(applicationContext, image, imageName);
        spinner.adapter = spinnerCustomAdapter
        addRec.setOnClickListener {
            startActivity(Intent(this@AddRecActivity2,ListRecordActivity::class.java))
        }
    }
    class SpinnerCustomAdapter(
        internal var context: Context,
        internal var flags: IntArray,
        internal var Network: Array<String>
    ) : BaseAdapter(),
        SpinnerAdapter {
        internal var inflter: LayoutInflater

        init {
            inflter = LayoutInflater.from(context)
        }

        override fun getCount(): Int {
            return flags.size
        }

        override fun getItem(i: Int): Any? {
            return null
        }

        override fun getItemId(i: Int): Long {
            return 0
        }


        override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
            var view = view
            view = inflter.inflate(R.layout.custom_spinner_items, null)
            val icon = view.findViewById(R.id.spinner_imageView) as ImageView
            val names = view.findViewById(R.id.spinner_textView) as TextView
            icon.setImageResource(flags[i])
            names.text = Network[i]
            return view
        }
    }
}