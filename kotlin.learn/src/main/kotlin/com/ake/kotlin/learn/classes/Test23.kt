package com.ake.kotlin.learn.classes

fun Any?.toString(): String{
    if (this == null) return "null"

    return toString()
}