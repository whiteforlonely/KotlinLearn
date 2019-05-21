package com.ake.kotlin.learn.classes

val <T> List<T>.lastIndex: Int
    get() = this.size - 1

// this is not allowed!
//val <T> List<T>.lastIndex1 = 2
