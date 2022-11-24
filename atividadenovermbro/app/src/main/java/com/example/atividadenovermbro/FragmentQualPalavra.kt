package com.example.atividadenovermbro

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentQualPalavra : Fragment(R.layout.fragmento_qual_palavra) {

    val palavras: List<String> = listOf(
        "eleiçoes",
        "aluno",
        "copa do mundo",
        "aniversario"


    )
    var acertou: Int = 0
    var pulou: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewPalavra: TextView = view.findViewById(R.id.txtPalavra)
        textViewPalavra.text = palavras.shuffled()[0]

        val buttonAdvinhei: Button = view.findViewById(R.id.button2)
        buttonAdvinhei.setOnClickListener {
            Toast.makeText(requireContext(), "acertou", Toast.LENGTH_SHORT).show()
            acertou++
            textViewPalavra.text = palavras.shuffled()[0]
        }

        val buttonPular: Button = view.findViewById(R.id.button3)
        buttonPular.setOnClickListener {
            Toast.makeText(requireContext(), "pulou", Toast.LENGTH_SHORT).show()
            pulou++
            textViewPalavra.text = palavras.shuffled()[0]
        }
        val buttonTerminar: Button = view.findViewById(R.id.button4)
        buttonTerminar.setOnClickListener {
            val parametros: Bundle = bundleOf(
                "pulos" to pulou,
            "acertos" to acertou
            )
            findNavController().navigate(R.id.action_fragmentQualPalavra_to_fragmentoFimDeJogo, parametros)
        }
    }
}