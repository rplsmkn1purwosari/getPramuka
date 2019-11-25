package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lihat_jualbeli_hasduk.*

class lihat_jualbeli_hasduk : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihat_jualbeli_hasduk)
        btn_chat_1.setOnClickListener { Toast.makeText(this, "Segera Datang", Toast.LENGTH_SHORT).show() }
        btn_beli_sekarang_1.setOnClickListener { Toast.makeText(this, "Segera Datang", Toast.LENGTH_SHORT).show() }
    }
}
