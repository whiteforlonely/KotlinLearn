package com.ake.kotlin.learn.classes

class A2 {

    interface MyListener1{
        fun beforeClick()
    }

    fun click(callback: MyListener1){
        callback.beforeClick()
        println("click action")
    }
}

fun main() {
    val a1 = A2()
    // 通过下面的方式调用是可以的，但是使用lambad方式却是有问题的
    a1.click(object :A2.MyListener1{
        override fun beforeClick() {
            println("before callback.")
        }
    })
    println("================================================")
    // 但是现在还不知道为什么下面的方式是无法调用的。这个问题要看完了基础的内容后再做决定
//    a1.click {
//        println("before click method.")
//    }
}