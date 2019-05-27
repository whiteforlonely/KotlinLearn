package com.ake.kotlin.learn.classes

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0XFF0000),
    GREEN(0X00FF00),
    BLUE(0X0000FF)
}

/*
with their corresponding methods, as well as overriding base methods. Note that if
the enum class defines any members, you need to separate the enum constant definitions from the
member definitions with a semicolon, just like in java.
 */
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

enum class IntArithmetics: BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },

    TIMES {
        override fun apply(t: Int, u: Int): Int {
            return t * u
        }
    };

    override fun applyAsInt(left: Int, right: Int): Int {
        return apply(left, right)
    }
}

fun main() {
    val a = 31
    val b = 13
    for (f in IntArithmetics.values()) {
        /*
        this kind of println style flush my mind!
        it can print class name.
         */
        println("$f($a, $b) = ${f.apply(a, b)}")
    }
}