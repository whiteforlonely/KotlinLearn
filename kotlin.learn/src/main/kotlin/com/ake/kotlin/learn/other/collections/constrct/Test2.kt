package com.ake.kotlin.learn.other.collections.constrct

import java.util.*
import kotlin.collections.HashSet

fun main() {
    val emptyList = emptyList<String>()
    /*
    想这样子的写法，以后是要理解和熟知的
     */
    val doubled = List(3) {it * 2}

    println(doubled)

    /*
    这个是要展示一些集合的一些初始化方法，这边的集合是有很多的，kotlin相关的集合
     */
    val linkeddList = LinkedList<String>(listOf("ne", "joue", "oun", "ton"))
    val presizeSet = HashSet<String>(5)

    println(linkeddList)
}