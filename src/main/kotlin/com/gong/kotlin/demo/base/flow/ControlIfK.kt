package com.gong.kotlin.demo.base.flow

/**
 * Created by gong on 2017/7/19.
 */
fun main(args: Array<String>) {
    maxS(5, 6)
}

fun maxS(a: Int, b: Int) = if (a > b) {
    println("Choose $a")
    a
} else {
    println("Choose $b")
    b
}

fun maxT(a: Int, b: Int): Int {
//    var max = a
//    if (a < b) max = b

    val max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    return max
}