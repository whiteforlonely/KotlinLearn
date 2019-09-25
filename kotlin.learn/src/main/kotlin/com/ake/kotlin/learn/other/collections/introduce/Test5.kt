package com.ake.kotlin.learn.other.collections.introduce

fun printAll(strings: Collection<String>){
    for(s: String in strings){
        print("$s ")
    }
}

/*
通过这个例子想说明什么，就是简单的一点，可以写一个统一的方法，携带的参数是父类的集合类
在调用的时候，只要是参数就成了对应的父类，都是可以作为参数使用的。
或者这个本身是一个奇怪的解释，但是，现在并不重要，重要的时候，我要理解这种做法。
 */
fun main() {
    val list = listOf("one", "two", "three", "four")
    printAll(list)

    val set = setOf("one", "three", "two", "five", "four", "six", "seven", "eight", "nine", "ten")
    printAll(set)
}