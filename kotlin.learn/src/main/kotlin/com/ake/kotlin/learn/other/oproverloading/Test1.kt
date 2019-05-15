package com.ake.kotlin.learn.other.oproverloading

data class Point(val x:Int, val y:Int)

operator fun Point.unaryMinus() = Point(-x, -y)

val point = Point(0, 20)

fun main() {
    println(-point)
}