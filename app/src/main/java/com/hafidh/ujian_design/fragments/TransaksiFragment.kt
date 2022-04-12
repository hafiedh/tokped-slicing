package com.hafidh.ujian_design.fragments

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hafidh.ujian_design.databinding.FragmentTransaksiBinding

class TransaksiFragment : BaseFragment<FragmentTransaksiBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentTransaksiBinding::inflate

}