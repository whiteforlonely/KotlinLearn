package com.ake.kotlin.learn.classes

interface Base4 {
    val message: String
    fun print()
}

class Base4Impl(val x: Int): Base4 {
    override val message: String
        get() = "Base4Impl: x = $x"

    override fun print() {
        println(message)
    }
}

class Derived4(b: Base4): Base4 by b{
    override val message: String
        get() = "message of derived"
}

fun main() {
    val b = Base4Impl(13)
    val derived = Derived4(b)
    derived.print()
    println(derived.message)
}
/*
Base4Impl: x = 13
message of derived
所以，这个就是代理的意思吧，只是代理打印一些必要的消息，意思就是只能是
代理一些方法，但是一些属性是没有办法代理的。这个问题看起来不是很糟糕，
但是要明确才行。
 */