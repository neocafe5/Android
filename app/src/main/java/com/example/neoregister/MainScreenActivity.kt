package com.example.neoregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.example.neoregister.databinding.ActivityMainBinding
import com.example.neoregister.databinding.ActivityMainScreenBinding
import com.example.neoregister.fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainScreenActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainScreenBinding


    private val homeFragment = HomeFragment()
    private val cartFragment = CartFragment()
    private val qrFragment = QRFragment()
    private val branchesFragment = BranchesFragment()
    private val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        replaceFragment(homeFragment)


        binding.bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> replaceFragment(homeFragment)
                R.id.ic_cart -> replaceFragment(cartFragment)
                R.id.ic_qr -> replaceFragment(qrFragment)
                R.id.ic_location -> replaceFragment(branchesFragment)
                R.id.ic_profile -> replaceFragment(profileFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}