package cn.isif.demo

import java.io.Console

fun main(args: Array<String>) {
    println("Halo Kotlin")
    println(sum(12, 90))
    printSum(5, 6)
    printRandomNumber()
    //定义只读变量
    val a: Int = 10 //必须初始化
    //定义可变变量
    var b: Int //默认初始值 0
    println("The max number is ${maxOf(10, 25)}")
    println(parseInt("20"))
    println(getStringLength("123"))

    //for
    val items = listOf("Java", "Kotlin", "Scale")
    for (name in items) {
        println(name)
    }

    println(describe("a"))

    // in
    println(include(11100))
    println("Java" in items)
    for (i in 1..10) {
        println(i)
    }

    println("-----------------")

    for (i in 1..9 step 2) {
        println(i)
    }

    println("-----------------")

    for (i in 9 downTo 0 step 3) {
        println(i)
    }

    println("-----------------")
    when {
        "Java" in items -> println("include Java")
        "Apple" in items -> println("include Apple")
        "Kotlin" in items -> println("include Kotlin")
    }

    //lambda
    val fruits = listOf("banana", "avocado", "apple", "kiwi", "pear")
    fruits.filter { it.startsWith("a") }.sortedBy { it }.map { it.toUpperCase() }.forEach { println(it) }

    //map
    val map = mapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4)
    //访问map
    println(map["a"])
    //遍历map
    for ((k, v) in map) {
        println("$k - $v")
    }

    var name:String? = null //定义可为空的变量
    println(name?.length ?:"empty")

    testBasicType()


}

//带返回值函数 或者 fun sum(a:Int,b:Int) = a+b
fun sum(a: Int, b: Int): Int {
    return a + b
}

//无返回值函数 或者 省略":Unit"
fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

//参数默认值函数
fun printRandomNumber(a: Int = 10) {
    println("The Random number is $a")
}

//可以返回为空的返回值函数
fun parseInt(num: String): Int? {
    return num.toIntOrNull()
}

//if
fun maxOf(x: Int, y: Int): Int {
    // or return if(x>y) x else y
//    if ( x > y ) {
//        return x
//    }else{
//        return y
//    }
    return if (x > y) x else y
}

//keyword is
fun getStringLength(str: String): Int? {
    if (str is String && str.isNotEmpty()) {
        return str.length
    }
    return null
}

//keyword when
fun describe(obj: Any): String =
    when (obj) {
        1 -> "one"
        is Long -> "Long"
        !is String -> "Not is String"
        else -> "unknown"
    }

//keyword in
fun include(num: Int): Boolean {
    return num in 1..1000
}