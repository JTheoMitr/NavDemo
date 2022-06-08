package com.example.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.navdemo.databinding.FragmentEnterDetailsBinding


class EnterDetailsFragment : Fragment() {

    private var _binding: FragmentEnterDetailsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentEnterDetailsBinding.inflate(inflater, container, false)

        binding.btnVerifyDetails.setOnClickListener {

            val firstName = binding.etFirstName.text.toString()
            val mobile = binding.etMobile.text.toString()

            when {
                firstName.isEmpty() -> {
                    Toast.makeText(activity, "Enter Name", Toast.LENGTH_LONG).show()
                }
                mobile.isEmpty() -> {
                    Toast.makeText(activity, "Enter Mobile Number", Toast.LENGTH_LONG).show()
                }
                else -> {

                    findNavController().navigate(
                        EnterDetailsFragmentDirections
                            .actionEnterDetailsFragmentToVerifyDetailsFragment(firstName, mobile.toLong())
                    )

                }
            }
        }
        return binding.root
    }

}