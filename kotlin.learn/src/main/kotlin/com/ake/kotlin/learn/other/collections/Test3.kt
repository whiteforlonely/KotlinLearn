package com.ake.kotlin.learn.other.collections

import java.io.File
import java.lang.IllegalStateException

fun main() {
    /*
    这个是kotlin的一个特性了，第一种情况是只返回一个对一个的对象属性值
    第二种情况是一个判断的简写
    第三种情况是执行指定的一个断码段
     */

    val files = File(".").listFiles()
//    println(files?.size)

//    println(files?.size?: "empty")

//    files?.size?: throw IllegalStateException("files is empty!")

    /*
    这个是必须在事件中才能真正的体验到种种语法的妙处
     */
    files?.let {
        //TODO 执行这段代码，如果files非空的话。
    }

//    files[0] = File("tomcat")
    val file = files.firstOrNull()?.absolutePath ?: ""
    println(file)
}