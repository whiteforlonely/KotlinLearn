package com.ake.kotlin.learn.basetypes

/**
 * so, I still can not nunderstand why this happen!
 */
fun main() {
    val a = 10000
    val baseA: Int? = a
    val baseB: Int? = a
    println(baseA == baseB)
}