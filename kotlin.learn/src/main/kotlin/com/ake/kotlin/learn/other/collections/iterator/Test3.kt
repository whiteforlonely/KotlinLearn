package com.ake.kotlin.learn.other.collections.iterator

/*
这边如果是要做删除动作，一定要注意时使用可变的mutableListOf方法
并且这边的remove方法remove的是当前的元素，也就是要指定你要删除的
元素，没有指定的话，会报错：
Exception in thread "main" java.lang.IllegalStateException
	at java.util.ArrayList$Itr.remove(ArrayList.java:864)
	......
 */
fun main() {
    val numbers = mutableListOf("five", "a", "both", "you", "love")
    val mutableIterator = numbers.iterator()
    mutableIterator.next()
    mutableIterator.remove()
    println("after remove: $numbers")
}