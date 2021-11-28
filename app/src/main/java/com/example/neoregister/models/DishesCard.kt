package com.example.neoregister.models

import com.google.gson.annotations.SerializedName

data class DishesCard(
    @SerializedName("data")
    val data : List<MenuCategoryCard>,
    val total: Long
)