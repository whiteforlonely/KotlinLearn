package com.ake.kotlin.learn.other.collections.range

class Version(var major: Int, var minor: Int): Comparable<Version>{
    override fun compareTo(other: Version): Int {
        if (this.major != other.major){
            return this.major - other.major
        }else {
            return this.minor - other.minor
        }
    }

}

fun main() {
    val versionRange = Version(1, 11)..Version(1, 30)
    println(Version(1, 20) in versionRange)
    println(Version(1, 32) in versionRange)
}