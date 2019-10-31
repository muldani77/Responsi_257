package com.example.responsi_257.model

import com.example.responsi_257.R

object DataPresiden {
    private val nama_presiden = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "BJ. Habibie",
        "Abdurrahman Wahid",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo",
        "Prabowo Subianto",
        "Anies Baswedan",
        "M.Muldani"
    )

    private val detail = arrayOf(
        "Ir. Soekarno adalah presiden pertama RI, dan wakilnya adalah Moh.Hatta",
        "Soeharto adalah presiden kedua RI yang menjabat selama lebih dari 30 tahun",
        "BJ. Habibie adalah presiden ketiga RI yang menggantikan Soeharto",
        "Abdurrahman Wahid atau biasa dikenal dengan Gusdur adalah presiden keempat RI",
        "Megawati adalah presiden kelima RI dan merupakan presiden wanita pertama di Indonesia",
        "Susilo Bambang Yudhoyono adalah presiden RI keenam",
        "Joko Widodo atau biasa dikenal Jokowi adalah presiden RI ketujuh",
        "Calon Presiden kedelapan (Kayanya)",
        "Calon Presiden Kesembilan (Kayanya)",
        "Calon Presiden Kesepuluh (Amin) untuk melengkapi aja biar 10 baris"
    )

    private val presidenPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi,
        R.drawable.prabowo,
        R.drawable.anies,
        R.drawable.muldani
    )

    val listPresiden: ArrayList<Presiden>
        get() {
            val list = arrayListOf<Presiden>()
            for (position in nama_presiden.indices) {
                val presiden = Presiden()
                presiden.name = nama_presiden[position]
                presiden.detail = detail[position]
                presiden.poster = presidenPoster[position]
                list.add(presiden)
            }
            return list
        }
}