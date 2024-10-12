package com.example.myapplication

fun uppercaseString(string: String): String {
    return string.uppercase()
}

//Dapat ditulis dalam ekspresi lambda sbb :
fun main () {
    uppercaseString("hello")
    println({ string: String -> string.uppercase() }("hello"))
// HELLO
}