package com.example.neoregister.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.neoregister.R
import com.example.neoregister.databinding.PopularItemBinding
import com.example.neoregister.models.MenuCategoryCard
import com.example.neoregister.models.PopularCard

class PopularAdapter: RecyclerView.Adapter<PopularAdapter.PopCardViewHolder>() {

    private var list = listOf<MenuCategoryCard>()

    fun setList(list:List<MenuCategoryCard>){
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopCardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PopularItemBinding.inflate(inflater, parent,false)

        return PopCardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PopCardViewHolder, position: Int) {
        val card = list[position]
        with(holder.binding){
            holder.itemView.tag=card
            cardId.tag = card
            popularTxt.text = card.name
            popularPrice.text = card.price

            if (card.image != null){
                Glide.with(popularImg.context)
                    .load(card.image)
                    .placeholder(R.drawable.snack)
                    .error(R.drawable.snack)
                    .into(popularImg)
            }else{
                Glide.with(popularImg.context).clear(popularImg)
                popularImg.setImageResource(R.drawable.snack)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class PopCardViewHolder(
        val binding: PopularItemBinding
    ): RecyclerView.ViewHolder(binding.root)
}