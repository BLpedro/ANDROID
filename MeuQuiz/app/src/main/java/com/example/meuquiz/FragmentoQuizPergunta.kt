package com.example.meuquiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlin.random.Random

class FragmentoQuizPergunta : Fragment(R.layout.fragmento_quiz_pergunta) {

    val questoes: List<Questao> = listOf(
        Questao(
            pergunta = "Qual a capital do Brasil?",
            alternativas = listOf("Brasilia", "Rio de Janeiro", " Belo Horizonte"),
            resposta = "Brasilia"
        ),
        Questao(
            pergunta = "Quanto é 1 + 1",
            alternativas = listOf("1", "2", "3"),
            resposta = "2"
        ),
        Questao(
            pergunta = "Qual a melhor materia?",
            alternativas = listOf("Android", "Ios", "Matematica"),
            resposta = "Android"
        )
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rnds = (0..2).random()
        val questao: Questao = questoes[rnds]

        val textViewQuestao: TextView = view.findViewById(R.id.textViewPergunta)
        textViewQuestao.text = questao.pergunta

        val radioButtonAlternativa1: RadioButton = view.findViewById(R.id.radioButton)
        radioButtonAlternativa1.text = questao.alternativas[0]
        val radioButtonAlternativa2: RadioButton = view.findViewById(R.id.radioButton2)
        radioButtonAlternativa2.text = questao.alternativas[1]
        val radioButtonAlternativa3: RadioButton = view.findViewById(R.id.radioButton3)
        radioButtonAlternativa3.text = questao.alternativas[2]

        val botaoContinuar: Button = view.findViewById(R.id.buttonContinuar)
        botaoContinuar.setOnClickListener {


            if (radioButtonAlternativa1.isChecked) {
                navegarTela(
                    acertou = radioButtonAlternativa1.text == questao.resposta,
                    questao = questao
                )

            } else if (radioButtonAlternativa2.isChecked) {
                navegarTela(radioButtonAlternativa2.text == questao.resposta, questao = questao)

            } else if (radioButtonAlternativa3.isChecked) {
                navegarTela(radioButtonAlternativa2.text == questao.resposta, questao = questao)
            }
        }
    }

    fun navegarTela(acertou: Boolean, questao: Questao) {
        val parametros: Bundle = bundleOf("resposta" to questao.resposta)
        if (acertou) {
            findNavController().navigate(R.id.action_fragmentoQuizPergunta_to_fragmentoQuizAcertou)
        } else {
            findNavController().navigate(R.id.action_fragmentoQuizPergunta_to_fragmentoQuizErrou, parametros)
        }
    }
}