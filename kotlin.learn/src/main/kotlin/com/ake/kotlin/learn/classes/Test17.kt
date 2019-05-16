package com.ake.kotlin.learn.classes

interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>) {
    val obejcts: Source<Any> = strs
}