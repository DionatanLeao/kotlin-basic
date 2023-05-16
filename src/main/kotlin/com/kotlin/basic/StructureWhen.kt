package com.kotlin.basic

fun main() {
    val x = 13
    when(x) {
        5, -5 -> println("Five")
        6 -> println("Six")
        10 -> {
            println("Ten")
            println("Any information")
        }
        in 11 .. 15 -> println("x between eleven and fifteen")
        !in 16 .. 20 -> println("x not between sixteen and twenty")
        else -> println("Number not found")
    }
    println(startWithHello("hello"))
    println(startWithHello(5))

    when {
        startWithHello(5) -> println("5")
        startWithHello("hello, its ok?") -> println("Oi, tudo bem?")
    }
}

fun startWithHello(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("hello")
        else -> false
    }
}

