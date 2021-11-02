package com.example.neoregister.bottomnav

import android.app.ActionBar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neoregister.R
import com.example.neoregister.adapters.PopularAdapter
import com.example.neoregister.databinding.FragmentHomeBinding
import com.example.neoregister.models.PopularCard
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var binding :FragmentHomeBinding
    private lateinit var popAdater : PopularAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        val popItems = mutableListOf<PopularCard>(
            PopularCard(1,"https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Snack", "90s"),
            PopularCard(2,"https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Snack", "90s"),
            PopularCard(3,"https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Snack", "90s")
        )

        popAdater = PopularAdapter(popItems)


//        val layoutManager = LinearLayoutManager(view?.context)
//        binding.popularItemsRecView.layoutManager = layoutManager
        binding.popularItemsRecView.setLayoutManager(LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false))

        binding.popularItemsRecView.adapter = popAdater

        return binding.root
    }
}