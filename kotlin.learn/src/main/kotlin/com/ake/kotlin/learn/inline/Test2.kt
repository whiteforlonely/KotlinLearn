package com.ake.kotlin.learn.inline

import com.ake.kotlin.learn.classes.User

fun main() {
    val user = User("Demon", 100000)
    val result = user.apply {
        println("my name is $name, I am $age years old")
        user.name = "timeer"
        10000000
    }

    println(result)
}