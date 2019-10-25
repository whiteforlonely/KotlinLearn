package com.ake.kotlin.learn.other.collections.operations

/*
说明下flatten的用法，就是将多个嵌套的集合全部的平铺成一个集合
 */
fun main() {
    val numbers = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8))
    println(numbers.flatten())
    /*
    flatMap的意思就是将list里面的元素进行map后，再进行flatten操作
     */
    println(numbers.flatMap { item -> item.map { it + 1 } })
}