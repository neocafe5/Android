package com.example.neoregister.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.neoregister.models.DishesCard
import com.example.neoregister.repository.MainRepository
import com.example.neoregister.utils.logging
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel() : ViewModel() {

    private val repository = MainRepository()
    val list = MutableLiveData<DishesCard>()


    fun getAllData() {
        repository.getAllDishes().enqueue(object:Callback<DishesCard>{
            override fun onResponse(
                call: Call<DishesCard>,
                response: Response<DishesCard>
            ) {
                list.postValue(response.body())
                "onResponse".logging()
            }

            override fun onFailure(call: Call<DishesCard>, t: Throwable) {
                Log.i("TAG", t.message ?: "Error")
            }

        })
    }

}