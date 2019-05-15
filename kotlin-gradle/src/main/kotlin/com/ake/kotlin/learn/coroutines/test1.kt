package com.ake.kotlin.learn.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
    println("start")

    GlobalScope.launch {
        delay(1000)
        println("hello")
    }

    // I realize I have make a mistake while I was creating the project. But I still need to
    // figure out the problem.
//    Thread.sleep(2000)
    println("stop")
}