package com.ake.kotlin.learn.other.collections.introduce

/*
从这边的猜测，能够体会到的就是，现在的这个list和java中的list是有很大的差别的。
这个差别就是这边可以直接的使用中括号运算符来获取指定位置的元素。
至于其他的，和list都是类似的，使用到的时候可以直接的进行查询
 */
fun main() {
    val numbers = listOf("ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN")
    println("Number of elements: ${numbers.size}")
    println("Third element is: ${numbers.get(2)}")
    println("Fourth element is: ${numbers[3]}")
    println("index of element \"TWO\" is : ${numbers.indexOf("TWO")}")
}