package com.ake.kotlin.learn.classes

interface Base3 {
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl3(val x: Int): Base3 {
    override fun printMessage() {
        println(x)
    }

    override fun printMessageLine() {
        println(x)
    }
}

class Derived3(b: Base3) :Base3 by b {
    override fun printMessage() {
        println("abc")
    }
}

fun main() {
    val b = BaseImpl3(10)
    Derived3(b).printMessage()
    Derived3(b).printMessageLine()
}