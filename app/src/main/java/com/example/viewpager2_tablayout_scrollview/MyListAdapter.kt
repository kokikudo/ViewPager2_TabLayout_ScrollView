package com.example.viewpager2_tablayout_scrollview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyListAdapter(private val data: List<ListItem>) :
    RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtTitle.text = data[position].title
        holder.imgPhoto.setImageDrawable(data[position].photo)
        holder.imgPhoto.contentDescription = data[position].title
    }

    override fun getItemCount(): Int = data.size
}