package com.alom.voicechat.playback

import android.content.Context
import android.media.MediaPlayer
import androidx.core.net.toUri
import java.io.File

class DemoVoicePlayer(
    private val context: Context
):VoicePlayer {

    private var player: MediaPlayer?= null
    override fun playFile(file: File) {
        MediaPlayer.create(context, file.toUri()).apply {
          player = this
          start()
        }
    }

    override fun stop() {
        player?.stop()
        player?.release()
        player = null
    }
}