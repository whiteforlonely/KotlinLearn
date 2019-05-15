package com.ake.kotlin.learn.basetypes

/*
String
 */
fun main() {

    val a = "hello world."
    for (c in a) {
        print("$c ")
    }

    val b = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimIndent().trimMargin()

    println(b)

    // this is a method to print the dollar icon
    val c = """
        ${'$'}999
    """.trimIndent()

    println(c)
}