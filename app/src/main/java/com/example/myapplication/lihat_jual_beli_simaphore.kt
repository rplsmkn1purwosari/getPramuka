package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lihat_jual_beli_simaphore.*

class lihat_jual_beli_simaphore : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihat_jual_beli_simaphore)
        btn_chat.setOnClickListener { Toast.makeText(this, "Segera Datang", Toast.LENGTH_SHORT).show() }
        btn_beli_sekarang.setOnClickListener { Toast.makeText(this, "Segera Datang", Toast.LENGTH_SHORT).show() }
    }
}
