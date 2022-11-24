package com.example.minhasfinancas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterTransacoes(val transacoes: List<Transacao>) :

    RecyclerView.Adapter<AdapterTransacoes.TransacaoViewHolder>() {

    class TransacaoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageview)
        val textViewValor: TextView = view.findViewById(R.id.textViewValor)
        val textViewCategoria: TextView = view.findViewById(R.id.Categoria)

    }

    override fun getItemCount(): Int {
        return transacoes.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransacaoViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_transacao, parent, false)
        return TransacaoViewHolder(view)

    }

    override fun onBindViewHolder(holder: TransacaoViewHolder, position: Int) {
        val transacao: Transacao = transacoes[position]
        holder.textViewValor.text = transacao.valor
        holder.textViewCategoria.text = transacao.categoria

        val imageResource: Int = if (transacao.retirada) {
            R.drawable.ic_dinheiro_vermelho
        } else {
            R.drawable.ic_dinheiro_verde
        }
        holder.imageView.setImageResource(imageResource)
    }
}

