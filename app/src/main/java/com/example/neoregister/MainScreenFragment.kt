package com.example.neoregister

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import com.example.neoregister.login.LoginEmptyFragment
import com.example.neoregister.registration.RegistrationEmptyFragment

class MainScreenFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_main_screen, container, false)

        val btReg = root.findViewById<Button>(R.id.buttonReg)
        btReg.setOnClickListener {
            val registrationFr = RegistrationEmptyFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.main_activity, registrationFr).commit()
        }

        val btLog = root.findViewById<Button>(R.id.buttonLog)
        btLog.setOnClickListener {
            val loginFr = LoginEmptyFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.main_activity, loginFr).commit()
        }
        return root
    }

}