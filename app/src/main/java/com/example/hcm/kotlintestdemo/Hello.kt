package com.example.hcm.kotlintestdemo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by hcm on 2018/4/10.
 */
class  Hello : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }
}