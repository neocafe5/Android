package com.example.neoregister.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.neoregister.R
import com.example.neoregister.databinding.FragmentRegCodeBinding

class RegCodeFragment : Fragment() {
    private lateinit var fragmentBinding: FragmentRegCodeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentBinding = FragmentRegCodeBinding.inflate(inflater, container, false)

        fragmentBinding.confirmButton.setOnClickListener {
            sendMessage(view)
        }

        return fragmentBinding.root
    }

    private fun sendMessage(view: View?) {
        val bdateFr = RegistrationBDateFragment()
        val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
        transaction.replace(R.id.main_activity, bdateFr).commit()
    }

}