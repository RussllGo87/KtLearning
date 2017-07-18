package com.gong.kotlin.demo

/**
 * Created by gong on 2017/7/18.
 */
fun main(args: Array<String>) {
    printProduct("21", null)
}

fun parseInt(str:String?) :Int?  {
    return str?.toInt()
}

fun printProduct(arg1:String?, arg2:String?) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if(x != null && y != null) {
        println("$x * $y = ${x * y}")
    } else {
        println("either $x or $y is not a number")
    }
}