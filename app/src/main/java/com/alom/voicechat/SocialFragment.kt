package com.alom.voicechat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alom.voicechat.databinding.FragmentSocialBinding

class SocialFragment : Fragment() {
    private lateinit var binding: FragmentSocialBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSocialBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}