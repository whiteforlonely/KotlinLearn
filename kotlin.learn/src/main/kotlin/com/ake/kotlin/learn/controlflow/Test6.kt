package com.ake.kotlin.learn.controlflow

import java.lang.Integer.parseInt

fun main() {
    val x = 6
    val s = "6"
    val validNums = listOf(30..40)
    when (x) {
        0, 1    -> print("x == 0 || x == 1")
        parseInt(s) -> println("s encode x")
        in 10..20   -> println("in the 10-20 range")
        in validNums.indices -> println("in the 30-40 range")
        else    -> print("other value")
    }
}