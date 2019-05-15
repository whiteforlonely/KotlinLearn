package com.ake.kotlin.learn.classes

open class A {
    open fun f() {
        println("A")
    }

    fun a() {
        println("a")
    }
}

interface B {
    fun f() {
        println("B")
    }

    fun b() {
        println("b")
    }
}

/*
在一个类继承多个父类的时候，并且父类的方法是可以重写的，并且重写的方法在多个父类中哦同时存在，
这个时候，要通过尖括号进行区分父类方法的调用
 */
class C(): A(), B {
    override fun f(){
        super<A>.f()
        super<B>.f()
    }
}

fun main() {
    val c = C();
    c.f()
}