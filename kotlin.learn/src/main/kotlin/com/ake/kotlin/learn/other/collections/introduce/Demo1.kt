package com.ake.kotlin.learn.other.collections.introduce

import javafx.scene.shape.Circle
import java.awt.Rectangle

/**
 * 现在应该是好好的说下这个的时候，这个是集合的特性，像是一个函数式编程的样子。
 * 这种代码对我来说是一种诱惑，但是现在的成都是还不是很熟悉的。
 */
fun main() {
    val fruits = listOf("bnanan", "avocado", "apple", "kiwifruit")
    fruits.filter{it.contains("a")}
            .sortedBy{it}
            .map { it.toUpperCase() }
            .forEach { println(it) }

    val rectangle = Rectangle(5, 2)
    val circle = Circle()
    val map = mapOf("one" to 1, "two" to 2)
    map.forEach { t, u ->
        println("$t -> $u")
    }
}