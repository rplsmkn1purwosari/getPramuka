package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_video.*

class Video : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        btn_kewer.setOnClickListener{ startActivity(Intent(this, lihat_video::class.java)) }

//        val videoView = findViewById<VideoView>(R.id.v_kewer)
//        val path = "android.resource://" + packageName + "/" + R.raw.v_kewer
//        videoView?.setVideoURI(Uri.parse(path))
//
//        val button = findViewById<Button>(R.id.button)
//        button?.setOnClickListener({
//            val isPlaying = videoView.isPlaying
//            button.setText(if (isPlaying) R.string.play else R.string.pause)
//
//            val msg = getString(if (isPlaying) R.string.paused else R.string.playing)
//            Toast.makeText(this@Video, msg, Toast.LENGTH_SHORT).show()
//            if (isPlaying) {
//                videoView.pause()
//            } else {
//                videoView.start()
//            }
//        })


    }
}
