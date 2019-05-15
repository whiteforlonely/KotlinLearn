package com.ake.kotlin.learn.basetypes

fun main() {
    val list = Array(5) {
        i -> (i *i).toString()
    }

    val list2 = arrayOf(1,2,3,4)
    val list3 = intArrayOf(1,2,3,4,4)
    val list4 = charArrayOf('1', '2', '3')

    list.forEach { println(it) }
    list2.forEach { println(it) }
    list3.forEach { println(it) }
    list4.forEach { println(it) }
}
