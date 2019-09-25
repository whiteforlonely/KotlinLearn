package com.ake.kotlin.learn.other.collections.constrct

fun main() {
    /*
    这边要说的都是一些集合的方法的使用，并且这些方法都是非常奇特的，
    因为是用到了lambad表达式
     */
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })
}