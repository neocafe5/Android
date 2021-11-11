package com.example.neoregister.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.neoregister.R
import com.example.neoregister.databinding.BranchItemBinding
import com.example.neoregister.models.BranchCard

class BranchAdapter(private val cardsbranch : List<BranchCard>): RecyclerView.Adapter<BranchAdapter.BranchCardViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BranchCardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = BranchItemBinding.inflate(inflater,parent,false)

        return  BranchCardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BranchCardViewHolder, position: Int) {
        val card = cardsbranch[position]
        with(holder.binding){
            holder.itemView.tag = card
            cardId.tag =card
            addressTxt.text = card.address
            timeTxt.text = card.time

            if(card.img.isNotBlank()){
                Glide.with(branchImg.context)
                    .load(card.img)
                    .placeholder(R.drawable.branches)
                    .error(R.drawable.branches)
                    .into(branchImg)
            }else{
                Glide.with(branchImg.context).clear(branchImg)
                branchImg.setImageResource(R.drawable.branches)
            }
        }
    }

    override fun getItemCount(): Int = cardsbranch.size

    class BranchCardViewHolder(
        val binding: BranchItemBinding
    ):RecyclerView.ViewHolder(binding.root)
}