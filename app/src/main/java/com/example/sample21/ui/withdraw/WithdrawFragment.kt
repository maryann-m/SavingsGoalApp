package com.example.sample21.ui.withdraw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sample21.R
import com.example.sample21.databinding.FragmentGoalsDashboardBinding
import com.example.sample21.databinding.FragmentWithdrawBinding
import com.example.sample21.utils.setUpHeader


class WithdrawFragment : Fragment() {


    private lateinit var binding: FragmentWithdrawBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentWithdrawBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpHeader(binding.header, "Withdraw") {findNavController().navigateUp()}
        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioYes -> {
                    binding.tilMeshChannel.visibility = View.GONE
                    binding.ttv6.visibility = View.GONE
                    binding.ttv6.visibility = View.GONE



                }
                R.id.radioNo -> {
                    binding.tilMeshChannel.visibility = View.VISIBLE
                    binding.ttv6.visibility = View.VISIBLE
                    binding.ttv6.visibility = View.VISIBLE

                }
            }
        }

    }

}