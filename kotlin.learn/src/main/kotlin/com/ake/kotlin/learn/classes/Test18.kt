package com.ake.kotlin.learn.classes

fun copy(from: Array<out Any>, to:Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices){
        to[i] = from[i]
    }
}
fun main() {
    val ints: Array<Int> = arrayOf(1,2,3)
    val any = Array<Any>(3) {""}
    copy(ints, any)
    any.forEach { println(it) }
}