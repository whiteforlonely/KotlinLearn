package com.ake.kotlin.learn.functions

fun sum(a: Int=0, b: Int=0): Int{
    return a + b
}

fun maxOf(a: Int, b:Int) = if(a > b) a else b

fun main() {
    val sum = sum(b = 3)
    println(sum)
    print(maxOf(3, 4))
}