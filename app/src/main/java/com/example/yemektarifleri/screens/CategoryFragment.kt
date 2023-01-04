package com.example.yemektarifleri.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yemektarifleri.R
import com.example.yemektarifleri.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {

    private var _binding:FragmentCategoryBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentCategoryBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}