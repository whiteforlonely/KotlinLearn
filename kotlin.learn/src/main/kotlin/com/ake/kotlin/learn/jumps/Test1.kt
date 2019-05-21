package com.ake.kotlin.learn.jumps

fun main() {
    loot@ for (i in 1..100)
        for (j in 1..100){
            if (i * j > 2500){
                println("come to break.")
                break@loot
            }
        }
}