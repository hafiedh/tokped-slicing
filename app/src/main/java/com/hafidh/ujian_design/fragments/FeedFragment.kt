package com.hafidh.ujian_design.fragments

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hafidh.ujian_design.databinding.FragmentFeedBinding

class FeedFragment : BaseFragment<FragmentFeedBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentFeedBinding::inflate

}