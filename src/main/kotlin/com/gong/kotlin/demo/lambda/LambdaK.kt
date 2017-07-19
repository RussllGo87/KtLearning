package com.gong.kotlin.demo.lambda

/**
 * Created by gong on 2017/7/19.
 */
fun main(args: Array<String>) {
    val x = double(2)
    val y = 4 binPower -5
    println(y)

    val z = "hello"
    println(tripT(z))

    println(reformat(z))
    println(reformat(z, wordSeparator = '_'))
    println(reformat(z, divideByCamelHumps = true,wordSeparator = '_'))

    val list = asList(8,9,10,11,"abc", 3.1496, true, {m: Int, n: Double -> Double}, fun(w:Double){})
    list.forEach {
        print("\t $it")
    }
}

fun double(x: Int): Int {
    return 2*x
}

//infix fun Int.binPower(x: Int): Double {
//    return this * Math.pow(2.0, x.toDouble())
//}

infix fun Int.binPower(x: Int) = this * Math.pow(2.0, x.toDouble())

fun tripT( y: String, x: Int = 8): String {
    return y.repeat(x)
}

fun tripN(y: String, x: Int = 4) = y.repeat(x)

fun reformat(str: String, normalizeCase: Boolean = true, upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false, wordSeparator: Char = ' ') = str.replace("l", wordSeparator.toString())

fun asList(vararg ts: Any, size: Int = 10): List<Any> {
    val result = ArrayList<Any>()
    ts.forEach {
        if(result.size > size) {
            return result
        }
        result.add(it)
    }
    return result
}