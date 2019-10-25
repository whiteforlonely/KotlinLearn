package com.ake.kotlin.learn.other.collections.sequence

fun main() {
    val numbersSquence = sequenceOf("four", "three", "two", "one")
    val numbersList = listOf("1", "2", "3", "4")
    val numberListSeq = numbersList.asSequence()

    /*
    这边创建的是一个无线的序列
     */
    val oddNumbers = generateSequence(1) { it + 2 }
    val itor = oddNumbers.take(5).iterator()
    while (itor.hasNext()){
        println("${itor.next()}, ")
    }
    // 创建一个有限的序列，通过在函数中返回null
    val ovenNumbers = generateSequence(0) { if(it < 20) it + 2 else null }
    println(ovenNumbers.toList())
}