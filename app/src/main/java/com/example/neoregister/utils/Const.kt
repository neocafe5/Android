package com.example.neoregister.utils

import android.util.Log

object Const {
    const val  BASE_URL = "https://neocafe6.herokuapp.com"
}

fun String.logging(){
    Log.i("test", this)
}