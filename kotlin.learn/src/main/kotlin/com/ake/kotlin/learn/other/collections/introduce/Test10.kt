package com.ake.kotlin.learn.other.collections.introduce

/*
映射表的获取值的方法和js的代码是有点相似的，也是直接的通过中括号取值
 */
fun main() {
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5)

    println("All keys: ${numberMap.keys}")
    println("All values: ${numberMap.values}")

    if ("two" in numberMap.keys)  println("Value by key \"two\": ${numberMap["two"]}")
    if (1 in numberMap.values) println("The value 1 is in the map")
    if (numberMap.containsValue(1)) println("The value 1 is in the map")
}