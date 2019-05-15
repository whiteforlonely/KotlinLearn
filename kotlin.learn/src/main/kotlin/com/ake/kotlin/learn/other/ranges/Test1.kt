package com.ake.kotlin.learn.other.ranges

fun main() {
    // here just say you want to print the list with reverse order
    for (i in 10 downTo 1 step 2) {
        print("$i ")
    }

    println()
    for (i in 1..5) print("$i ")

    println()
    for (i in 1..7 step 2) print("$i ")

    println()
    for (i in 1 until 10) print("$i ")
}