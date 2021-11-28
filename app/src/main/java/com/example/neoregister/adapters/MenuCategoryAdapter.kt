package com.example.neoregister.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.neoregister.R
import com.example.neoregister.databinding.MenuItemBinding
import com.example.neoregister.models.MenuCategoryCard


class MenuCategoryAdapter(): RecyclerView.Adapter<MenuCategoryAdapter.MenuCategoryViewHolder>() {

    private var list = listOf<MenuCategoryCard>()

    fun setList(list:List<MenuCategoryCard>){
        this.list = list
        notifyDataSetChanged()
    }

    var onItemClickListener: ((MenuCategoryCard) -> Unit)? = null
    inner class MenuCategoryViewHolder(val binding : MenuItemBinding): RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener{
                onItemClickListener?.invoke(list[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuCategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MenuItemBinding.inflate(inflater, parent, false)
        return MenuCategoryViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MenuCategoryViewHolder, position: Int) {
        val card = list[position]

        with(holder.binding){
            holder.itemView.tag = card
            cardId.tag = card
            menuTxt.text = card.name

            if(card.image != null){
                Glide.with(menuImg.context)
                    .load(card.image)
                    .placeholder(R.drawable.coffee)
                    .error(R.drawable.coffee)
                    .into(menuImg)


            }else{
                Glide.with(menuImg.context).clear(menuImg)
                menuImg.setImageResource(R.drawable.coffee)
            }
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }



}