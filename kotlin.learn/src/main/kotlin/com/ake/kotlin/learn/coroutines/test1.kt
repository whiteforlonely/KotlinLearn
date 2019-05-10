package com.ake.kotlin.learn.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("start")

    /**
     * this is the coroutines I have see, and if I real want to the the truth of this,
     * I have to do more. check the source code oof GlobalScope
     */
    GlobalScope.launch {
        delay(1000)
        println("hello")
    }

    // so here is.. just like the Tread.sleep(2000), all tiese codes need to
    // be considered as complicated thread operation.
    runBlocking {
        delay(2000)
    }

    // I realize I have make a mistake while I was creating the project. But I still need to
    // figure out the problem. and finallly, I just create new one gradle project with kotlin(java)
    // so, that is what I deal with.
//    Thread.sleep(2000)
    println("stop")
}