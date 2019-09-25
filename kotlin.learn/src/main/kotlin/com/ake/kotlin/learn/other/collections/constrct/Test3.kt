package com.ake.kotlin.learn.other.collections.constrct

fun main() {
    /*
    这边使用了集合复制函数，会自动的创建集合的快照，源集合的
    改动不会影响复制的集合
     */
    val sourceList = mutableListOf(1,2,3)
    val copyList = sourceList.toMutableList()
    val readOnlyCopyList = sourceList.toList()
    sourceList.add(4)
    println("copy mutable list: $copyList")
    println("Read-Only copy size: ${readOnlyCopyList.size}")
    /*
    output:
    copy mutable list: [1, 2, 3]
    Read-Only copy size: 3
     */
}