package com.example.aulafragmentos

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import java.util.*
import java.util.zip.Inflater

class FragmentoCicloDeVida: Fragment(R.layout.fragment_ciclo_de_vida) {
    var data: Date? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = Date()
        Log.i("cicloDeVida", "onCreate")
    }

    override fun  onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("cicloDeVida", "onCreateView")
        return inflater.inflate(R.layout.fragment_ciclo_de_vida, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button: Button = view.findViewById(R.id.button)
        Log.i("cicloDeVida", "onViewCreated")

    }
    override fun onResume(){
    super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
