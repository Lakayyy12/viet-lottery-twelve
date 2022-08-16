package com.application.vietlotterytwelve.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.application.vietlotterytwelve.fragments.FragmentGuide
import com.application.vietlotterytwelve.fragments.FragmentTips
import com.application.vietlotterytwelve.fragments.FragmentWays

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }
    override fun createFragment(position: Int): Fragment {
       return when (position) {
            0 -> {
                FragmentWays()
            }
            1 -> {
                FragmentTips()
            }
            2 -> {
                FragmentGuide()
            }
            else -> {
                Fragment()
            }
        }
    }
}





