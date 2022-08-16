package com.application.vietlotterytwelve.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.application.vietlotterytwelve.Detail
import com.application.vietlotterytwelve.R
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(var newsList : ArrayList<Detail>?) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_way,
            parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = newsList?.get(position)
//        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.title.text = currentItem?.titles
        holder.meaning.text = currentItem?.description

        val isVisible : Boolean = currentItem?.visbility == true
        holder.constraintLayout.visibility = if (isVisible) View.VISIBLE else View.GONE

        holder.title.setOnClickListener{
            currentItem?.visbility = !currentItem?.visbility!!
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int = newsList?.size ?: 0

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//        val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
        val title: TextView = itemView.findViewById(R.id.title)
        val meaning: TextView = itemView.findViewById(R.id.meaning)
        val constraintLayout: ConstraintLayout = itemView.findViewById(R.id.expendedlayout)
    }
}