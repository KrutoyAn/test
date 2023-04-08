package com.hfad.testpolarisense

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.hfad.testpolarisense.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val firstFragment = InfoUser()
        val fm: FragmentManager = supportFragmentManager
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
        splashScreen.setKeepOnScreenCondition{false}


        binding.radioButton.setOnClickListener{
            binding.radioButton.setBackgroundColor(R.drawable.button_selector)

        }
        binding.radioButton2.setOnClickListener{

            binding.radioButton2.setBackgroundColor(R.drawable.button_selector)

        }

        binding.button3.setOnClickListener{
            if (savedInstanceState == null) {
            fm.beginTransaction()
                .add(R.id.info_user, firstFragment)
                .addToBackStack("myStack")
                .commit()
            }
        }

    }
}

