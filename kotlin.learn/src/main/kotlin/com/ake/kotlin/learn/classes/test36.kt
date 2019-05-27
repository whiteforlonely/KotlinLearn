package com.ake.kotlin.learn.classes

sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val el: Expr, val e2: Expr) : Expr()
object NotNumber : Expr()

fun eval(expr: Expr) :Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.el) + eval(expr.e2)
    NotNumber -> Double.NaN
}
fun main() {
    val result = eval(Sum(Const(1.0),Const(2.0)))
    println(result) // 3.0
}