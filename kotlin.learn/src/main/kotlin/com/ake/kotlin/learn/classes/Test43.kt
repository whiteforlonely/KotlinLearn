package com.ake.kotlin.learn.classes

class UniqueIdentifier(val value: Int)

typealias UserId = UniqueIdentifier
typealias ProductId = UniqueIdentifier

val firstUserId : UserId = UserId(0)

interface Store {
    fun purchase(user: UserId, product: ProductId)
}

typealias  AliasedSupplier = () -> String
interface InheritadSupplier : () -> String

fun writeAliased(supplier: AliasedSupplier) = println(supplier.invoke())
fun writeInherited(supplier: InheritadSupplier) = println(supplier.invoke())

fun main() {
    writeAliased { "hello" }
    writeInherited(object : InheritadSupplier {
        override fun invoke(): String = "Hello"
    })
}