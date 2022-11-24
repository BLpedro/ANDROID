package com.example.meuquiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentoQuizErrou : Fragment(R.layout.fragmento_quiz_errou) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewResposta: TextView = view.findViewById(R.id.textViewResposta)
        textViewResposta.text = requireArguments().getString("resposta")

        val botaoJogarNovamente: Button = view.findViewById(R.id.buttonJogarNovamente)
        botaoJogarNovamente.setOnClickListener{
            findNavController().navigateUp()
        }
    }
}