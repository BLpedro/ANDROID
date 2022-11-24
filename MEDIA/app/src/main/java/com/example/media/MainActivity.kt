package com.example.media


/*
Pedro Barros Lemos
22101063
41
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btcalcular : Button = findViewById(R.id.btncalcular)
        btcalcular.setOnClickListener {

            val numero3 : EditText = findViewById(R.id.num3)
            val string3 : String = numero3.text.toString()
            val num3    : Int = string3.toInt()

            val numero2 : EditText = findViewById(R.id.num2)
            val string2 : String = numero2.text.toString()
            val num2    : Int = string2.toInt()

            val numero1 : EditText = findViewById(R.id.num1)
            val string1 : String = numero1.text.toString()
            val num1    : Int = string1.toInt()

            val soma = num1 + num2 + num3
            val media = soma / 3


            if(media %2 == 0){
                Toast.makeText(this, "a media dos 3 numeros é par", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "a media dos 3 numeros é impar", Toast.LENGTH_LONG).show()
            }
        }
    }
}