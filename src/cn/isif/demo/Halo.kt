package cn.isif.demo

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

//is
fun maxOf(x: Int, y: Int): Int {
    // or return if(x>y) x else y
//    if ( x > y ) {
//        return x
//    }else{
//        return y
//    }
    return if (x > y) x else y
}