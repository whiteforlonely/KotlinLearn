package com.ake.kotlin.learn.classes

fun hasZeros(ints: List<Int>): Boolean {
    ints.forEach {
        if (it == 0) return true
    }

    return false
}

inline fun f(crossinline body: () -> Unit) {
    val f = Runnable {
        // here I should know that this is just the situation.
        body()
    }
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 0)
    val result = hasZeros(list)
    println(result)
}