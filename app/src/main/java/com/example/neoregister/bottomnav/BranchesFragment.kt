package com.example.neoregister.bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neoregister.R
import com.example.neoregister.adapters.BranchAdapter
import com.example.neoregister.databinding.FragmentBranchesBinding
import com.example.neoregister.models.BranchCard

class BranchesFragment : Fragment() {

    private lateinit var binding :FragmentBranchesBinding
    private lateinit var branchAdapter : BranchAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.title="Филиалы"
        // Inflate the layout for this fragment
        binding = FragmentBranchesBinding.inflate(layoutInflater)

        val branchItems = mutableListOf<BranchCard>(
            BranchCard(1, "https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Абдырахманова 36","09:00-22:00"),
            BranchCard(1, "https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Абдырахманова 36","09:00-22:00"),
            BranchCard(1, "https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true", "Абдырахманова 36","09:00-22:00")
        )

        branchAdapter = BranchAdapter(branchItems)

        binding.branchItemsRecView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        binding.branchItemsRecView.adapter = branchAdapter

        return binding.root
    }

}