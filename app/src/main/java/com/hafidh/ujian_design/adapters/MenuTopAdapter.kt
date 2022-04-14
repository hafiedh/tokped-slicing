package com.hafidh.ujian_design.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hafidh.ujian_design.data.Menu
import com.hafidh.ujian_design.databinding.MenuCardTopItemBinding

class MenuTopAdapter(private val listMenu: List<Menu>) :
    RecyclerView.Adapter<MenuTopAdapter.MenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding = MenuCardTopItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MenuViewHolder(binding)
    }

    override fun getItemCount(): Int = listMenu.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) = holder.bind(listMenu[position])

    inner class MenuViewHolder(private val binding: MenuCardTopItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Menu) {
            binding.imgIcon.setImageResource(item.icon)
            binding.txtTitle.text = item.title
        }
    }

}