package com.example.myapplication

fun ContohList(){
    println("=== List ===")
    //List Read Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Add Data in List Mutable
    shape.add("Circle")
    println(shape)

    //hapus data list mutable
    shape.remove("Triangle")
    println(shape)

    //mengubah data dlm list mutable
    shape[0] = "Oval"
    println(shape)

    //list read-only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

fun ContohSet(){
    println("=== Set ===")
    //Set Read Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //add data set mutable
    shape.add("Rectangle")
    println(shape)

    //hapus data set mutable
    shape.remove("Circle")
    println(shape)

    //set read only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

