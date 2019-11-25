package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_foto.*
import kotlinx.android.synthetic.main.activity_menu_utama2.*

class foto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foto)
        btn_fotoa.setOnClickListener{ startActivity(Intent(this, lihat_foto::class.java)) }
        btn_foto_hasduk.setOnClickListener { startActivity(Intent(this, lihat_foto_jual_hasduk::class.java)) }
        btn_foto_materi_simaphore.setOnClickListener { startActivity(Intent(this, liaht_foto_materi_siamphore::class.java)) }
    }
}
