package com.ake.kotlin.learn.classes

class Container<T>(var item: T) {
    companion object {
        const val classVersion = 5
    }
}

typealias BoxedString = Container<String>

//val version = BoxedString.classVersion
