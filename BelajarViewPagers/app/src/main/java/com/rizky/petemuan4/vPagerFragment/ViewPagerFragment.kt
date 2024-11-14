package com.rizky.petemuan4.vPagerFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rizky.petemuan4.R
import com.rizky.petemuan4.databinding.FragmentViewPagerBinding
import com.rizky.petemuan4.vPagerFragment.screen.HalamanKedua
import com.rizky.petemuan4.vPagerFragment.screen.HalamanKetiga
import com.rizky.petemuan4.vPagerFragment.screen.HalamanPertama


class ViewPagerFragment : Fragment() {

    lateinit var  binding: FragmentViewPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)
        binding = FragmentViewPagerBinding.bind(view)
        val fragmentList = arrayListOf(
            HalamanPertama(),
            HalamanKedua(),
            HalamanKetiga()
        )

        val adapter = ViewPagerAdapter(fragmentList,
            requireActivity().supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter
        return  view
    }

}