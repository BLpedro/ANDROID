package com.example.aulafragmentos
import  androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentosPageAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int{
     return 5
    }
    override fun createFragment(position : Int): Fragment{
       return when(position){
            0 -> {
                FragmentoA()
            }
            1 -> {
                FragmentoB()
            }
            2 -> {
                FragmentoC()
            }
           3 -> {
               FragmentoD()
           }

           else -> {
               FragmentoE()
           }
        }
    }
}