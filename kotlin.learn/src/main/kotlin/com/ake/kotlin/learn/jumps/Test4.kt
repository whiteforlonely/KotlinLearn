package com.ake.kotlin.learn.jumps

fun foo2(){
    listOf(1,2,3,4,5,6).forEach{
        if (it == 3) return@forEach
        print(it)
    }

    println("done with implicit label")
}

fun main() {
    foo2()
}