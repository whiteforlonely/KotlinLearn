package com.ake.kotlin.learn.jumps

fun foo4(){
    /*
    这种行为真正的类似于return
     */
    run loop@{
        listOf(1,2,3,4,5).forEach{
            if (it == 3) return@loop
            print(it)
        }
    }

    println(" done with nested loop")
}

fun main() {
    foo4()  // 12 done with nested loop
}