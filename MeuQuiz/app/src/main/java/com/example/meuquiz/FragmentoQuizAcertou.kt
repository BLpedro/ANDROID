package com.example.meuquiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentoQuizAcertou: Fragment(R.layout.fragmento_quiz_acertou) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val botaoJogarNovamente: Button = view.findViewById(R.id.buttonJogarNovamente)
        botaoJogarNovamente.setOnClickListener {
            findNavController().navigateUp()
        }
    }}