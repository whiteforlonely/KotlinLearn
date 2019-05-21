package com.ake.kotlin.learn.jumps

/*
this code cause some strange smell in my mind
so, just if you want to jump direct value in forEach
you can just use @ to jump the current value
operation
 */
fun foo1(){
    listOf(1,2,3,4,5).forEach lit@{
        if (it == 3) return@lit
        println(it)
    }

    println("done with explicit label")
}

fun main() {
    foo1()
}