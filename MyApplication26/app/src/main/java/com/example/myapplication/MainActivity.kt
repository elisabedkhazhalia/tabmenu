package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapters.ViewPageFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout:TabLayout
    private lateinit var viewPager: ViewPager2
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tabLayout = findViewById(R.id.tabLatout)
        viewPager = findViewById(R.id.viewPager2)

        viewPager.adapter = ViewPageFragmentAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab: TabLayout.Tab, i: Int ->
            if(i==0){
                tab.setIcon(R.drawable.home)
            }else if(i==1){
                tab.setIcon(R.drawable.settings)
            }else if(i==2){
                tab.setIcon(R.drawable.notifications)
            }
        }.attach()
    }


}