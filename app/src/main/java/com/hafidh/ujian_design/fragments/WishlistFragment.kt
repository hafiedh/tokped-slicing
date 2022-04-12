package com.hafidh.ujian_design.fragments

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hafidh.ujian_design.databinding.FragmentWishlistBinding

class WishlistFragment : BaseFragment<FragmentWishlistBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentWishlistBinding::inflate
}