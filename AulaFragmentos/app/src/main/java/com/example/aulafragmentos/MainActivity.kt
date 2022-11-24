package com.example.aulafragmentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnViewpage: Button = findViewById(R.id.btnVirewPAge)
        var btnBottom: Button = findViewById(R.id.btnBottom)
        var btnSimples: Button = findViewById(R.id.btnSimples)

        btnViewpage.setOnClickListener {
            irViewPage()
        }
        btnBottom.setOnClickListener {
            irBottom()
        }
        btnSimples.setOnClickListener {
            irSimples()
        }
    }

    fun irViewPage() {
        val viewpage = Intent(this, FragmentosDeslizantesActivity()::class.java)
        startActivity(viewpage)
    }
    fun irBottom(){
        val bottom = Intent(this, BottomNavigationActivity()::class.java)
        startActivity(bottom)
    }

    fun irSimples(){
        val simples = Intent(this, FragmentoSimples()::class.java)
        startActivity(simples)
    }
}
