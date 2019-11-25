package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_utama2.*

class menu_utama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama2)

        btn_video.setOnClickListener { startActivity(Intent(this, Video::class.java)) }
        btn_foto.setOnClickListener { startActivity(Intent(this,foto::class.java)) }
        btn_berita.setOnClickListener { startActivity(Intent(this,berita::class.java) )}
        btn_materi.setOnClickListener { startActivity(Intent(this, materi::class.java))}
        btn_musik.setOnClickListener { startActivity(Intent(this, musik::class.java)) }
        btn_jual.setOnClickListener { startActivity(Intent (this, jual_beli::class.java) ) }
        btn_sharing.setOnClickListener { startActivity(Intent(this, sharing::class.java)) }
        }
    }

