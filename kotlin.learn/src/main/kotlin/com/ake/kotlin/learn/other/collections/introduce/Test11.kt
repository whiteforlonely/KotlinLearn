package com.ake.kotlin.learn.other.collections.introduce

fun main() {
    /*
    这边想说明的是只要两个map包含的键值是一样的，两个map就是相同的
     */
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    val numberMap2 = mapOf<String, Int>("two" to 2, "one" to 1)

    println("the map match is ${numberMap == numberMap2}")
}