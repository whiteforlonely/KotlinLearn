package com.ake.kotlin.learn.classes

/*
这是一个嵌套类，但是这个和innerclass 不知道有什么区别，
A class may be marked as  inner to be able to access members of outer class. Inner classes carry a reference to an object
of an outer class.
so, this is the answer.
 */
class Outer {
    private val bar : Int = 1
    class Nested {
        fun foo() = 2
    }
}

class Outer1 {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

fun main() {
    val demo = Outer.Nested().foo()
    val demo1 = Outer1().Inner().foo()
    println("result = $demo")
    println("result1 = $demo1")
}