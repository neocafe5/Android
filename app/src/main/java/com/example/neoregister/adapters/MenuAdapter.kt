package com.example.neoregister.adapters

import android.view.LayoutInflater
import android.view.Menu
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.neoregister.R
import com.example.neoregister.databinding.MenuItemBinding
import com.example.neoregister.models.MenuCard

class MenuAdapter(private val cardsmenu : List<MenuCard>): RecyclerView.Adapter<MenuAdapter.MenuCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuCardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding =MenuItemBinding.inflate(inflater, parent, false)

        return MenuCardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuCardViewHolder, position: Int) {
        val card = cardsmenu[position]
        with(holder.binding){
            holder.itemView.tag = card
            cardId.tag = card
            menuTxt.text = card.name

            if(card.img.isNotBlank()){
                Glide.with(menuImg.context)
                    .load(card.img)
                    .placeholder(R.drawable.coffee)
                    .error(R.drawable.coffee)
                    .into(menuImg)
            }else{
                Glide.with(menuImg.context).clear(menuImg)
                menuImg.setImageResource(R.drawable.coffee)
            }
        }
    }

    override fun getItemCount(): Int = cardsmenu.size

    class MenuCardViewHolder(
        val binding : MenuItemBinding
    ): RecyclerView.ViewHolder(binding.root)
}