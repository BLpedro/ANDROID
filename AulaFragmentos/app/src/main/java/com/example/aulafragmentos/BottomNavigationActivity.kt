package com.example.aulafragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_navigation_activity)

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener {

        when(it.itemId){
            R.id.favoritos ->{
                supportFragmentManager.beginTransaction().replace(R.id.container, FragmentoA()).commit()
            }
            R.id.home ->{
                supportFragmentManager.beginTransaction().replace(R.id.container, FragmentoB()).commit()
            }
        }
            true
        }
    }
}