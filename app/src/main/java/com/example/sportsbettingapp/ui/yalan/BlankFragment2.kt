package com.example.sportsbettingapp.ui.yalan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sportsbettingapp.R
import com.example.sportsbettingapp.databinding.FragmentBlank2Binding
import com.example.sportsbettingapp.databinding.FragmentLeagueBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BlankFragment2 : Fragment() {
    private lateinit var binding: FragmentBlank2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}