package com.ake.kotlin.learn.jumps

fun foo(){
    listOf(1, 2, 3, 4, 5).forEach{
        if (it == 3) return
        println(it)
    }
    println("this point is unreachable")
}

fun main() {
    foo()
}