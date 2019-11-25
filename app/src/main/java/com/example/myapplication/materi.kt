package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_materi.*

class materi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)
        btn_materi_morse.setOnClickListener { startActivity(Intent(this, lihat_materi_morse::class.java)) }
        btn_materi_simaphore.setOnClickListener { startActivity(Intent(this, Lihat_materi::class.java )) }
    }
}
