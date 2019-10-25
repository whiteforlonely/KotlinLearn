package com.ake.kotlin.learn.other.collections.operations

/*
这个例子想说明的是，associate方法的用途。
 */
fun main() {
    val names = listOf("Alice Adams", "Brain Brown", "Clara Campbell")

    data class Fullname (val firstName: String, val lastName: String)

    fun parseFullName(fullName: String): Fullname{
        val nameParts = fullName.split(" ")
        return Fullname(nameParts[0], nameParts[1])
    }
    println(names.associate { name -> parseFullName(name).let { it.firstName to it.lastName } })
}