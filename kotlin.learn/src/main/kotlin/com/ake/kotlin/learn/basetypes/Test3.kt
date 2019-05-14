package com.ake.kotlin.learn.basetypes

fun printLength(obj: Any): Int?{
    if (obj is String) {
        return obj.length
    }

//    if (obj !is String){
//        return 0
//    }

    return 0
}

fun main() {
    println(printLength(1234444))
}