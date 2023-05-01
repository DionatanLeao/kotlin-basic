package com.kotlin.basic

fun main() {
    val decisionStructure = DecisionStructure()
    decisionStructure.calcEvenOrOdd(6)
    decisionStructure.calcEvenOrOdd(9)
    decisionStructure.calcGrade(7.0)
    decisionStructure.calcGrade(5.0)
    decisionStructure.calcGrade(2.0)
}
class DecisionStructure {

    fun calcEvenOrOdd(num: Int) {
        val rest = num % 2
         return if (rest == 0) {
            println("The number $num is even")
        } else {
            println("The number $num is odd")
        }
    }

    fun calcGrade(grade: Double) {
        if (grade >= 6.0) {
            println("approve")
        } else if (grade >= 4.0) {
            println("recovery")
        } else {
            println("disapproved")
        }
    }
}