package com.example.neoregister.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neoregister.MainScreenActivity
import com.example.neoregister.R
import com.example.neoregister.databinding.ActivityLogCodeBinding

class LogCodeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogCodeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLogCodeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()

        actionBar?.hide()

//        binding.confirmButton.isEnabled=false
//        binding.resendButton.isEnabled=false


        binding.confirmButton.setOnClickListener {
            val intent = Intent(this, MainScreenActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}