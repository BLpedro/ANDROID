package com.example.minhasfinancas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterCategorias (
    val categorias: List<String>,
    val callback: (String) -> Unit
) : RecyclerView.Adapter<AdapterCategorias.CategoriasViewHolder>() {

    class CategoriasViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewCategoria: TextView = view.findViewById(R.id.Categoria)
    }

    override fun getItemCount(): Int {
        return categorias.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriasViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_categoria, parent, false)
        return CategoriasViewHolder(view)

    }

    override fun onBindViewHolder(holder: CategoriasViewHolder, position: Int) {
        val categoria: String = categorias[position]
        holder.textViewCategoria.text = categoria
        holder.itemView.setOnClickListener { callback.invoke(categoria) }
    }
}