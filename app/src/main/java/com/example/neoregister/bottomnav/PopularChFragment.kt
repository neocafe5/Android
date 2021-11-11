package com.example.neoregister.bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.neoregister.R
import com.example.neoregister.adapters.PopularAdapter
import com.example.neoregister.databinding.FragmentMenuChBinding
import com.example.neoregister.databinding.FragmentPopularChBinding
import com.example.neoregister.models.PopularCard

class PopularChFragment : Fragment() {

    private lateinit var binding : FragmentPopularChBinding
    private lateinit var popAdater : PopularAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        activity?.title = "Популярное"
        binding = FragmentPopularChBinding.inflate(layoutInflater)

        val popItems = mutableListOf<PopularCard>(
            PopularCard(1,"https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Пончики", "90s"),
            PopularCard(2,"https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Чесночный багет с базиликом ", "90s"),
            PopularCard(3,"https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Апельсиновый сок", "90s")
        )

        popAdater = PopularAdapter(popItems)

        binding.popularItemsRecView.layoutManager =
            GridLayoutManager(requireContext(), 2)

        binding.popularItemsRecView.adapter = popAdater

        return binding.root
    }

}