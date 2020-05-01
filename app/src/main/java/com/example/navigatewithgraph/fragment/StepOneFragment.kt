package com.example.navigatewithgraph.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigatewithgraph.R
import com.example.navigatewithgraph.databinding.FragmentStepOneBinding

class StepOneFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding=FragmentStepOneBinding.inflate(inflater)
            binding.constraintLayout.background=resources.getDrawable(R.drawable.background_step_one,null)
        binding.buttonNextOne.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(StepOneFragmentDirections.actionStepOneFragmentToStepTwoFragment())
        }
        return binding.root
    }
}