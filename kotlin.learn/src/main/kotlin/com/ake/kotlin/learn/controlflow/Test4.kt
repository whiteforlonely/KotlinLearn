package com.ake.kotlin.learn.controlflow

fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items)
        println(item)

    for (index in items.indices){
        println("item at pos $index is ${items[index]}")
    }

    var i = 0
    while (i < items.size) {
        println("item at $i is ${items[i]}")
        i ++
    }
}