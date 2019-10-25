package com.ake.kotlin.learn.other.collections.operations

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = mutableListOf<Int>()
    numbers.filterTo(result){it > 3}
    numbers.filterIndexedTo(result){index, value -> index * value > 10}

    //the result is [4, 5, 4, 5]
    println("the result is $result")

    /*
    so, from this, we can just see, this is a function or
    method can show what it can do in this list set.
    there is still lots of same method you can just image.
     */
}