package com.kotlin.basic

class ReturnFunctions {

    fun numberInFull(num: Int): String {
        if (num == 5) {
            return "Five"
        }
        else if (num ==6) {
            return "Six"
        }
        return "Unexpected number"
    }
}

fun main() {
    val returnFunctions = ReturnFunctions()
    println(returnFunctions.numberInFull(5))
    println(returnFunctions.numberInFull(6))
    println(returnFunctions.numberInFull(12))
}