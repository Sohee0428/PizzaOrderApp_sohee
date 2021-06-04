package com.example.pizzaorderapp_sohee

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActicity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}