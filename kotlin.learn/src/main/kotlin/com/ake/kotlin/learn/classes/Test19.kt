package com.ake.kotlin.learn.classes

fun <T: Comparable<T>> sort(list: List<T>) {}

fun <T> copyWhenGreater(list: List<T>, threshold: T):List<String> where T: CharSequence, T:Comparable<T>{
    return list.filter { it > threshold }.map { it.toString() }
}
fun main() {
    sort(listOf(1,2,3))

    // Error
    // sort(listOf(HashMap<Int, String>()))
}