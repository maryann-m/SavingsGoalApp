package com.example.sample21.ui.deposit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sample21.R
import com.example.sample21.databinding.FragmentDepositBinding
import com.example.sample21.databinding.FragmentWithdrawBinding
import com.example.sample21.utils.setUpHeader

class DepositFragment : Fragment() {


    private lateinit var binding: FragmentDepositBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDepositBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }


}