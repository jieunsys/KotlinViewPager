package com.example.kotlinviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if(position == 0) return AddressFragment()
        else return PhoneFragment()
    }

    override fun getCount(): Int {
        return 2
    }
}