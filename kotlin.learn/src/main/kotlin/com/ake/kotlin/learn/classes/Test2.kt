package com.ake.kotlin.learn.classes

class Customer(name: String){
    val customerKey = name.toUpperCase()
}

fun main() {
    Customer("saturday")
}