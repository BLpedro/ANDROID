package com.example.minhasfinancas

import android.icu.text.NumberFormat
import android.icu.util.Currency
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

/**
 * Nome: Pedro Barros Lemos
 */

class MainActivity : AppCompatActivity() {

    private val transacoes: MutableList<Transacao> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getTransacoes(): List<Transacao> {
        return transacoes
    }

    fun getTotal(): String {
        return formatNumber(transacoes.sumBy { if (it.retirada) it.valor.toInt() * -1 else it.valor.toInt() })

    }

    private fun formatNumber(value: Int): String {
        return NumberFormat.getCurrencyInstance()
            .apply {
                maximumFractionDigits = 2
                currency = Currency.getInstance(Locale("pt", "BR"))
            }
            .format(value)
    }

    fun salvarTransacao(transacao: Transacao) {
        transacoes.add(transacao)
    }
}