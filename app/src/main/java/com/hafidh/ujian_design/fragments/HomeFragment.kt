package com.hafidh.ujian_design.fragments

import android.os.Bundle
import android.view.*
import androidx.viewbinding.ViewBinding
import com.hafidh.ujian_design.R
import com.hafidh.ujian_design.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(){
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentHomeBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // todo disini
        binding.toolbar.inflateMenu(R.menu.menu_appbar)
    }
}