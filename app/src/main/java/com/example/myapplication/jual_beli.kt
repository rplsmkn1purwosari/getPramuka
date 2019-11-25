package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jual_beli.*

class jual_beli : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jual_beli)

        btn_jual_hasduk.setOnClickListener { startActivity(Intent(this, lihat_jualbeli_hasduk::class.java )) }
        btn_jual_simaphore.setOnClickListener { startActivity(Intent (this, lihat_jual_beli_simaphore::class.java)) }
    }
}
