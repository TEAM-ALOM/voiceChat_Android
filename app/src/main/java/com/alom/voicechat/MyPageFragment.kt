package com.alom.voicechat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alom.voicechat.databinding.FragmentMyPageBinding

class MyPageFragment : Fragment() {
    private lateinit var binding:FragmentMyPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyPageBinding.inflate(layoutInflater, container, false)
        return inflater.inflate(R.layout.fragment_my_page, container, false)
    }
}