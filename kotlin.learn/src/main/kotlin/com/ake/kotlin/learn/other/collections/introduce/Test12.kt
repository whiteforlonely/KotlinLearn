package com.ake.kotlin.learn.other.collections.introduce

fun main() {
    /*
    主要测试map的修改
     */
    val numberMap = mutableMapOf("one" to 1, "two" to 2)
    numberMap.put("three", 3)   //也就是现在不时兴这种方法
    numberMap["one"] = 4

    println(numberMap)
}