package com.example.applicationkeuanganpribadi
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_record.*
class ListRecordActivity : AppCompatActivity() {
private  val languages = arrayOf("Java", "Kotlin", "Javascript", "PHP", "Python")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_record)
        listview.adapter = listrecord(languages)
    }
}