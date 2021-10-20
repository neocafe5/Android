package com.example.neoregister.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.FragmentTransaction
import com.example.neoregister.R
import com.example.neoregister.databinding.FragmentRegistrationEmptyBinding
import com.example.neoregister.registration.RegCodeFragment

class RegistrationEmptyFragment : Fragment() {

    private lateinit var fragmentBinding : FragmentRegistrationEmptyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentBinding = FragmentRegistrationEmptyBinding.inflate(inflater, container, false)

        fragmentBinding.button.isEnabled=false
        fragmentBinding.editTextPhone.addTextChangedListener {
            if(it.toString().length!!<13){
                fragmentBinding.button.isEnabled=false
                markButtonDisable(fragmentBinding.button)
            }else{
                markButtonEnable(fragmentBinding.button)
                fragmentBinding.button.isEnabled=true
                fragmentBinding.button.isClickable=true
            }
        }

        fragmentBinding.button.setOnClickListener {
            sendMessage(view)
        }

        return fragmentBinding.root
    }

    private fun sendMessage(view: View?) {
        val editText = fragmentBinding.editTextPersonName
        val message = editText.text.toString()
        val regFr = RegCodeFragment()
        val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
        transaction.replace(R.id.main_activity, regFr).commit()
    }

    fun markButtonDisable(button: Button) {
//        button?.isEnabled = false
//        button?.setTextColor(ContextCompat.getColor(fragmentBinding.button.context, R.color.white))
//        button?.setBackgroundColor(ContextCompat.getColor(fragmentBinding.button.context, R.color.gray))
    }
    fun markButtonEnable(button: Button) {
//        button?.isEnabled = true
//        button?.setTextColor(ContextCompat.getColor(fragmentBinding.button.context, R.color.white))
//        button?.setBackgroundColor(ContextCompat.getColor(fragmentBinding.button.context, R.color.purple_500))
    }

}