package com.example.conectacargo.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.conectacargo.ServicoModel
import com.example.conectacargo.databinding.ServicosItemBinding

class ServicosAdapter(
    private val servicosList: List<ServicoModel>,

) : RecyclerView.Adapter<ServicosAdapter.ServicosViewHolder>(){


    class ServicosViewHolder(
        val binding: ServicosItemBinding
    ): RecyclerView.ViewHolder(binding.root){

        fun bind(
            servicos : ServicoModel
        ){
            binding.ivFotoServico.setImageResource(servicos.foto)
            binding.txTituloServico.text = servicos.titulo
            binding.txTextoServico.text = servicos.texto

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicosViewHolder {
        val binding = ServicosItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ServicosAdapter.ServicosViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ServicosViewHolder, position: Int) {
        holder.bind(servicosList[position])
    }

    override fun getItemCount() = servicosList.size




}
