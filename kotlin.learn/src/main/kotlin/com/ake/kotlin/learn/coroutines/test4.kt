package com.ake.kotlin.learn.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() {
    val startTime = System.currentTimeMillis()
    val deferred = (1..1000000).map { n ->
        GlobalScope.async {
            n
        }
    }

    runBlocking {
        val sums = deferred.sumBy { it.await() }
        val runtime = (System.currentTimeMillis() - startTime) / 1000 / 60
        println("runTime: $runtime")
        println("result: $sums")
    }
}