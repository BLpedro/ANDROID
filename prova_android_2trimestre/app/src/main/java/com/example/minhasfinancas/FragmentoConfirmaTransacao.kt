package com.example.minhasfinancas

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentoConfirmaTransacao : Fragment(R.layout.fragmento_confirma_transacao) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val valorTransacao: String = requireArguments().getString("valor_transacao")!!
        val categoriaTransacao: String = requireArguments().getString("categoria_transacao")!!
        val tipoRetirada: Boolean = requireArguments().getBoolean("tipo_retirada")

        val textViewValor: TextView = view.findViewById(R.id.textViewValor)
        textViewValor.text = valorTransacao

        val textViewCategoria: TextView = view.findViewById(R.id.textViewCategoria)
        textViewCategoria.text = categoriaTransacao


        val textViewTipo: TextView = view.findViewById(R.id.textViewTipo)

        val tipo: String = if (tipoRetirada) {
            "Retirada"
        } else {
            "Entrada"
        }
        textViewTipo.text = tipo

        val buttonSalvar: Button = view.findViewById(R.id.buttonSalvar)
        buttonSalvar.setOnClickListener {
            val transacao: Transacao = Transacao(
                valor = valorTransacao,
                categoria = categoriaTransacao,
                retirada = tipoRetirada
            )
            (activity as MainActivity).salvarTransacao(transacao)
            findNavController().navigateUp()
        }
    }
}