package com.example.pizzaorderapp_sohee.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzaorderapp_sohee.fragments.ChickenStoreListFragment
import com.example.pizzaorderapp_sohee.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm : FragmentManager) :FragmentPagerAdapter(fm){

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "피자 가게"
            else -> "치킨 가게"
        }
    }

    override fun getItem(position: Int): Fragment {
       return when(position) {
           0-> PizzaStoreListFragment()
           else -> ChickenStoreListFragment()
       }
    }

    override fun getCount(): Int {
        return 2
    }
}