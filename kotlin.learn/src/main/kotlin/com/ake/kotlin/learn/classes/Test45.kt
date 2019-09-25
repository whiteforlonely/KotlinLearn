package com.ake.kotlin.learn.classes

interface Base2 {
    fun print()
}

class BaseImpl(val x: Int): Base2 {
    override fun print() {
        print(x)
    }
}

class Derived2(b: Base2) : Base2 by b

fun main() {
    val b = BaseImpl(10)
    Derived2(b).print()
}

/*
所以，从这个例子中，自己能否得出什么结论出来？ 关于代理的是事情，现在的情况是
这边的语法使用的关键字是by，这个表示的是代理b的意思。
这个过程是什么时候形成的？应该是在编译的时候形成的。
 */