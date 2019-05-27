package com.ake.kotlin.learn.classes

fun oF(block: () -> Unit) {
    println("hi!")
}

inline fun oF2(block: () -> Unit) {
    println("hello 2")
}

fun f01() {
    oF {
        // here is not allowed
//        return
    }

    oF2 {
        return
    }
}