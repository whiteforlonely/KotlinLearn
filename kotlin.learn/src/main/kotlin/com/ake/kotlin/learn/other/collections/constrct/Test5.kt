package com.ake.kotlin.learn.other.collections.constrct

fun main() {
    /*
    这样的行为在java中是常见的，这个算是引用的重新定义
     */
    val sourceList = mutableListOf(1,2,3)
    val refrenceList = sourceList
    refrenceList.add(4)
    println("Source size: ${sourceList.size}")
    /*
    output: Source size: 4
     */
}