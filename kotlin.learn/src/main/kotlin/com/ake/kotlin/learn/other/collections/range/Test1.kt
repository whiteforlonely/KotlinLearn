package com.ake.kotlin.learn.other.collections.range

fun main() {
    //if (1 in 1..4) println("1 is in 1-4")

    //for (i in 1..5) print("$i, ")

    //for (i in 5 downTo 1) print("$i,")
    /*
    这边还是有一个奇怪问题，为什么用range的时候就不能使用downTo呢
    为什么使用step的时候，必须是要使用range呢？
    你看到了源代码就明白了，downTo方法是Int的方法
    step的方法是IntProgression的方法
    或者说这个关键字其实都是方法，都是集合或者是IntProgression的方法
     */
//    for (i in 5 downTo 2 step 2) print("$i,")
//    for (i in 1..5 step 2) print("$i,")
    //这个是没有包含10的一个范围
    for (i in 1 until 10) print("$i, ")
}