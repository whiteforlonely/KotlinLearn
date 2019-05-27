package com.ake.kotlin.learn.classes

data class Person1(val name: String) {
    var age: Int = 0
}

fun main() {
    val person1 = Person1("John")
    val person2 = Person1("John")

    person1.age = 10
    person2.age = 20

    val result = person1.equals(person2)
    println(result) // true
}