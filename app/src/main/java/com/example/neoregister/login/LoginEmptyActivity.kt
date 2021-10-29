package com.example.neoregister.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.FragmentTransaction
import com.example.neoregister.R
import com.example.neoregister.databinding.ActivityChooseBinding
import com.example.neoregister.databinding.ActivityLoginEmptyBinding

class LoginEmptyActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginEmptyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginEmptyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()

        binding.button.isEnabled=false
        binding.editTextPhone.addTextChangedListener {
            if(it.toString().length!!<13){
                binding.button.isEnabled=false
                markButtonDisable(binding.button)
            }else{
                markButtonEnable(binding.button)
                binding.button.isEnabled=true
                binding.button.isClickable=true
            }
        }

        binding.button.setOnClickListener {
            sendMessage(it)
        }
    }

    private fun sendMessage(view: View?) {
        val editText = binding.editTextPhone
        val message = editText.text.toString()
        val intent = Intent(this, LogCodeActivity::class.java)
        startActivity(intent)
        finish()
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