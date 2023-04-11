package com.example.modul2_no2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView : RecyclerView
    private lateinit var newArrayList : ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j
        )

        heading = arrayOf(
            "fdhsdagddhksajhgfhdfdsfgjhsdgfsdgfgds",
            "gdkfgkdfjghkdfghfghfhgkgdfbbvcnbbcvnm",
            "gdkfgkdfjghkdfghfghfhgkgdfbbvcnbbcvnm",
            "gdkfgkdfjghkdfghfghfhgkgdfbbvcnbbcvnm",
            "gdkfgkdfjghkdfghfghfhgkgdfbbvcnbbcvnm",
            "gdkfgkdfjghkdfghfghfhgkgdfbbvcnbbcvnm",
            "gdkfgkdfjghkdfghfghfhgkgdfbbvcnbbcvnm",
            "gdkfgkdfjghkdfghfghfhgkgdfbbvcnbbcvnm",
            "gdkfgkdfjghkdfghfghfhgkgdfbbvcnbbcvnm",
            "gdkfgkdfjghkdfghfghfhgkgdfbbvcnbbcvnm"
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val news = News(imageId[i],heading[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}