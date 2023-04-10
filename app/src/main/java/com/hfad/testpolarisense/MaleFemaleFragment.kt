package com.hfad.testpolarisense

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction


import com.hfad.testpolarisense.databinding.FragmentMaleFemaleBinding


class MaleFemaleFragment : Fragment() {

    private lateinit var binding: FragmentMaleFemaleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentMaleFemaleBinding.inflate(layoutInflater)
    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.radioButton.setOnClickListener{

            binding.radioButton.setBackgroundColor(R.drawable.button_selector)

        }
        binding.radioButton2.setOnClickListener{

            binding.radioButton2.setBackgroundColor(R.drawable.button_selector)

        }
        binding.button3.setOnClickListener{
                parentFragmentManager.beginTransaction()
                .replace(R.id.male_female_fragment, InfoUser())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }

        return inflater.inflate(R.layout.fragment_male_female, container, false)

    }

}