package com.ake.kotlin.learn.controlflow

/**
 * here is a new syntax about kotlin different from java, this is when keyword
 */
fun describe(obj: Any): String =
        when (obj) {
            1           -> "one"
            "Hello"     -> "Greeting"
            is Long     -> "Long"
            !is String  -> "Not a string"
            else        -> "Unknown"
        }
fun main() {
    println(describe(1231231231L))
    println(describe("Hello"))
    println(describe(1))
    println(describe(2))
    println(describe("this is a thing"))
}