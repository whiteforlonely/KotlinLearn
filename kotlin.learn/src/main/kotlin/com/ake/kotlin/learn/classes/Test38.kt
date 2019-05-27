package com.ake.kotlin.learn.classes

enum class RGB { RED, GREEN, BLUE}

/*
I still can not very understand this code. so I need
do some test.
 */
inline fun <reified T: Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}

fun main() {
    printAllValues<RGB>()
    println()
    print(enumValues<RGB>().joinToString { it.ordinal.toString() })
    println()
    print(enumValueOf<RGB>("GREEN"))
}