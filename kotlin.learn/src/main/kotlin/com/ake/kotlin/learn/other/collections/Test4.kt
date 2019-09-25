package com.ake.kotlin.learn.other.collections

import java.lang.IllegalStateException

/*
开起来是一端很简单的代码，但是里面的内容涉及到的倒是很多的。
这边做详细的说明是希望自己之后可以记住。
但是这个是一个大问题了，因为就像记住英文单词一样
对我来说是很费力的一件事情。
 */
fun transformColor(color: String): Int{
    return when(color){
        "red"           -> 0
        "green"         -> 1
        "blue"          -> 2
        else            -> throw IllegalStateException("error color description!")
    }
}

fun transformColor2(color: String): Int = when(color){
    "red"   -> 0
    "green" -> 1
    "blue"  -> 2
    else -> throw IllegalStateException("error color string value")
}

fun test1(param: Int){
    val result = if (param == 1){
        "one"
    } else if (param == 2){
        "two"
    } else {
        "three"
    }

    println(result)
}

/*
下面的两个方法是同等的。
 */
fun theAnswer() = 42

fun theAnswer2(): Int{
    return 42
}

/*
主要是这边练习的地方不多导致的问题，下面的这个又是怎么样的一个处理方法呢，还是要从
方法上的根本问题说起，应该说是从联系开始慢慢的去学习这样的一个东东。
但是在这个之前，是否应该把需要知道的东西都重新的了解下。这个也是重点。
 */
fun arrayOfMinusOnes(size: Int): IntArray{
    return IntArray(size).apply { fill(-1) }
}

fun main() {
    print(transformColor("red"))
}