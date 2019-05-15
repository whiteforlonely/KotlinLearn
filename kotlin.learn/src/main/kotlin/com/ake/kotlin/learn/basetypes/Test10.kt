package com.ake.kotlin.learn.basetypes

import java.lang.Float.NaN

@Suppress("DEPRECATED_IDENTITY_EQUALS")
fun main() {
    /*
    I was confusing about the reseult:
    true
    false
    and why it is that?
     */
    val zeroEq = 0.0000001 === 0.0000001
    println(zeroEq)
    val nanEq = NaN === NaN
    println(nanEq)
}