package com.ake.kotlin.learn.classes

/*
这是class定义的时候，init的方法的执行，这个是比较原始的。
 */
class InitOrderDemo(name: String) {
    val firstProperty = "First peoperty: $name".also(::println)

    init {
        println("First initializer blockk that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    InitOrderDemo("hello")
}