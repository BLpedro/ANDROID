package com.example.atividadenovermbro

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentoFimDeJogo: Fragment(R.layout.fragmento_fim) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val acertou: Int = requireArguments().getInt("acertos")
        val pulos: Int = requireArguments().getInt("pulos")

val textviewAcertos: TextView = view.findViewById(R.id.txtAcertos)
        val textviewPulos: TextView = view.findViewById(R.id.txtPulos)

        textviewAcertos.text = "Quantidade de acertos: " + acertou
        textviewPulos.text = "Quantidade de pulos: " + pulos


        val buttonJogarNovamente: Button = view.findViewById(R.id.btnJogarDnv)
        buttonJogarNovamente.setOnClickListener{
            findNavController().navigateUp()
        }
    }
}