package com.example.neoregister.data

import com.example.neoregister.models.DishesCard
import retrofit2.Call
import retrofit2.http.GET

interface API {

    @GET("/dishes")
    fun getDishes(): Call<DishesCard>
}