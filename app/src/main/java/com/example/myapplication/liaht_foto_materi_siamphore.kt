package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_liaht_foto_materi_siamphore.*

class liaht_foto_materi_siamphore : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liaht_foto_materi_siamphore)
        btn_info_selengkapnya.setOnClickListener { startActivity(Intent(this, Lihat_materi::class.java)) }
    }
}
