package com.kotlin.basic

fun main() {
    val list = listOf(1,2,3)
    val mutableList = mutableListOf(9,8,7,5)
    val numberEven = list.filter { it % 2 == 0 }
    println(numberEven)
    println("-----------------")
    for (number in list) {
        println(number)
    }
    println("-----------------")
    list.forEach { println(it) }
    println("-----------------")
    println(list[0])
//    println(list.get(0))
    println(list.size)
    println(list.indexOf(3))
    mutableList.add(6)
    println(mutableList)
    mutableList.removeAt(0)
    mutableList.remove(5)
    println(mutableList)
    println(list.sorted())
    println(list.shuffled())
    println("-----------------")
    val setNumbers = setOf(1,2,3,2)
    println(setNumbers)
    println(setNumbers.contains(2))
    println("-----------------")
    val mapOfNameAge = mapOf("Name 1" to 24, "Name 2" to 28)
    println(mapOfNameAge)
    val mutableMapOfNameAge = mutableMapOf("Name 1" to 24, "Name 2" to 28)
//    mutableMapOfNameAge.put("Name 3", 25)
    mutableMapOfNameAge["Name 4"] = 33
    println(mutableMapOfNameAge)
    mutableMapOfNameAge.remove("Name 4")
    println(mutableMapOfNameAge)
    mutableMapOfNameAge.putIfAbsent("Name 1", 30)
    println(mutableMapOfNameAge)
}