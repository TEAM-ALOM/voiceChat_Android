package com.alom.voicechat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alom.voicechat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val mainFragment = MainFragment()
        val myPageFragment = MyPageFragment()
        val socialFragment = SocialFragment()

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.fcv_fragment, mainFragment).commit()

        binding.bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.main -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcv_fragment, mainFragment).commit()
                    true
                }
                R.id.social -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcv_fragment, socialFragment).commit()
                    true
                }
                R.id.myPage -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcv_fragment, myPageFragment).commit()
                    true
                }
                else -> false
            }
        }

    }
}