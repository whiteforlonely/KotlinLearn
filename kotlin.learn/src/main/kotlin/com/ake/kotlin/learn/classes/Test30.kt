package com.ake.kotlin.learn.classes

class C7{
    private fun foo6() = object {
        val x: String = "x"
    }

    fun publicFoo() = object {
        val x:String = "x"
    }

    fun bar(){
        var x1 = foo6().x
//        var x2 = publicFoo().x
    }
}