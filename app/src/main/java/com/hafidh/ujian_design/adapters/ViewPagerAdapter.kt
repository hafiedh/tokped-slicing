package com.hafidh.ujian_design.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hafidh.ujian_design.databinding.ImageItemBinding

class ViewPagerAdapter(private val list: List<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        return ViewPagerViewHolder(ImageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ViewPagerViewHolder(private val binding: ImageItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(imgPhoto: Int) {
            with(binding) {
                imageView.setImageResource(imgPhoto)
            }
        }
    }
}
