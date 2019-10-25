package com.ake.kotlin.learn.other.collections.operations

fun main() {
    val numbers = mutableListOf(7, 4, 3, 2, 5, 6)
    val sortNumbers = numbers.sorted()
    print("sorted number is $sortNumbers")
    numbers.sort()
    println("numbers sort result: $numbers")

    //sorted number is [2, 3, 4, 5, 6, 7]numbers sort result: [2, 3, 4, 5, 6, 7]
    /*
    so here sort() just sort the mutable list in place, and sorted()
    create a new collection that contains the same elements in the sorted
    order.
     */
}