package com.alom.voicechat.record

import java.io.File

interface VoiceRecorder {
    fun start(outputFile: File)
    fun stop()
}