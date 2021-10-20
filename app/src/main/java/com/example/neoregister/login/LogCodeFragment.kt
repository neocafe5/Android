package com.example.neoregister.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.neoregister.MainScreenActivity
import com.example.neoregister.databinding.FragmentLogCodeBinding

class LogCodeFragment : Fragment() {

    private lateinit var fragmentBinding : FragmentLogCodeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentBinding = FragmentLogCodeBinding.inflate(inflater, container, false)

        fragmentBinding.confirmButton.isEnabled=true
        fragmentBinding.confirmButton.setOnClickListener {
            val intent = Intent (getActivity(), MainScreenActivity::class.java)
            getActivity()?.startActivity(intent)
        }
        return fragmentBinding.root
    }

}