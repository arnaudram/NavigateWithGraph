package com.example.navigatewithgraph.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigatewithgraph.databinding.FragmentFeedbackBinding

class FeedBackFragment:Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding=FragmentFeedbackBinding.inflate(inflater)

        return binding.root
    }
}