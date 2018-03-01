package com.madhan.kotlinlistviewsample

/**
 * Created by madhan on 01/03/18.
 */
open class Fruits(var name: String) {//This class is inheritable. The open keyword allows other classes to inherit this class.
init {
    println("Fruit name : $name")
}

    override fun toString() = name
}