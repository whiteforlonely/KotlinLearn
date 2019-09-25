package com.ake.kotlin.learn.other.collections.constrct

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)
}