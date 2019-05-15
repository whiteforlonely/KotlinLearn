package com.ake.kotlin.learn.classes

interface Foo1{
    val count: Int
}

class Bar2(override val count: Int): Foo1

class Bar3:Foo1{
    override var count: Int = 0
}