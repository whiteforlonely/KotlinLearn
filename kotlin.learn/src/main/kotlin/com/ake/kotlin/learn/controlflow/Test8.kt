package com.ake.kotlin.learn.controlflow

fun main() {
    for (i in 20 downTo 0 step 3) print("$i  ")
    val listValue = 10..20
    for ((index, value) in listValue.withIndex()){
        println("value in pos $index is $value")
    }
}