package com.ake.kotlin.learn.classes

class C2 {
    fun foo() {
        println("member")
    }
}

fun C2.foo() {
    println("extension")
}

fun C2.foo(v: Int) {
    println("extenstion int")
}

fun main() {
    val c=C2()
    c.foo() // member
    c.foo(1) // extenstion int
}