package com.example.neoregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import com.example.neoregister.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private var nameChecker:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        binding.button.isEnabled=false
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()

//        binding.editTextTextPersonName.addTextChangedListener {
//            if (it?.length!! <= 3){
//                nameChecker=0
//            }else{
//                nameChecker=1
//            }
//        }
        binding.editTextPhone.addTextChangedListener{
            if(it.toString()?.length!!<13){
                binding.button.isEnabled=false
                markButtonDisable(binding.button)
            }else{
                markButtonEnable(binding.button)
                binding.button.isEnabled=true
                binding.button.isClickable=true
            }
        }

        fun sendMessage(view: View) {
            val editText = findViewById<EditText>(R.id.editTextTextPersonName)
            val message = editText.text.toString()
            val intent = Intent(this, MainScreenActivity::class.java).apply {
                putExtra("EXTRA_MESSAGE", message)
            }
            startActivity(intent)
            finish()
        }
        binding.button.setOnClickListener {
            sendMessage(view)
        }

//        binding.editTextTextPersonName.addTextChangedListener(object: TextWatcher {
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                if(p0.toString().trim().length<3){
//                    binding.button.isEnabled = false
//                    markButtonDisable(binding.button)
//                }else{
//                    markButtonEnable(binding.button)
//                    binding.button.isClickable=true
//                }
//            }
//
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                if(p0.toString().trim().length<3){
//                    binding.button.isEnabled = false
//                    markButtonDisable(binding.button)
//                }else{
//                    markButtonEnable(binding.button)
//                    binding.button.isClickable=true
//                }
//
//            }
//
//            override fun afterTextChanged(p0: Editable?) {
//                if(p0.toString().trim().length<3){
//                    binding.button.isEnabled = false
//                    markButtonDisable(binding.button)
//                }else{
//                    markButtonEnable(binding.button)
//                    binding.button.isClickable=true
//                }
//            }
//        } )

    }
    fun markButtonDisable(button: Button) {
        button?.isEnabled = false
        button?.setTextColor(ContextCompat.getColor(binding.button.context, R.color.white))
        button?.setBackgroundColor(ContextCompat.getColor(binding.button.context, R.color.gray))
    }
    fun markButtonEnable(button: Button) {
        button?.isEnabled = true
        button?.setTextColor(ContextCompat.getColor(binding.button.context, R.color.white))
        button?.setBackgroundColor(ContextCompat.getColor(binding.button.context, R.color.purple_500))
    }
}