package com.hfad.testpolarisense

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment


import com.hfad.testpolarisense.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
        splashScreen.setKeepOnScreenCondition{false}

        supportFragmentManager
            .beginTransaction()
            .add(R.id.male_female_fragment, MaleFemaleFragment())
            .addToBackStack(null)
            .commit()


    }
}

