package com.ake.kotlin.learn.other.collections.operations

fun main() {
    /*
    既然是例子本身讲到各种方法的用途，那这个是要好好地研究和珍惜的。
    而这个主要讲的是关联的方法，把原来的list的值当做是keySet，然后自己
    定义新的value组成一个map
     */
    val nums = listOf("one", "two", "three")
    println(nums.associateWith { it.length })

    /*
    这个的方法和上面的是对应的，把原来的list的值看作是map的value，反而生成他们的
    keySet，也是自定义的。
     */
    println(nums.associateBy { it.first().toUpperCase() })
    println(nums.associateBy ( keySelector = {it.first().toUpperCase()}, valueTransform = {it.length}))


}