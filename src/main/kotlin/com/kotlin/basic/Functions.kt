package com.kotlin.basic

fun main() {
    println("Hello world")
    val name = returnName()
    println(name)
    sayHello(returnName(), 31)
    sayHello(returnName())
}

fun returnName(): String {
    return "Name"
}

fun sayHello(nome: String, age: Int = 20) {
    println("Hello $nome congratulations on $age years of age")
}