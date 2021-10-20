package com.example.neoregister.registration

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import com.example.neoregister.MainScreenActivity
import com.example.neoregister.databinding.FragmentRegistrationBdateBinding

class RegistrationBDateFragment : Fragment() {
    private lateinit var fragmentBinding: FragmentRegistrationBdateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = FragmentRegistrationBdateBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        fragmentBinding.button.isEnabled=false
        fragmentBinding.editTextBdate.addTextChangedListener {
            if(it.toString().length!!<10){
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
        val editText = fragmentBinding.editTextBdate
        val message = editText.text.toString()
        val intent = Intent (getActivity(), MainScreenActivity::class.java)
        getActivity()?.startActivity(intent)
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