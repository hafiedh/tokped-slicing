package com.hafidh.ujian_design

import com.hafidh.ujian_design.data.VideoDiskon

object DataSource {
    private val image = arrayOf(
        R.drawable.contoh_product,
        R.drawable.contoh_product_dua,
        R.drawable.contoh_product_tiga,
        R.drawable.contoh_product_empat
    )
    private val watcher = arrayOf("2.5 rb", "2 rb", "4.8 rb", "3.2 rb")
    private val diskon = arrayOf("Diskon 60%", " Diskon 70%", "Diskon 75%", "Diskon 80%")
    private val title = arrayOf(
        "Keep calm with uchii",
        "Alat facial Treatment cuman 100rb?",
        "Baju diskon up to 80%",
        "Jangan Sampai Kelewatan"
    )
    private val store = arrayOf("Hafiedh Store", "Mufti Store", "Bryan Store", "Rasywan Store")

    val listData: ArrayList<VideoDiskon>
        get() {
            val list = arrayListOf<VideoDiskon>()
            for (position in watcher.indices) {
                val video = VideoDiskon()
                video.image = image[position]
                video.watcher = watcher[position]
                video.discount = diskon[position]
                video.titleVideo = title[position]
                video.storeVideo = store[position]
                list.add(video)
            }
            return list
        }
}