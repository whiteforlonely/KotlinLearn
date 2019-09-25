package com.ake.kotlin.learn.other.collections.introduce

fun main() {
    val map1 = mapOf(1 to "one", 2 to "two", 3 to "three")

    /*
    现在的情况是想设置map中的值，但是key是整形的数据，这样的问题就导致了
    设置的出错问题。现在就是想解决这样问题
     */
    println(map1[1])

    val map2 = mapOf("one" to 1, "two" to 2, "three" to 3)
    val map3 = HashMap<String, Int>()
    map3["one"] = 2
    map3["two"] = 3
    map3["three"] = 4

    /*
    现在是下面的一个很简单的循环，但是如果自己不用的话，自己还是不知道的
    并且如果只用过一次的话，也是很容易就忘记了的，或者是自己真的是没有什么
    记性的原因。
    学习是学习了，但是能否用起来又是另外的一件事情了。
     */
    for ( (k, v) in map3){
        println("$k : $v")
    }
}