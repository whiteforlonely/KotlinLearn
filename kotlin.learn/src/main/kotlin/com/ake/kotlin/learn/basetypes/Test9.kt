package com.ake.kotlin.learn.basetypes

fun main() {
    val x = (1 shl 2) or 0x000ff000

    var line = "result=%x"
    println(line.format(x))
}