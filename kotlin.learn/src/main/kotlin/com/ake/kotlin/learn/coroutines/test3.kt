package com.ake.kotlin.learn.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicLong

/**
 * it can run, but it can not show the truth result,
 * just because this is async method, so, if we want to
 * print the result, we need to use test4.kt
 */
fun main() {

    val c = AtomicLong()

    val startTime = System.currentTimeMillis()
    for (i in 1..1000000L)
        GlobalScope.launch {
            c.addAndGet(i)
        }
    val runtime = (System.currentTimeMillis() - startTime) / 1000 / 60
    println("runTime: $runtime")
    println("result: " + c.get())
}