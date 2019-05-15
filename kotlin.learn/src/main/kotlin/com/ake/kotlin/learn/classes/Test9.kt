package com.ake.kotlin.learn.classes

open class Foo2{
    open fun f() {
        println("Foo.f()")
    }
    open val x: Int get() = 1
}

class Bar4 : Foo2() {
    override fun f(){
        super.f()
        println("Bar.f()")
    }

    override val x: Int get() = super.x + 1
    val y = 4
}
/*
这边的类的属性是可以直接访问的。
 */
fun main() {
    val bar = Bar4()
    bar.f()
    println(bar.x)
    println(bar.y)
}