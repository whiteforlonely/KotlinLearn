package com.ake.kotlin.learn.other.collections.sequence

/*
现在的情况是，要想办法搞清楚yield的方法用意，就是暂停当前的写成，等调用者处理完
之后，再执行yield后面的事情
 */
fun main() {
    val oddSequence = sequence {
        val start = 0
        yield(start)
        yieldAll(1..5 step 2)
        yieldAll(generateSequence(8) { it * 3 })
    }

    println(oddSequence.take(7).toList())
}