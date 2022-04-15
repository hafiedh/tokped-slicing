package com.hafidh.ujian_design.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hafidh.ujian_design.data.DiscountCollection
import com.hafidh.ujian_design.databinding.DiscountCardItemBinding

class DiscountAdapter(private val listDiscount: List<DiscountCollection>) :
    RecyclerView.Adapter<DiscountAdapter.DiscountViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DiscountAdapter.DiscountViewHolder {
        val binding =
            DiscountCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DiscountViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DiscountAdapter.DiscountViewHolder, position: Int) =
        holder.bind(listDiscount[position])

    override fun getItemCount(): Int = listDiscount.size

    inner class DiscountViewHolder(private val binding: DiscountCardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DiscountCollection) {
            with(binding) {
                discountBanner.setImageResource(data.discountBanner)
                discountPrice.text = data.discountPrice
                discountPercent.text = data.discountPercent
                discountStartPrice.text = data.discountStartPrice
                discountCity.text = data.discountCity
                discountProgressBar.progress = data.discountProgressBar
            }
        }
    }

}
