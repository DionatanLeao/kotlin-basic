package com.kotlin.basic

fun main() {
    var name: String? = "Name"

    if (name != null) println(name.length)

    val toShort: Short = name!!.length.toShort()

    var nameTwo: String? = null
    val length = nameTwo?.length ?: 0

    var list: List<Int?> = listOf(1, 2, null, 4)
    var listNull: List<Int>? = null
}