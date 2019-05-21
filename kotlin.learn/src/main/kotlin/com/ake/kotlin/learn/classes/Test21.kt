package com.ake.kotlin.learn.classes

open class C1
class D: C1()

fun C1.foo() = "c"
fun D.foo() = "d"

// 这是函数扩展的问题
fun printFoo(c: C1){
    println(c.foo())
}

fun main() {
    printFoo(D())   // c
}

