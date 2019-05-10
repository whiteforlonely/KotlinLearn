package com.ake.kotlin.learn.coroutines

import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread

fun main() {
    val c = AtomicLong()

    // I have no idea why I should wait for so long time.
    // but this is just because the code cause the problem
    val startTime = System.currentTimeMillis()
    for (i in 1..1_000_000L)
        thread (start = true){
            c.addAndGet(i)
        }

    val runtime = (System.currentTimeMillis() - startTime) / 1000 / 60
    println("runTime: $runtime")
    println(c.get())
}