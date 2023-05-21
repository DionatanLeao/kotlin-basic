package com.kotlin.basic

class FirstClass(
   private val name: String,
   private val address: String,
   private val age: Int
) {
    companion object {
        fun createClass(): FirstClass {
            return FirstClass("Name 1", "First Road", 26)
        }

        fun createInitialSecondClass(secondClass: SecondClass): FirstClass {
            return FirstClass(secondClass.name, secondClass.address, secondClass.age)
        }
    }

    override fun toString(): String {
        return "$name, $address, $age"
    }
}

class SecondClass(
    val name: String,
    val address: String,
    val age: Int
) {
    fun createClass(): SecondClass {
        return SecondClass("Name 2", "Second Road", 23)
    }

    override fun toString(): String {
        return "$name, $address, $age"
    }
}

fun main() {
    val secondClass = SecondClass("Name 3", "Second Avenue", 44).createClass()
    val firstClass = FirstClass.createClass()
    println(firstClass.toString())
    val createInitialSecondClass = FirstClass.createInitialSecondClass(secondClass)
    println(createInitialSecondClass.toString())
}