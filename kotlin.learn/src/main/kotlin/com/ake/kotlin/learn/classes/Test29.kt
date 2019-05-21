package com.ake.kotlin.learn.classes

fun foo5(){
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }

    println(adHoc.x + adHoc.y)
}

fun main() {
    foo5()
}