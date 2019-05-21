package com.ake.kotlin.learn.classes

class A7{
    companion object {
        private val a = 20
        fun method(){
            println(a)
        }
    }
}

fun main() {
//    val b = A7.a.also(::println)
    A7.method()
//    println(b)
}