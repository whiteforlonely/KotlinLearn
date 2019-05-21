package com.ake.kotlin.learn.basetypes

fun main() {
    val ints = intArrayOf(1,2,3)
    ints[0] = ints[1] + ints[2]
    ints.forEach { println(it) }
}