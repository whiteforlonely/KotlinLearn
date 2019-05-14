package com.ake.kotlin.learn.basetypes

fun main() {
    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${(s1.replace("is", "was"))}, but now is $a"
    println(s2)
    /**
     * here has a point, as you print a variable a, you just print it, then you
     * can use print(a)
     * but if you try to print a in a string, you should use '$' sign.
     */
}