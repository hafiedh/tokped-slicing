package com.hafidh.ujian_design

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.hafidh.ujian_design.databinding.ActivityMainBinding
import com.hafidh.ujian_design.fragments.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())
        initBottomNavigation()
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    private fun initBottomNavigation() {
        binding.bnvMain.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_main_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.menu_main_feed -> {
                    replaceFragment(FeedFragment())
                    true
                }
                R.id.menu_main_official_store -> {
                    replaceFragment(OfficialStoreFragment())
                    true
                }
                R.id.menu_main_wishlist -> {
                    replaceFragment(WishlistFragment())
                    true
                }
                R.id.menu_main_transaksi -> {
                    replaceFragment(TransaksiFragment())
                    true
                }
                else -> false
            }
        }
    }


   private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_main, fragment)
            .commit()
    }

}