package com.example.navigatewithgraph.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

import androidx.navigation.ui.setupWithNavController
import com.example.navigatewithgraph.R
import com.example.navigatewithgraph.databinding.FragmentStepFourBinding


class StepFourFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding=FragmentStepFourBinding.inflate(inflater)

        /*val navController= view?.let { Navigation.findNavController(it) }
        navController?.let { binding.bottomNavigationView.setupWithNavController(it) }
*/

        return binding.root
    }
}