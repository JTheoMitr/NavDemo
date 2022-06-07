package com.example.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.navdemo.databinding.FragmentEnterDetailsBinding


class EnterDetailsFragment : Fragment() {

    // assign the _binding variable initially to null and
    // also when the view is destroyed again it has to be set to null
    private var _binding: FragmentEnterDetailsBinding? = null

    // with the backing property of the kotlin we extract
    // the non null value of the _binding
    private val binding get() = _binding!!

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentEnterDetailsBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
//        val rootView = inflater.inflate(R.layout.fragment_enter_details, container, false)
//
//        val etName = rootView.findViewById<EditText>(R.id.et_first_name)
//        val etMobileNumber = rootView.findViewById<EditText>(R.id.et_mobile)
//
//        val btnVerifyDetails = rootView.findViewById<Button>(R.id.btn_verify_details)
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
                    val bundle = bundleOf(
                        "name" to firstName,
                        "mobile" to mobile.toLong()
                    )

                    findNavController().navigate(R.id.action_enterDetailsFragment_to_verifyDetailsFragment, bundle)
                }
            }
        }
        return binding.root
    }

}