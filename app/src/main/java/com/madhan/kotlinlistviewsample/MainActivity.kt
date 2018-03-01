package com.madhan.kotlinlistviewsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listdata: ArrayList<Fruits> = ArrayList()
        listdata.add(Fruits(name = "Apple"))
        listdata.add(Fruits(name = "Banana"))
        listdata.add(Fruits(name = "Cucumber"))
        listdata.add(Fruits(name = "Guava"))
        listdata.add(Fruits(name = "JackFruit"))
        listdata.add(Fruits(name = "Mango"))
        listdata.add(Fruits(name = "Orange"))
        listdata.add(Fruits(name = "Pineapple"))
        listdata.add(Fruits(name = "Pomegranate"))

        val adapter = FruitsListAdapter(data = listdata, context = this)
        this.list.adapter = adapter
    }
}
