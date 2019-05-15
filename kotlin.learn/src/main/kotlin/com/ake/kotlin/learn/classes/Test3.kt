package com.ake.kotlin.learn.classes

class Constructors {

    init {
        println("init blocks")
    }

    constructor(i: Int, b:String = "3"){
        println("Constructors $i, $b")
    }

    constructor(i: Int){
        println("Constructors2 $i")
    }
}

fun main() {
    Constructors(4, "6")
}