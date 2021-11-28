package com.example.neoregister.bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.neoregister.R
import com.example.neoregister.adapters.MenuAdapter
import com.example.neoregister.adapters.MenuCategoryAdapter
import com.example.neoregister.databinding.FragmentHomeBinding
import com.example.neoregister.databinding.FragmentMenuChBinding
import com.example.neoregister.models.MenuCard
import com.example.neoregister.viewmodel.MainViewModel

class MenuChFragment : Fragment() {

    private val menuAdapter by lazy {MenuCategoryAdapter()}
    private val mainViewModel by lazy { ViewModelProvider(this).get(MainViewModel::class.java) }
    private var _binding:FragmentMenuChBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        activity?.title = "Меню"
        _binding = FragmentMenuChBinding.inflate(layoutInflater)

        mainViewModel.getAllData()

        _binding!!.categoryItemRecView.apply {
            adapter=menuAdapter
            layoutManager = GridLayoutManager(requireContext(), 2)
        }

        mainViewModel.list.observe(viewLifecycleOwner){
            menuAdapter.setList(it.data)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}