package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lihat_foto.*

class lihat_foto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihat_foto)
        btn_info_selengkapnya.setOnClickListener{startActivity(Intent(this, lihat_berita::class.java))}
    }
}
