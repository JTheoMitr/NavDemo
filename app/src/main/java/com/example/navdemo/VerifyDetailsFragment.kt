package com.example.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.navdemo.databinding.FragmentVerifyDetailsBinding

class VerifyDetailsFragment : Fragment() {

    private var _binding: FragmentVerifyDetailsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentVerifyDetailsBinding.inflate(inflater, container, false)

//        val name = arguments?.getString("name")
//        val mobileNumber = arguments?.getLong("mobile")

        val args : VerifyDetailsFragmentArgs by navArgs()
        val name = args.name
        val mobileNumber = args.mobile

        binding.tvName.text = name
        binding.tvMobileNumber.text = mobileNumber.toString()

        // Inflate the layout for this fragment
        return binding.root
    }

}