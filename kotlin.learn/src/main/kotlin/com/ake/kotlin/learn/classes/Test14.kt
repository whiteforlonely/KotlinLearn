package com.ake.kotlin.learn.classes

interface Named {
    val name: String
}

interface Person:Named{
    val firstName: String
    val lastName: String

    override val name: String
    get() = "$firstName $lastName"
}

data class Employee(
        override val firstName: String,
        override val lastName: String,
        val position: Int
): Person

fun main() {
    val e = Employee("Saturday", "Ke", 3)
    println(e.name)
}