package com.example.navigatewithgraph.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigatewithgraph.databinding.FragmentStepTwoBinding

class StepTwoFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding=FragmentStepTwoBinding.inflate(inflater)
        binding.buttonNextTwo.setOnClickListener {
            view?.findNavController()?.navigate(StepTwoFragmentDirections.actionStepTwoFragmentToFragmentStepThree()
            )
        }
        return binding.root
    }
}