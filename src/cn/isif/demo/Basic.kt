package cn.isif.demo

import java.lang.IllegalArgumentException

fun testBasicType() {
    //===判断的是地址 ==判断的是值
    val a:Int = 128
    println(a === a)
    val aa:Int ?= a
    val aaa:Int ?= a
    println(aa===aaa) //false，当a小于128时为true
    println(decimalDigitValue('9'))
    //字符串
    val text = """
        Tell me and I forget
        Teach me end I remember
     """.trimMargin(">")
    println(text)
}

fun decimalDigitValue(c:Char):Int{
    if (c !in '0'..'9'){
        throw IllegalArgumentException("out of range")
    }else{
        return c.toInt() - '0'.toInt()
    }
}