package com.ake.kotlin.learn.lambdas

// 这个高阶函数看起来，对我来说有点复杂，现在还没有转过来， this fold like js reduce funtion.
fun main(args: Array<String>) {

//    typealias OscarWinners = Map<String, String>
//
//    fun countLaLand(oscarWinners: OscarWinners) = oscarWinners.count{it.value.contains("La Land")}
//    print("hello world!")
    val items = listOf(1,2,3,4,5)

    println("$items")
    items.fold(0) { acc: Int, i:Int ->
        val result = acc + i
        println("result = $result")
        result
    }

    // Parameter types in a lambda are optional if they can be inferred:
    val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

    // Function references can also be used for higher-order function calls:
    val product = items.fold(1, Int::times)

    println("joinedToString = $joinedToString")
    println("product = $product")
}