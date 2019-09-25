package com.ake.kotlin.learn.inline

import com.ake.kotlin.learn.classes.User

fun main() {
    val user = User("homee", 23)
    val result = user.also {
        println("my name is ${it.name}, I am ${it.age} years old!")
        1000000
    }

    println(result)
}