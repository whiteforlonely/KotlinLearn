package com.ake.kotlin.learn.other.collections.operations

fun main() {
    /*
    这个是集合的映射操作
     */
    val nums = setOf(1, 2, 3)
    println(nums.map { it * 2 })
    println(nums.mapIndexed{idx, value -> idx * value})


    /*
    这个notNull是会过滤掉空值
     */
    println(nums.mapNotNull { if(it == 2) null else it * 2 })
    println(nums.mapIndexedNotNull { index, i -> if(index == 0) null else index * i })
}