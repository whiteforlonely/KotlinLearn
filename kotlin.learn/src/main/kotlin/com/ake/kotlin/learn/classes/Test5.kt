package com.ake.kotlin.learn.classes
// 构造函数参数的默认值
class Customer1(val customerName: String = "")

/*
关于类的继承问题，在方法重载的时候，基类的方法必须声明是open的，否则重载错误。
类似的，类要被继承的话，作为基类也是需要添加open关键字的。
方法中的final关键字是防止子类重写该方法
 */
open class Base(p: Int){
    open fun v(){}
    fun c(){}
}

class Derived(p: Int): Base(p){
    final override fun v(){}
}