package com.ake.kotlin.learn.other.collections.iterator

fun main() {
    /*
    这个是kotlin的逆向迭代,这个listIterator是可以双向迭代的
     */
    val numbers = listOf("one", "two", "three", "four")
    val listIterator = numbers.listIterator()
    while (listIterator.hasNext()) print("${listIterator.next()}, ")
    println("Iterating backwards")
    while (listIterator.hasPrevious()){
        print("Index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }
}