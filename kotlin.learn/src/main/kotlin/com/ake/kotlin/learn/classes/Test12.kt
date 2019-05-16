package com.ake.kotlin.learn.classes

interface MyInterface{
    val prop: Int? // abstract
    // 接口中还是可以定义一些初始化的属性的，这个和java是不一样的。
    val propertyWithImplementation: String
    get() = "foo"

    fun foo() {
        println(prop)
    }

    fun click()
}

class A1: MyInterface{

    // 可以初始化为空值，但是interface在定义的时候，也必须是Int?类型，就是可为空的类型
    // 在interface中没有定义的话，也是会发生错误的
    override var prop: Int? = null
        private set // 把set方法设置成私有的，也就是外面的类是不能访问的

    override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun foo() {
        prop = 23
        super.foo()
    }

    fun foo1(listener: MyListener) {
        if (listener == null) {
            return
        }
        println("come to call mylistener")
        listener.beforeClick()
        println("click now....")
        listener.afterClick()
    }

    interface MyListener{
        fun afterClick()

        fun beforeClick()
    }
}

/*
下面这个是匿名内部类的写法
 */
fun main() {
    val result = A1()
    result.foo()
    result.foo1(object :A1.MyListener{
        override fun beforeClick() {
            println("before click, you need to check the button")
        }

        override fun afterClick() {
            println("this is just after click button")
        }
    })
}