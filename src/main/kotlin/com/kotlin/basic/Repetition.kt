package com.kotlin.basic

fun main() {
    printOneToTen()
    println("-------------------------")
    printTenToOne()
    println("-------------------------")
    printRange(1, 10)
}
fun printOneToTen() {
    for (num in 1 .. 10) {
        println(num)
    }
}

fun printTenToOne() {
    for (num in 10 downTo 1) {
        println(num)
    }
}

fun printRange(start: Int, end: Int) {
    for (num in start .. end) {
        println(num)
    }
}