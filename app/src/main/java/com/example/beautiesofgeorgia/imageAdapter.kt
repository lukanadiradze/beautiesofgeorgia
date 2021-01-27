package com.example.beautiesofgeorgia

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class imageAdapter(private val images: List<item_images>): RecyclerView.Adapter<imageAdapter.ImageViewHolder>(){

    class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageview: ImageView = itemView.findViewById(R.id.imageRecyclerView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_images, parent, false)
        return  ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val v = images[position]
        Glide.with(holder.imageview.context)
                .load(v.link)
                .centerCrop()
                .into(holder.imageview)
    }

    override fun getItemCount(): Int = images.size
}
