package com.kotlincourse.fragmentpractice.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kotlincourse.fragmentpractice.Fragment.BlankFragment

class MainViewPageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private val mfragmentSize: Int = 9 //variable where we set the size of the array "9 colors"

    override fun getItemCount(): Int {
        return mfragmentSize //Remember that this function just return the size.
    }

    override fun createFragment(position: Int): Fragment {
        return BlankFragment.newInstance(position)!!
    }
}