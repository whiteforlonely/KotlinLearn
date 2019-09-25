package com.ake.kotlin.learn.other.collections

/*
这边让我见识到的一个奇特的地方是这边的集合竟然是可以直接的通过运算符来进行
操作的，这个也是kotlin的符号重载的原因
 */
fun List<String>.getShortWordTo(shortWords: MutableList<String>, maxLength: Int){
    this.filterTo(shortWords){ it.length <= maxLength}
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

/*
如果能好好的理解每一个动作，或许，这些也都是简单的
主要是怎么去应用。
 */
fun main() {
    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordTo(shortWords, 3)
    println(shortWords)
}