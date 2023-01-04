package com.example.yemektarifleri.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yemektarifleri.R
import com.example.yemektarifleri.databinding.FragmentGirisYapBinding
import com.example.yemektarifleri.databinding.FragmentLoginBinding
import com.example.yemektarifleri.databinding.FragmentRegisterBinding

class GirisYapFragment : Fragment() {

    private var _binding:FragmentGirisYapBinding?=null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
          _binding=FragmentGirisYapBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}