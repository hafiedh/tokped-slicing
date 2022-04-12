package com.hafidh.ujian_design.fragments

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hafidh.ujian_design.databinding.FragmentOfficialStoreBinding

class OfficialStoreFragment : BaseFragment<FragmentOfficialStoreBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentOfficialStoreBinding::inflate
}