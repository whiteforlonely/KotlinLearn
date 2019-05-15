package com.ake.kotlin.learn.basetypes

/*
this is the code show what it has done.
 */
fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9'){
        throw IllegalArgumentException("Out of range!")
    }
    return c.toInt() - '0'.toInt()
}

fun main() {

    val a = decimalDigitValue('4')
    println(a)
    println('6'.toInt())
}