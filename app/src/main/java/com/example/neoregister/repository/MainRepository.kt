package com.example.neoregister.repository

import com.example.neoregister.model.Client
import com.example.neoregister.models.DishesCard
import com.example.neoregister.utils.logging
import retrofit2.Call

class MainRepository() {

    val api = Client.getBaseApi()

    fun getAllDishes(): Call<DishesCard> {
        "getAllDishes".logging()
        return api.getDishes()
    }

}