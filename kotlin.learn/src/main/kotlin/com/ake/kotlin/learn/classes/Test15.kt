package com.ake.kotlin.learn.classes

interface A3 {
    fun foo() {println("A3")}
    fun bar()
}

interface B3{
    fun foo(){println("B3")}
    fun bar() {println("bar")}
}

class C3: A3{
    override fun bar() {
        println("bar A3")
    }
}

class D3: A3, B3{
    override fun foo() {
        super<A3>.foo()
        super<B3>.foo()
    }

    override fun bar() {
        super<B3>.bar()
    }
}

fun main() {
    val c = C3()
    val d = D3()

    c.foo()
    d.foo()
    c.bar()
    d.bar()
}