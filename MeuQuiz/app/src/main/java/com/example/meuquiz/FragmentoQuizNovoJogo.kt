package com.example.meuquiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentoQuizNovoJogo : Fragment(R.layout.fragmento_quiz_novo_jogo) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val botaoJogar: Button = view.findViewById(R.id.btnJogar)
        botaoJogar.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentoQuizNovoJogo_to_fragmentoQuizPergunta)
        }
    }
}