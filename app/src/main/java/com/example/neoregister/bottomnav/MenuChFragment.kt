package com.example.neoregister.bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.neoregister.R
import com.example.neoregister.adapters.MenuAdapter
import com.example.neoregister.databinding.FragmentHomeBinding
import com.example.neoregister.databinding.FragmentMenuChBinding
import com.example.neoregister.models.MenuCard

class MenuChFragment : Fragment() {

    private lateinit var binding: FragmentMenuChBinding
    private lateinit var menuAdapter: MenuAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        activity?.title = "Меню"
        binding = FragmentMenuChBinding.inflate(layoutInflater)

        val menuItems = mutableListOf<MenuCard>(
            MenuCard(1, "https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Кофе"),
            MenuCard(2, "https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Чай"),
            MenuCard(2, "https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Чай")
        )

        menuAdapter = MenuAdapter(menuItems)
        binding.categoryItemRecView.layoutManager =
            GridLayoutManager(requireContext(), 2)


        binding.categoryItemRecView.adapter = menuAdapter

        return binding.root
    }

}