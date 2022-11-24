package com.example.aulafragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class FragmentosDeslizantesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragmentos_deslizantes)

        val meuViewPager: ViewPager2 =findViewById(R.id.meuViewPage)
        meuViewPager.adapter = FragmentosPageAdapter(this)
    }
}