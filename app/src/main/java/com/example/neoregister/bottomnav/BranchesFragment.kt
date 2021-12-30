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
            BranchCard(1, "https://media-cdn.tripadvisor.com/media/photo-s/16/10/98/71/photo0jpg.jpg", "Абдырахманова 36","09:00-22:00"),
            BranchCard(1, "https://media.timeout.com/images/105573652/image.jpg", "Абдырахманова 36","09:00-22:00"),
            BranchCard(1, "https://cdn.archilovers.com/projects/c_383_b7f357f3-4d5e-45e7-81d0-a49409edca05.jpg", "Абдырахманова 36","09:00-22:00")
        )

        branchAdapter = BranchAdapter(branchItems)

        binding.branchItemsRecView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        binding.branchItemsRecView.adapter = branchAdapter

        return binding.root
    }

}