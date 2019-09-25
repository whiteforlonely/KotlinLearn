package com.ake.kotlin.learn.other.collections.constrct

fun main() {
    /*
    可以直接的将List转换成Set
     */
    val sourceList = mutableListOf(1,2,3)
    val copyList = sourceList.toMutableSet()
    copyList.add(4)
    copyList.add(5)
    println(copyList)
    /*
    output:
    [1, 2, 3, 4, 5]
     */
}