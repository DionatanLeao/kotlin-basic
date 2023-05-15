package com.kotlin.basic

fun main() {
    whileLessThanTen()
    println("-------------------------")
    doWhileLessThanTen()
}

fun whileLessThanTen() {
    var aux = 0
    while (aux < 10) {
        aux++
        println("aux: $aux")
    }
}

fun doWhileLessThanTen() {
    var aux = 0
    do {
        println("aux: $aux")
        aux++
    } while (aux < 10)
}