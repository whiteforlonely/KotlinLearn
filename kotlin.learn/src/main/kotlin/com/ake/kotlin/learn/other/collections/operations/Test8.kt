package com.ake.kotlin.learn.other.collections.operations

fun main() {
    /*
    I am not very sure I have wrote this example before.
    this example is just like reference
     */

    val numbers = listOf("one", "two", "three", "four", "five")
    numbers.filter { it.length > 3 }
    println("thr result of number is still $numbers")

    val resultStore = numbers.filter { it.length > 3 }
    println("the result store is $resultStore")
}