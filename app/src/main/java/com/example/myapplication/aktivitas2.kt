package com.example.myapplication

import android.app.Dialog
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login.*


class aktivitas2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        NetWorkTask(this).execute()
        btn_masuk.setOnClickListener { startActivity(Intent(this, menu_utama::class.java)) }
        btn_daftar_log.setOnClickListener{startActivity(Intent(this, daftar_akun::class.java))}

    }


    class NetWorkTask(var activity: aktivitas2) : AsyncTask<Void, Void, Void>(){
            var dialog = Dialog(activity, android.R.style.Theme_Translucent_NoTitleBar)

        override fun onPreExecute() {
            val view = activity.layoutInflater.inflate(R.layout.activity_akititas2, null)
            dialog.setContentView(view)
            dialog.setCancelable(false)
            dialog.show()
            super.onPreExecute()


        }

        override fun doInBackground(vararg p0: Void?): Void? {
            Thread.sleep(3000)
            return null
        }

        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
            dialog.dismiss()
        }
    }
}

