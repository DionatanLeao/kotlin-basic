package com.kotlin.basic

fun main() {
    var name = "Name"
    val nameV = "Name Val"

    name = "Name Two"
//    nameV = "Name Val Two"

    val test = "test"
    println(test)
}

class Variables {
    lateinit var test: String

    fun startVariable() {
        test = "test"
    }
}