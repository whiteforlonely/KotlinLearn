package com.ake.kotlin.learn.classes

class D2 {
    fun bar() {
        println("this is D2 bar method")
    }
}

class C5{
    fun baz() {
        println("this is C5 baz method")
    }

    fun D2.foo(){
        bar()   // calls D.bar()
        baz()   // calls C.baz()
    }

    fun caller(d: D2){
        d.foo()
    }
}

fun main() {
    val c = C5()
    c.caller(D2())
}