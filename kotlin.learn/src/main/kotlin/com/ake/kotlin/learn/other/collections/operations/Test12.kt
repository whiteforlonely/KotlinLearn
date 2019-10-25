package com.ake.kotlin.learn.other.collections.operations

fun main() {
    val numbePairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numbePairs.unzip())

    val numberPairs2 = mutableMapOf<String, Int>().apply {
        put("one", 1)
        put("two", 2)
        put("four",4)
        put("three", 3)
    }
    println(numberPairs2)

    //([one, two, three, four], [1, 2, 3, 4])
}