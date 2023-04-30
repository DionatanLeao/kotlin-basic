package com.kotlin.basic

class Person(var name: String, var age: Int) {
    override fun toString(): String {
        return "Name: $name, Age: $age"
    }
}