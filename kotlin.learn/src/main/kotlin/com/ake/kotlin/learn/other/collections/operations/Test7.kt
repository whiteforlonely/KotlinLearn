package com.ake.kotlin.learn.other.collections.operations

fun main() {
    data class StringContainer(val values: List<String>)

    val containers = listOf(
            StringContainer(listOf("one", "two")),
            StringContainer(listOf("three", "four")),
            StringContainer(listOf("five", "six")),
            StringContainer(listOf("seven", "eight"))
    )

    /**
     * for this example, it is also for you to make sure that, this is not just
     * for people to understand this situation.
     */
    println(containers.flatMap { it.values })
}