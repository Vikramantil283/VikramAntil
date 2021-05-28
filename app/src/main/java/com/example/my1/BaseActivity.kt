package com.example.my1

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

abstract class BaseActivity : AppCompatActivity(){

private val tag= "BaseActivity"

    override fun setContentView(layoutID : Int){
        setContentView(layoutID)
       // super.onNightModeChanged()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        initUI()
        initListener()
        setData()
    }

    abstract fun initUI()

    abstract fun initListener()

    abstract fun setData()



}