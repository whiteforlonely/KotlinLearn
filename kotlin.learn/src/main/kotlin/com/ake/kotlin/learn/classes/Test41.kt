package com.ake.kotlin.learn.classes

import java.lang.StringBuilder
import javax.swing.tree.TreeNode

inline fun <reified T> TreeNode.findParentOfType(): T? {
    var p = parent
    while (p != null && p !is T) {
        p = p.parent
    }

    return p as T?
}

inline fun <reified T> membersOf() = T::class.members

fun main() {
    println(membersOf<StringBuilder>().joinToString { "\n" })
}