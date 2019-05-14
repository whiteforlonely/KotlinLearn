package com.ake.kotlin.learn.basetypes

fun main() {
    val a: Int? = 10000
    println(a === a)
    val baseA: Int? =a
    val baseB: Int? = a
    println(baseA === baseB)

    /*
    so from the test4, we can understand that, in this example,
    variable a is a object, the baseA and baseB direct to the same
    object a, and this is the result true, true
     */
}