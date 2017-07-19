package com.gong.kotlin.demo.base.flow

/**
 * Created by gong on 2017/7/19.
 */
fun main(args: Array<String>) {
    testWhen(10)
}

fun testWhen(x: Any) = when(x) {
    0,1 -> print("x == 0 or x == 1")
    is String -> {
        println("x = [${x}]")}
    in 0..100 -> {
        println("0..100 contains $x")}
    else -> {
        println("do nothing")
    }
}