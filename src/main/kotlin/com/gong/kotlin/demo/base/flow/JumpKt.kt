package com.gong.kotlin.demo.base.flow

/**
 * Created by gong on 2017/7/19.
 */
fun main(args: Array<String>) {
//   loop1@ for(i in 1..10) {
//        innerloop1@ for(j in 1..100) {
//            if(i == j) {
//                print("\t ${i * j}")
//            } else if(i > j){
//                print("\t ${i * j}")
//            } else {
//                print("\n")
//                break@innerloop1
//            }
//        }
//    }

//    loop2@ for(i in 1..10) {
//        innerloop2@ for(j in 1..100) {
//           if(j < i) {
//               print("\t ")
//           } else if(j > 10){
//               print("\n")
//               continue@loop2
//           } else {
//               print("\t ${i * j}")
//           }
//        }
//    }

    val range:List<Int> = IntRange(1, 500).filter { it -> it %  50 == 0 }
    printForEach(range)

}

fun printForEach(range: List<Int>) {
//    range.forEach lit@ {
//        if(it == 300) return@lit
//        println(it)
//    }

    range.forEach(fun(it: Int) {
        if(it == 300) return
        println(it)
    });

    println("printForEach now!")
}