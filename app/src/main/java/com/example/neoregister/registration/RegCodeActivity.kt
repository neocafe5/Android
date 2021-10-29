package com.example.neoregister.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neoregister.MainScreenActivity
import com.example.neoregister.R
import com.example.neoregister.databinding.ActivityRegCodeBinding

class RegCodeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegCodeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegCodeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()

        binding.confirmButton.setOnClickListener {
            val intent = Intent(this, RegistrationBDateActivity::class.java )
            startActivity(intent)
            finish()
        }
    }
}