package com.kotlincourse.fragmentpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.kotlincourse.fragmentpractice.Adapters.MainViewPageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vpMainThree.adapter = MainViewPageAdapter(this)


        //we need a tab layout mediator, this mediator do all the steps we need in order that crete our fragment Manager in just 1 line od code
        TabLayoutMediator(tlMainThree, vpMainThree, TabLayoutMediator.TabConfigurationStrategy{tab, position -> tab.text = "Tab" + (position +1) }).attach()
        //With this line we are saying that TabLayout in the ActivityName will manage wherever have in the view page
        // text Tab will be added in each position
    }
}
