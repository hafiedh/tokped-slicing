package com.hafidh.ujian_design

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
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
        // set default fragment
        replaceFragment(HomeFragment())
        initBottomNavigation()
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }


    private fun initBottomNavigation() {
        // set item with menu for bottom navigation and replace fragment base on user click
        binding.bnvMain.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_main_home -> {
                    stopFragment(FeedFragment())
                    stopFragment(OfficialStoreFragment())
                    stopFragment(TransaksiFragment())
                    stopFragment(WishlistFragment())
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.menu_main_feed -> {
                    stopFragment(HomeFragment())
                    stopFragment(OfficialStoreFragment())
                    stopFragment(TransaksiFragment())
                    stopFragment(WishlistFragment())
                    replaceFragment(FeedFragment())
                    true
                }
                R.id.menu_main_official_store -> {
                    stopFragment(HomeFragment())
                    stopFragment(FeedFragment())
                    stopFragment(TransaksiFragment())
                    stopFragment(WishlistFragment())
                    replaceFragment(OfficialStoreFragment())
                    true
                }
                R.id.menu_main_wishlist -> {
                    stopFragment(HomeFragment())
                    stopFragment(FeedFragment())
                    stopFragment(TransaksiFragment())
                    stopFragment(HomeFragment())
                    replaceFragment(WishlistFragment())
                    true
                }
                R.id.menu_main_transaksi -> {
                    stopFragment(HomeFragment())
                    stopFragment(FeedFragment())
                    stopFragment(WishlistFragment())
                    stopFragment(HomeFragment())
                    replaceFragment(TransaksiFragment())
                    true
                }
                else -> false
            }
        }
    }

   // replace fragment
   private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_main, fragment)
            .commit()
    }

    // stop fragment
    private fun stopFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .remove(fragment)
            .commit()
    }
}