package com.ake.kotlin.learn.other.collections.operations

fun main() {
    val numbers = listOf(2, 3, 4, 5, 7)
    val result = numbers.mapTo(HashSet()){it + 1}

    println("the result from mapTo method return is $result")
    //the result from mapTo method return is [3, 4, 5, 6, 8]
    /*
    this is just show that you can mapTo a new set and return this set to
    receive parameter.
     */
}