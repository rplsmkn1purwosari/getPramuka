package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.VideoView

class lihat_video : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihat_video)

        val videoView = findViewById<VideoView>(R.id.video)
        val path = "android.resource://" + packageName + "/" + R.raw.v_kewer
        videoView?.setVideoURI(Uri.parse(path))

        val button = findViewById<Button>(R.id.btn_oper_video)
        button?.setOnClickListener({
            val isPlaying = videoView.isPlaying
            button.setText(if (isPlaying) R.string.play else R.string.pause)

            val msg = getString(if (isPlaying) R.string.paused else R.string.playing)
            Toast.makeText(this@lihat_video, msg, Toast.LENGTH_SHORT).show()
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
        })
    }
}
