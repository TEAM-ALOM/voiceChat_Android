package com.alom.voicechat.playback

import java.io.File

interface VoicePlayer {
    fun playFile(file: File)
    fun stop()
}