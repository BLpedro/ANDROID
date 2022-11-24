package com.example.minhasfinancas

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentoValorTransacao : Fragment(R.layout.fragmento_valor_transacao) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val tipoRetirada: Boolean = requireArguments().getBoolean("tipo_retirada")
        val editTextValorTransicao: EditText = view.findViewById(R.id.editTextValor)

        val buttonContinuar: Button = view.findViewById(R.id.buttonContinuar)

        buttonContinuar.setOnClickListener{
            val parametros = bundleOf(
                "tipo_retirada" to tipoRetirada,
                "valor_transacao" to editTextValorTransicao.text.toString(),

            )
            findNavController().navigate(R.id.action_fragmentoValorTransacao_to_fragmentoCategoriaTransacao, parametros)
        }
    }
}