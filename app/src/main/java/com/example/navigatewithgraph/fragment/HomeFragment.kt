package com.example.navigatewithgraph.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigatewithgraph.R
import com.example.navigatewithgraph.databinding.FragmentHomeBinding

class HomeFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding=FragmentHomeBinding.inflate(inflater)
        binding.buttonStart.setOnClickListener{
            Navigation.findNavController(requireView()).navigate(HomeFragmentDirections.actionHomeFragmentToStepOneFragment())
        }

        return binding.root
    }
}