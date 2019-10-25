package com.ake.kotlin.learn.other.collections.sequence

fun main() {
    val words = "The quick brown as you can see in this subject, you try to dawn, then you can take it!".split(" ")
//    val lenList = words.filter { println("filter: $it"); it.length >3 }
//            .map { println("length: ${it.length}"); it.length}
//            .take(4)
//    println("length of first 4 words longer than 3 chars: ")
//    println(lenList)
    /*
    这边使用普通的数组和现在的sequence做对比，这边能看到的不一样的就是，打印的结果是
    不一样的，而不一样的杆件就是sequence是在调用toList方法的时候，才会调用filter，而
    赌赢的每个元素都会全部的完全的经过所有的函数式方法后，才会开始第二个元素的遍历。
    并且在最后满足了所有的条件之后，也就是有4个元素满足了条件之后，就不会再继续的
    进行过滤操作。
     */
    val wordSequence = words.asSequence()
    val lenSequence = wordSequence.filter { print("filter: $it, "); it.length > 3 }
            .map { print("length: ${it.length}"); it.length }
            .take(4)

    println(lenSequence.toList())
}