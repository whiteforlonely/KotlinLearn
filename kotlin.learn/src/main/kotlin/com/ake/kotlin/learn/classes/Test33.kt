package com.ake.kotlin.learn.classes

fun main() {
    var a = 1
    var obj = object {
        fun method(){
            a ++
        }
    }

    obj.method()
    println(a)
}