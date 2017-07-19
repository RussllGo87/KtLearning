package com.gong.kotlin.demo.base.types

/**
 * Created by gong on 2017/7/18.
 */
fun main(args: Array<String>) {
    val a: Int = 1000
    println(a === a) // deprecated "true"
    val b:Int? = 1000
    // Identity equality for arguments of types Int and Int? can be unstable because of implicit boxing
    println(a === b)

    val c:Int? = 1000
    println(c === b) // 不同的对象

    val boxedA: Int? = c
    val anotherBoxedA: Int? = c

    println(boxedA === anotherBoxedA) // 同意对象


//    val dByte:Byte = 21
//    val eInt:Int = d
//    val dInt: Int = 21
//    val eByte: Byte = dInt
//    println(dInt == eByte)

    val dInt: Int = 21
    val eByte: Byte = dInt.toByte()

    val eAnotherByte: Byte = 21
    val dAnotherInt: Int = eAnotherByte.toInt()
}