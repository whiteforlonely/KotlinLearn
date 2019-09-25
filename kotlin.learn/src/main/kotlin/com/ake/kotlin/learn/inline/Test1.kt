package com.ake.kotlin.learn.inline

import com.ake.kotlin.learn.classes.User

fun main() {
    /*
    with的应用，除了这样子的例子，暂时不知道还有更多的使用例子。
    但是和with类似的，还有let，apply，let，run， also， takeIf， takeUnless
    各种标准的kotlin方法在Standard.kt的类中有说明

    lambad函数有各种奇妙的东西，需要我们去慢慢的积累和实践。

    可能现实就是这样子，现在有了理解，但是因为长时间的不去接触，导致
    后面有没有一定了解。
     */
    val user = User("qingyuan", 23)

    val result = with(user){
        println("my name is $name, my age is $age")
        1000
    }

    println("result: $result")
}