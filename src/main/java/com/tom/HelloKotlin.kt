package com.tom

class HelloKotlin {
}

fun main(args: Array<String>){
   // println("Hello Kotlin!");
    //Human().hello()
    val h = Human()
    h.hello()
}

class Human {
    fun hello() {
        println("Hello kotlin!");
    }

}