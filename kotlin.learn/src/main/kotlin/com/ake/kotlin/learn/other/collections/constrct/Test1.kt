package com.ake.kotlin.learn.other.collections.constrct
/*
这边只是想说明下效率问题，在map初始化的时候，最好不要直接的使用to关键字
 */
fun main() {

    val numbersMap = mutableMapOf<String, Int>().apply { this.put("one", 1); this.put("two", 2); this.put("three", 3)}
    println("general map is: $numbersMap")

    val numbersMap2 = mutableMapOf<String, Int>().apply { this["one"] = 1; this["three"] = 4; this["five"]=5}
    println("general map is: $numbersMap2")
}