package com.example.minhasfinancas

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView

class FragmentoCategoriaTransacao : Fragment(R.layout.fragmento_categoria_transacao) {

    override fun onViewCreated(view: View, savedInstance: Bundle?) {
        super.onViewCreated(view, savedInstance)
        val recyclerViewCategorias: RecyclerView = view.findViewById(R.id.recyclerViewCategorias)
        recyclerViewCategorias.adapter =
            AdapterCategorias(
                categorias = listOf("alimentaçâo","salario","estudos"), callback = { categoria ->

                    val tipoRetirada: Boolean = requireArguments().getBoolean("tipo_retirada")
                    val valorTransacao: String = requireArguments().getString("valor_transacao")!!

                    val parametros = bundleOf(
                       "tipo_retirada" to tipoRetirada,
                        "valor_transacao" to valorTransacao,
                    "categoria_transacao" to categoria
                    )
                    findNavController().navigate(R.id.action_fragmentoCategoriaTransacao_to_fragmentoConfirmaTransacao, parametros)
                })
    }
}