package com.ake.kotlin.learn.classes

open class A4(x: Int){
    public open val y: Int =x
}

interface B4 {}

// 这是对超类的一种匿名实现
val ab: A4 = object: A4(1), B4{
    override val y: Int = 15
}