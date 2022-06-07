package com.example.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.navdemo.databinding.FragmentVerifyDetailsBinding

class VerifyDetailsFragment : Fragment() {

    private var _binding: FragmentVerifyDetailsBinding? = null
    private val binding get() = _binding!!


//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentVerifyDetailsBinding.inflate(inflater, container, false)

        val name = arguments?.getString("name")
        val mobileNumber = arguments?.getLong("mobile")

//        val rootView = inflater.inflate(R.layout.fragment_verify_details, container, false)
//        val tvName = rootView.findViewById<TextView>(R.id.tv_name)
//        val tvMobileNumber = rootView.findViewById<TextView>(R.id.tv_mobile_number)

        binding.tvName.text = name
        binding.tvMobileNumber.text = mobileNumber.toString()

        // Inflate the layout for this fragment
        return binding.root
    }

}