package com.example.navigatewithgraph.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigatewithgraph.R
import com.example.navigatewithgraph.databinding.FragmentStepThreeBinding

class StepThreeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding=FragmentStepThreeBinding.inflate(inflater)
         binding.buttonNextThree.setOnClickListener {
             Navigation.findNavController(requireView()).navigate(StepThreeFragmentDirections.actionFragmentStepThreeToStepFourFragment())
         }
        return binding.root
    }
}