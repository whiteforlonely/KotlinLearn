package com.ake.kotlin.learn.classes

class Box<T>(t:T) {
    val value = t
}

fun main() {
    val box: Box<Int> = Box(1)
    println("result: ${box.value}")
}