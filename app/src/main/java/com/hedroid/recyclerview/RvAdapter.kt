package com.hedroid.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.hedroid.recyclerview.databinding.RvItemBinding

class RvAdapter(private val dataList: ArrayList<RvModel>, private val context: Context) : RecyclerView.Adapter<RvAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = RvItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        anim(holder.itemView)
        val item = dataList[position]
        holder.binding.profile.setImageResource(item.profile)
        holder.binding.name.text = item.name
        holder.binding.address.text = item.address
        holder.itemView.setOnClickListener{
         Toast.makeText(context, dataList[position].name,Toast.LENGTH_SHORT).show()
        }
    }

    class MyViewHolder(val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)
    private fun anim(view: View){
        val animation=AlphaAnimation(0.0f ,1.0f)
        animation.duration=1000
        view.startAnimation(animation)
    }
}

