package com.ake.kotlin.learn.basetypes

fun main() {
    val a = 10000
    println(a === a)
    val baseA: Int? =a
    val baseB: Int? = a
    /*
    the result is false, so, first, they both
    direct to the same object. but why the result is false.
    and if the value of a is below than 128, then the result is true.
    so compile the code to java:
    int a = 100;
    System.out.println(a == a);
    Integer baseA = Integer.valueOf(a);
    Integer baseB = Integer.valueOf(b);
    println(baseA == baseB)

    so now, I can understand why the result is like this.
     */
    println("${baseA === baseB}")
}