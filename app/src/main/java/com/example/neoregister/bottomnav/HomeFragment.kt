package com.example.neoregister.bottomnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neoregister.R
import com.example.neoregister.adapters.MenuAdapter
import com.example.neoregister.adapters.PopularAdapter
import com.example.neoregister.databinding.FragmentHomeBinding
import com.example.neoregister.models.MenuCard
import com.example.neoregister.models.PopularCard
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var binding :FragmentHomeBinding
    private lateinit var popAdater : PopularAdapter
    private lateinit var menuAdapter: MenuAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        activity?.title = "Привет, Fatima"
        binding = FragmentHomeBinding.inflate(layoutInflater)

        val popItems = mutableListOf<PopularCard>(
            PopularCard(1,"https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Пончики", "90s"),
            PopularCard(2,"https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Чесночный багет с базиликом ", "90s"),
            PopularCard(3,"@drawable/peachsok.png", "Апельсиновый сок", "90s")
        )

        val menuItems = mutableListOf<MenuCard>(
            MenuCard(1, "https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Кофе"),
            MenuCard(2, "https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Чай"),
            MenuCard(3, "https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Чай")
        )

        popAdater = PopularAdapter(popItems)
        menuAdapter = MenuAdapter(menuItems)


//        val layoutManager = LinearLayoutManager(view?.context)
//        binding.popularItemsRecView.layoutManager = layoutManager
        binding.popularItemsRecView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.categoryItemRecView.layoutManager =
            GridLayoutManager(requireContext(), 2)

        binding.popularItemsRecView.adapter = popAdater
        binding.categoryItemRecView.adapter = menuAdapter

        binding.menuTitle.setOnClickListener {
//            findNavController().navigate(R.id.action_homeFragment_to_cartFragment)

            val fragmentManager2: FragmentManager? = fragmentManager
            val fragmentTransaction2: FragmentTransaction = fragmentManager2!!.beginTransaction()
            val fragment2 = MenuChFragment()
            fragmentTransaction2.addToBackStack("xyz")
            fragmentTransaction2.hide(this@HomeFragment)
            fragmentTransaction2.add(android.R.id.content, fragment2)
            fragmentTransaction2.commit()
        }

        binding.allPopularTv.setOnClickListener {
//            findNavController().navigate(R.id.action_homeFragment_to_cartFragment)

            val fragmentManager2: FragmentManager? = fragmentManager
            val fragmentTransaction2: FragmentTransaction = fragmentManager2!!.beginTransaction()
            val fragment2 = PopularChFragment()
            fragmentTransaction2.addToBackStack("xyz")
            fragmentTransaction2.hide(this@HomeFragment)
            fragmentTransaction2.add(android.R.id.content, fragment2)
            fragmentTransaction2.commit()
        }

        return binding.root
    }

}