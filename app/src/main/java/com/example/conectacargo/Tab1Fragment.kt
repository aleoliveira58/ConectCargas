package com.example.conectacargo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.conectacargo.Adapter.ServicosAdapter
import com.example.conectacargo.databinding.FragmentTab1Binding
import com.example.conectacargo.databinding.FragmentTab2Binding


class Tab1Fragment : Fragment() {

    private var binding: FragmentTab1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTab1Binding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listServicos = mutableListOf(
            ServicoModel(R.drawable.servico1, "Logística Reversa" , "Serviço de devolução e troca de mercadorias, com atendimento em todo o território nacional. Ideal para empresas que precisam de um retorno ágil de seus produtos."),
            ServicoModel(R.drawable.servico2 , "E-commerce" , "Serviço especializado no atendimento de toda cadeia logística do e-commerce e marketplace em todo território nacional."),
            ServicoModel(R.drawable.servico3 , "FTL (Cargas Lotação)" , "Serviço de transporte de carga lotação, com prazos de entrega de 24 a 48 horas nas principais capitais e de 72 a 96 horas nos interiores."),
            ServicoModel(R.drawable.servico4, "Emergencial" , "Serviço de coleta e entrega aéreo e rodoexpresso, com compromisso de embarque e entrega dentro de um tempo menor que os transportes convencionais."),
            ServicoModel(R.drawable.diferenciais1, "Tecnologia" , "TMS – Pesquisa diretamente no site Informação em tempo real – Status e Localização de sua carga on line EDI – Troca Eletrônica de Dados. Nossos clientes contam também com a agilidade da informação pois nossos motoristas utilizam aplicativo e fazem parte da gestão operacional."),
            ServicoModel(R.drawable.diferenciais2, "Gerenciamento 24h" , "Bases interligadas permitem melhor gerenciamento da sua carga. A mesma informação que a equipe Conecta possui, é disponibilizada na internet. Nosso conceito é de transparência e fidelidade na informação. Sua carga é vista de perto e de longe."),
            ServicoModel(R.drawable.diferencias3, "Segurança", "Parceria com as melhores seguradoras e gerenciadores de risco do mercado. Veículos rastreados e com tecnologia de ponta. Dados financeiros, comerciais e operacionais blindados pelo servidor da Conecta." )
        )

        val servicosAdapter = ServicosAdapter(
            servicosList = listServicos,
            )

        binding?.let{
            with(it){
                rvServicosRecyclerView.layoutManager = LinearLayoutManager(context)
                rvServicosRecyclerView.adapter = servicosAdapter
            }

        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}