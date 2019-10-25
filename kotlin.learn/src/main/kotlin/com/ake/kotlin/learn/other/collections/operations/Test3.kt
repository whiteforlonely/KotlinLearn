package com.ake.kotlin.learn.other.collections.operations

fun main() {
    /*
    这个主要介绍zip的一个方法用途，zip可以将两个list合并成
    一个pair的list，或者是根据两个list的值自定义返回的list，
    也就是其中的返回元素的类形是不确定以的。
     */
    val color = listOf("red", "brown", "grey")
    val animal = listOf("fox", "bear", "wolf")

    println(color zip animal)

    val twoAnimal = listOf("fox", "bear")
    println(color.zip(twoAnimal))

    println(color.zip(animal){color, animal -> "The ${animal.capitalize()} is ${color}"})
}