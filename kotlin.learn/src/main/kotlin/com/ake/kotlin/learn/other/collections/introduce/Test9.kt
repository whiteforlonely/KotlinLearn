package com.ake.kotlin.learn.other.collections.introduce

/*
这边要说明的是，set的默认实现是LinkedHashSet，也就是会保留插入的顺序
只是，没有重复的数据存在，这个是特点，也是问题。
但是另外要注意的是HashSet的另外一种集合，这个没有什么顺序的。
 */
fun main() {
    val numbers = setOf(1,2,3,4)
    val numbersBackward = setOf(4,3,2,1)

    println(numbers.first() == numbersBackward.first())
    println(numbers.first() == numbersBackward.last())
}