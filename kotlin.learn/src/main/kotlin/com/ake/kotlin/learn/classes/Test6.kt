package com.ake.kotlin.learn.classes

open class Foo{
    open val x: Int get() {
        return 0
    }
}

/*
这边还需要注意Foo后面的小括号
 */
class Bar1:Foo(){
    override val x: Int = 5
}