package com.example.sample21.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sample21.R
import com.example.sample21.databinding.FragmentHomeBinding
import com.example.sample21.ui.adapters.ImageSliderAdapter


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpAdapter()
        binding.addGoal.setOnClickListener {
            findNavController().navigate(R.id.createGoalFragment)
        }
    }



    private fun setUpAdapter(){
        val images = listOf(R.drawable.ad1, R.drawable.ad2)
        val viewPager = binding.imageSlider
        viewPager.adapter = ImageSliderAdapter(images)

    }

}