package com.ake.kotlin.learn.other.collections.iterator

fun main() {
    /*
    这个是kotlin这边的迭代器，这边有三种迭代方法，
    1.直接获取集合的迭代器
    2.隐式for循环
    3.集合的forEach方法
     */
    val numbers = listOf(1,2,3,4,5,6,7,8,0)
    val numbersIterator = numbers.iterator()
    while (numbersIterator.hasNext()) println(numbersIterator.next())

    for (item in numbers) print("for print: $item, ")
    numbers.forEach { println("forEach print: $it") }
}