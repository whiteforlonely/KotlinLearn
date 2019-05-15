package com.ake.kotlin.learn.other.oproverloading

/*
这便是运算符重载的相关语法，但是这其实也是一个基本的语法
before fun, there you should insert the keyword operator,
and then it can be compile as the operator reloading
and this is the result.
 */
data class Counter(val dayIndex: Int){
    operator fun plus(increment: Int):Counter {
        return Counter(dayIndex + increment)
    }
}

fun main() {
    var counter = Counter(3)
    var counter2 = Counter(4)
    val result = counter + 4
    println(result)
}