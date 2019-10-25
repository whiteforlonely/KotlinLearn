package com.ake.kotlin.learn.other.collections.operations

fun main() {
    /*
    如果不常用的话，真的是很容易混淆的
     */
    val numberMap = mutableMapOf<Int, String>().apply { for(i in 1..5) this[i] = "heelo$i" }
    println(numberMap)
    /*
    下面是针对于key和值的一个映射
     */
    println(numberMap.mapKeys { it.key + 2 })
    println(numberMap.mapValues { it.value + it.key })
}