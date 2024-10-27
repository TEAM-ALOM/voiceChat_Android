package com.alom.voicechat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alom.voicechat.databinding.FragmentSocialBinding
import com.alom.voicechat.databinding.FragmentVoiceDemoBinding
import com.alom.voicechat.playback.DemoVoicePlayer
import com.alom.voicechat.record.DemoVoiceRecorder
import java.io.File

class VoiceDemoFragment : Fragment() {
    private lateinit var binding: FragmentVoiceDemoBinding

    private val recorder by lazy {
        activity?.let { DemoVoiceRecorder(it.applicationContext) }
    }

    private val player by lazy {
        activity?.let { DemoVoicePlayer(it.applicationContext) }
    }

    private var voiceFile: File? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVoiceDemoBinding.inflate(layoutInflater, container, false)
        binding.recordStart.setOnClickListener{
            File(context.cacheDir, "audio.mp3").also {
                recorder?.start(it)
                voiceFile = it
            }
        }
        binding.recordStop.setOnClickListener{
            recorder?.stop()
        }
        binding.playStart.setOnClickListener{
            player?.playFile(voiceFile)
        }
        binding.playStop.setOnClickListener{
            player?.stop()
        }
        return binding.root
    }
}