package com.example.neoregister.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import com.example.neoregister.MainScreenActivity
import com.example.neoregister.R
import com.example.neoregister.databinding.ActivityRegistrationBdateBinding

class RegistrationBDateActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRegistrationBdateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()

        binding.button.isEnabled=false
        binding.editTextBdate.addTextChangedListener {
            if(it.toString().length!!<10){
                binding.button.isEnabled=false
                markButtonDisable(binding.button)
            }else{
                markButtonEnable(binding.button)
                binding.button.isEnabled=true
                binding.button.isClickable=true
            }
        }

        binding.button.setOnClickListener {
            sendMessage(view)
        }

    }

    private fun sendMessage(view: View?) {
        val editText = binding.editTextBdate
        val message = editText.text.toString()
        val intent = Intent (this, MainScreenActivity::class.java)
        startActivity(intent)
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