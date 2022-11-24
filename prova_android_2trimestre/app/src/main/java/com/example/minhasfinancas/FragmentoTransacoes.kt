package com.example.minhasfinancas

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView

class FragmentoTransacoes : Fragment(R.layout.fragmento_transacoes) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewCarteira: TextView = view.findViewById(R.id.textViewCarteira)
        textViewCarteira.text = (activity as MainActivity).getTotal()

        val recyclerViewTransacoes: RecyclerView = view.findViewById(R.id.recyclerviewTransacoes)


        val transacoes: List<Transacao> = (activity as MainActivity).getTransacoes()
        recyclerViewTransacoes.adapter = AdapterTransacoes(transacoes)


        val buttonAdicionar: Button = view.findViewById(R.id.buttonAdicionar)
        buttonAdicionar.setOnClickListener {
            val parametros: Bundle = bundleOf("tipo_retirada" to false)
            findNavController().navigate(
                R.id.action_fragmentoTransacoes_to_fragmentoValorTransacao,
                parametros
            )

        }

        val buttonRetirar: Button = view.findViewById(R.id.buttonRetirar)
        buttonRetirar.setOnClickListener {
            val parametros: Bundle = bundleOf("tipo_retirada" to true)
            findNavController().navigate(
                R.id.action_fragmentoTransacoes_to_fragmentoValorTransacao,
                parametros
            )

        }
    }

}