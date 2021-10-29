package com.example.neoregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neoregister.databinding.ActivityChooseBinding
import com.example.neoregister.login.LoginEmptyActivity
import com.example.neoregister.registration.RegistrationEmptyActivity

class ChooseActivity : AppCompatActivity() {
    private lateinit var binding : ActivityChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()

        binding.buttonLog.setOnClickListener {
            val intent = Intent(this, LoginEmptyActivity::class.java)
            startActivity(intent)
        }

        binding.buttonReg.setOnClickListener {
            val intent = Intent(this, RegistrationEmptyActivity::class.java)
            startActivity(intent)
        }
    }
}