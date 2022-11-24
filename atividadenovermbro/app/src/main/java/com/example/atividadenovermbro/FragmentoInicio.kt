package com.example.atividadenovermbro

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentoInicio : Fragment(R.layout.fragmento_inicio) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonJogar: Button = view.findViewById(R.id.buttonJogar)
        buttonJogar.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentoInicio_to_fragmentQualPalavra)
        }

    }
}