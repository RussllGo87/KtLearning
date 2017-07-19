package com.gong.kotlin.demo

/**
 * Created by gong on 2017/7/18.
 */
fun main(args: Array<String>) {
//    println("sum of 3 and 5")
//    println(sum(3, 5))

//    printSum(5 , 8)

//    val a:Int = 6
//    val b = 3
//    val c:Int
//    c = 8
//    println("a = $a b = $b c = $c")
//
//    var d = 6
//    println("d = $d")
//    d = 20
//    println("d = $d")

    var a = 5
    val s1 = "a is $a"
    println(s1)

    a = 6
    println("${s1.replace("is", "was")} , but now is $a")

}

//fun sum(a:Int, b:Int) : Int {
//    return a + b
//}

fun sum(a:Int, b:Int) = a + b

fun printSum(a:Int, b:Int) {
    println(" $a + $b = ${a + b}")
}

fun maxOf(a:Int, b:Int) : Int {
    if(a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a:Int, b:Int) = if (a > b) a else b