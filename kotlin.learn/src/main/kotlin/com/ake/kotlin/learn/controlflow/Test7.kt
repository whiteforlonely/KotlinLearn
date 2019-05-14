package com.ake.kotlin.learn.controlflow

fun main() {
    when (val result = (6+4)) {
        7   -> println("right result 7")
        else    -> println("other value")
    }
}