package com.example.viewpager2_tablayout_scrollview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val txtTitle: TextView = itemView.findViewById(R.id.txtTitle)
    val imgPhoto: ImageView = itemView.findViewById(R.id.imgPhoto)
}