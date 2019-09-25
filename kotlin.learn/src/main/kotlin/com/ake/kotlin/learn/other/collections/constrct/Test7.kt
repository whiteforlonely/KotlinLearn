package com.ake.kotlin.learn.other.collections.constrct

fun main() {
    /*
    这个能看到的是map 和 mapIndexed的方法和功能，首先这些功能是需要耐心去
    琢磨的，因为map的意思就是把一个集合映射到另外一个集合，然后返回最终
    映射的这个集合，而不是说结果就是map类型的
    同样的mapIndexed也是这样的意思，就是索引和值来确定最终集合的值
     */
    val numbers = listOf(1,2,3)
    println(numbers.map { it * 3 })
    println(numbers.mapIndexed{idx, value -> value * idx})
}