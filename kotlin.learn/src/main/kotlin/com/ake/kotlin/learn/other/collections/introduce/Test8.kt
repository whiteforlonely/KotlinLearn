package com.ake.kotlin.learn.other.collections.introduce

/*
这边如果是想对一个对应的集合使用修改的功能
这边就需要使用mutableList
是一个可变的集合类
 */
fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    numbers.add(3, 12)
    numbers.removeAt(0)
    numbers[0] = 13
    numbers.shuffle()
    println(numbers)
}