package com.rizky.petemuan4.vPagerFragment.screen

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.rizky.petemuan4.R
import com.rizky.petemuan4.databinding.FragmentHalamanKetigaBinding


class HalamanKetiga : Fragment() {

    private  lateinit var  binding : FragmentHalamanKetigaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_halaman_ketiga,
            container, false)

        binding = FragmentHalamanKetigaBinding.bind(view)


        binding.txtHalNext.setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_halamanUtamaFragment)

        }
        return view
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Selsai", true)
        editor.apply()
    }

}