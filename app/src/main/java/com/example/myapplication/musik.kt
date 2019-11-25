package com.example.myapplication

import android.graphics.drawable.Drawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_musik.*

class musik : AppCompatActivity() {
    private lateinit var mp: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musik)
        mp = MediaPlayer.create (this, R.raw.laguku)
        var position = 0


        btn_download.setOnClickListener{Toast.makeText(this, "Segera Datang", Toast.LENGTH_SHORT).show()}

        btn_oper_musik.setOnClickListener {
            val isPlaying = mp.isPlaying
            btn_oper_musik.setImageResource(if (isPlaying) R.drawable.play else R.drawable.pause)

            if (isPlaying) {
                mp.pause()
            } else {
                mp.start()
            }
        }

        }

    override fun onDestroy () {
        super.onDestroy ()
        mp.release ()
    }
    }

