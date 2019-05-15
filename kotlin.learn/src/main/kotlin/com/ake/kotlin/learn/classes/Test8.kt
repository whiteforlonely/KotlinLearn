package com.ake.kotlin.learn.classes

open class Base1(val name: String){
    init {
        println("initializing Base")
    }

    open val size: Int = name.length.also { println("initializing size in Base: $it") }
}

/*
我必须相信，这个和java的类的构造和初始化流程是相通的，并且是容易理解的。
 */
class Derived1(name: String, val lastName: String) :Base1(name.capitalize().also { println("argumetns for Base1 $it") }) {
    init {
        println("initializing Derived")
    }

    override val size: Int = (super.size + lastName.length).also { println("initializing size in Derived: $it") }
}

fun main() {
    Derived1("QingYuan", "Ke")
}