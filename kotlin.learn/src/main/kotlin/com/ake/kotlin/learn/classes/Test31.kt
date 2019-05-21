package com.ake.kotlin.learn.classes

// 这个就是对单例模式的声明
object SinManager {
    fun method(){
        println("I am in object declaration")
    }
}

class A6{
    object Inner{
        fun method(){
            println("some inner sigleton")
        }
    }
}

fun main() {
    SinManager.method()
    A6.Inner.method()
}