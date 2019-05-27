package com.ake.kotlin.learn.classes

data class User(val name: String = "", val age: Int = 0){

//    fun copy(name:String = this.name, age:Int = this.age) = User(name, age)
}

fun main() {
    val user1 = User("qingyuan", 32)
    val user2 = user1.copy("saturday")

    println(user2)

    val (name, age) = user1
    println("$name, $age years old.")
}