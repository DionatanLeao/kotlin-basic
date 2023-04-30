package com.kotlin

import com.kotlin.basic.Car
import com.kotlin.basic.Owner
import com.kotlin.basic.Person

fun main() {
    val person = Person("Dionatan", 31)
    println(person.toString())
    println(person.name)
    println(person.age)

    println("-----------------------------------")

    val car = Car(Owner("Dionatan", 31),"Blue", 1992)
    println(car)
    println(car.color)
    car.color = "Black"
    println(car.color)
    println(car.owner.name)
}
