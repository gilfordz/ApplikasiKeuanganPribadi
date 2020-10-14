package com.example.applicationkeuanganpribadi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.listrecord.view.*

class listrecord(val languages : Array<String>) : BaseAdapter(){
    override fun getCount(): Int = languages.size

    override fun getItem(position: Int): Any = 0

    override fun getItemId(position: Int): Long = 0

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
      val View = LayoutInflater.from(parent?.context)
          .inflate(R.layout.listrecord,parent, false)
        View.nama.text = languages.get(position)

        return View
    }
}