package com.example.sample21.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sample21.R
import com.example.sample21.databinding.FragmentCreateGoalBinding
import com.example.sample21.databinding.FragmentGoalsDashboardBinding
import com.example.sample21.databinding.FragmentHomeBinding


class GoalsDashboardFragment : Fragment() {

    private lateinit var binding: FragmentGoalsDashboardBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentGoalsDashboardBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnCancel.setOnClickListener {
            findNavController().navigate(R.id.depositFragment)
        }
    }
}