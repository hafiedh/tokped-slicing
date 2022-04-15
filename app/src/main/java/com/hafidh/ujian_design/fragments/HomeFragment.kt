package com.hafidh.ujian_design.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import androidx.viewpager2.widget.ViewPager2
import com.hafidh.ujian_design.DataSource
import com.hafidh.ujian_design.R
import com.hafidh.ujian_design.adapters.DiscountAdapter
import com.hafidh.ujian_design.adapters.MenuTopAdapter
import com.hafidh.ujian_design.adapters.VideoAdapter
import com.hafidh.ujian_design.adapters.ViewPagerAdapter
import com.hafidh.ujian_design.data.DiscountCollection
import com.hafidh.ujian_design.data.Menu
import com.hafidh.ujian_design.data.VideoDiskon
import com.hafidh.ujian_design.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private lateinit var videoAdapter: VideoAdapter
    private var listVideo: ArrayList<VideoDiskon> = arrayListOf()
    private lateinit var discountAdapter: DiscountAdapter
    private var listDiscount: ArrayList<DiscountCollection> = arrayListOf()
    private var listMenuTop: ArrayList<Menu> = arrayListOf()
    private var listMenuBottom: ArrayList<Menu> = arrayListOf()


    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentHomeBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.toolbar.inflateMenu(R.menu.menu_appbar)
        setRecyclerViewMenuTop()
        initViewPager()
        setRecyclerViewMenuBottom()
        setUpRecyclerViewVideo()
        setUpRecyclerViewPromo()
    }


    // init view pager
    private fun initViewPager() {
        val img = listOf(
            R.drawable.iklan_banner_satu,
            R.drawable.iklan_banner_dua,
            R.drawable.iklan_banner_tiga
        )
        binding.pagerSlider.adapter = ViewPagerAdapter(img)
        binding.pagerSlider.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.pagerSlider.currentItem = 0
        binding.pagerSlider.offscreenPageLimit = 2

        // auto slider inside fragment
        val handler = Handler(Looper.getMainLooper())
        val runnable = object : Runnable {
            override fun run() {
                if (binding.pagerSlider.currentItem < img.size - 1) {
                    binding.pagerSlider.currentItem += 1
                } else {
                    binding.pagerSlider.currentItem = 0
                }
                handler.postDelayed(this, 3000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }

    // set recyclerview horizontal
    private fun setUpRecyclerViewVideo() {
        listVideo.addAll(DataSource.listDataVideo)
        videoAdapter = VideoAdapter(listVideo)
        binding.rvVideo.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = videoAdapter
        }
    }

    private fun setUpRecyclerViewPromo() {
        listDiscount.addAll(DataSource.listDataPromo)
        discountAdapter = DiscountAdapter(listDiscount)
        binding.rvDiskon.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = discountAdapter
        }
    }

    private fun setRecyclerViewMenuTop() {
        listMenuTop.addAll(DataSource.listDataMenuTop)
        binding.rvTopMenu.apply {
            setHasFixedSize(true)
            isNestedScrollingEnabled = false
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = MenuTopAdapter(listMenuTop)
        }
    }

    private fun setRecyclerViewMenuBottom() {
        listMenuBottom.addAll(DataSource.listDataMenuBottom)
        binding.rvBottomMenu.apply {
            setHasFixedSize(true)
            isNestedScrollingEnabled = false
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = MenuTopAdapter(listMenuBottom)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        // remove auto slider inside fragment
        val handler = Handler(Looper.getMainLooper())
        handler.removeCallbacksAndMessages(null)

        //remove adapter
        binding.pagerSlider.adapter = null
//
//        //remove adapter
        binding.rvVideo.adapter = null

        //remove adapter
        binding.rvTopMenu.adapter = null
    }

}