package com.ake.kotlin.learn.classes

fun MutableList<Int>.swap(ind1: Int, ind2: Int){
    val temp = this[ind1]
    this[ind1] = this[ind2]
    this[ind2] = temp
}

fun main() {
    val l = mutableListOf(1, 2, 3, 4, 5)
    l.swap(0, 2)
    l.forEach{
        println(it)
    }
}