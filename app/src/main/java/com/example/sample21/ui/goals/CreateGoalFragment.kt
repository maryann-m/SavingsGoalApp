package com.example.sample21.ui.goals

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sample21.R
import com.example.sample21.databinding.FragmentCreateGoalBinding
import com.example.sample21.databinding.FragmentHomeBinding
import com.example.sample21.utils.showDialog


class CreateGoalFragment : Fragment() {

    private lateinit var binding: FragmentCreateGoalBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCreateGoalBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUi()

    }

    private  fun setUpUi(){

        binding.btnFun.setOnClickListener { showDialog("Dubai Savings Trip"){findNavController().navigate(R.id.goalsDashboardFragment)} }

    }




}