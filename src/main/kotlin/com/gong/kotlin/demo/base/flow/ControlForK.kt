package com.gong.kotlin.demo.base.flow

/**
 * Created by gong on 2017/7/19.
 */
fun main(args: Array<String>) {
    val aIntArray: IntArray = intArrayOf(2, 4, 6, 8)

    for(indice in aIntArray.indices) {
        println("indice = $indice")
    }

    for((index, value) in aIntArray.withIndex()) {
        println("array[$index] =  $value")
    }
}