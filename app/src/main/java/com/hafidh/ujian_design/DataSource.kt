package com.hafidh.ujian_design

import com.hafidh.ujian_design.data.Menu
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
    private val menuIconTop =
        arrayOf(
            R.drawable.ic_official_selected,
            R.drawable.ic_view_more,
            R.drawable.ic_daily_needs,
            R.drawable.ic_electronic,
            R.drawable.ic_topup,
            R.drawable.ic_travel,
            R.drawable.ic_finance,
            R.drawable.ic_travel,
            R.drawable.ic_party_tools,
            R.drawable.ic_office
        )
    private val menuTitleTop = arrayOf(
        "Official Store",
        "Lihat Semua",
        "Kebutuhan Harian",
        "Elektronik",
        "Top Up & Tagihan",
        "Travel & Entertainment",
        "Keuangan",
        "Handphone & Tablet",
        "Perlengkapan Pesta",
        "Office and Stationery"
    )

    private val menuIconBottom =
        arrayOf(
            R.drawable.ic_peduli_lindungi,
            R.drawable.ic_bazzar,
            R.drawable.ic_live_shop,
            R.drawable.ic_toped_seru,
            R.drawable.ic_bangga_local,
            R.drawable.ic_cod
        )
    private val menuTitleBottom = arrayOf(
        "Peduli Lindungi",
        "Bazar hari ini",
        "Live shopping",
        "Tokopedia seru",
        "Bangga Local",
        "bayar di tempat"
    )

    val listDataVideo: ArrayList<VideoDiskon>
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

    val listDataMenuTop: ArrayList<Menu>
        get() {
            val listMenuTop = arrayListOf<Menu>()
            for (position in menuIconTop.indices) {
                val menu = Menu()
                menu.icon = menuIconTop[position]
                menu.title = menuTitleTop[position]
                listMenuTop.add(menu)
            }
            return listMenuTop
        }

    val listDataMenuBottom: ArrayList<Menu>
        get() {
            val listMenuBottom = arrayListOf<Menu>()
            for (position in menuIconBottom.indices) {
                val menu = Menu()
                menu.icon = menuIconBottom[position]
                menu.title = menuTitleBottom[position]
                listMenuBottom.add(menu)
            }
            return listMenuBottom
        }

}