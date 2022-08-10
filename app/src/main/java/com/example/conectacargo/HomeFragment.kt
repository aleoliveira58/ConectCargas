package com.example.conectacargo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.conectacargo.Adapter.HomeAdapter
import com.example.conectacargo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentsList = listOf(Tab1Fragment(), Tab2Fragment(), Tab3Fragment())
        val fragmentsTitleList = listOf("Serviços", "Agendamento ", "Perfil")

        activity?.let {
            val viewPagerAdapter = HomeAdapter(
                fragmentManager = childFragmentManager,
                fragmentsList = fragmentsList,
                fragmentsTitleList = fragmentsTitleList
            )

            binding?.let { bindingNonNull ->
                with(bindingNonNull) {
                    vpViewPageAdapter.adapter = viewPagerAdapter
                    tlTabs.setupWithViewPager(vpViewPageAdapter)
                }
            }
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}