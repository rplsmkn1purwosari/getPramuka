package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        btn_masuk.setOnClickListener { startActivity(Intent(this, menu_utama::class.java)) }
        btn_daftar_log.setOnClickListener{startActivity(Intent(this, daftar_akun::class.java))}
    }
}
