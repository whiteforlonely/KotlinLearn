package com.ake.kotlin.learn.jumps

fun foo3(){
    listOf(1,2,3,4,5).forEach(fun (value: Int) {
        if (value == 3){
            return
        }
        print(value)
    })

    println("done with anonymous function")
}

fun main() {
    foo3()  // 1245done with anonymous function
}
