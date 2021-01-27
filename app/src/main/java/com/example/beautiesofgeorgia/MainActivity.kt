package com.example.beautiesofgeorgia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.imageRecyclerView)

        val surati = ArrayList<item_images>()

        surati.add(item_images("https://takoabu.files.wordpress.com/2015/05/graf-ge.jpg"))
        surati.add(item_images("https://lh3.googleusercontent.com/proxy/5odv-7POIFAOZohbVbaH-CpiLRhz1k1dTOz6UlWTuQVQaTdwizvQVPLfEfkf8oFgdlyKQ2RzBp6hDklsT0FhjedQ1Oua_w"))
        surati.add(item_images("https://cdn1.img.sputnik-georgia.com/images/23644/47/236444756.jpg"))
        surati.add(item_images("https://i2.wp.com/photos.wikimapia.org/p/00/04/21/37/86_big.jpg"))
        surati.add(item_images("https://sv.carolchanning.net/images/puteshestviya/vardziya-gruziya-istoriya-dostoprimechatelnosti-i-foto.jpg"))


        val adapter = imageAdapter(surati)

        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = adapter
    }
}