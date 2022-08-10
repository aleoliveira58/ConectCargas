package com.example.conectacargo.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.conectacargo.DiferenciaisModel
import com.example.conectacargo.ServicoModel
import com.example.conectacargo.databinding.ServicosItemBinding

class DiferenciaisAdapter(
    private val diferenciaisList: List<DiferenciaisModel>,

    ) : RecyclerView.Adapter<DiferenciaisAdapter.DiferenciaisViewHolder>() {


    class DiferenciaisViewHolder(
        val binding: ServicosItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(
            servicos: DiferenciaisModel
        ) {
            binding.ivFotoServico.setImageResource(servicos.foto)
            binding.txTituloServico.text = servicos.titulo
            binding.txTextoServico.text = servicos.texto

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiferenciaisViewHolder {
        val binding = ServicosItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return DiferenciaisAdapter.DiferenciaisViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DiferenciaisViewHolder, position: Int) {
        holder.bind(diferenciaisList[position])
    }

    override fun getItemCount() = diferenciaisList.size
}