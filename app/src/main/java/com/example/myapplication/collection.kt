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

fun ContohMap(){
    println()
    println("=== Map ===")

    //map read only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //map mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    //add data dlm map mutable
    shape["Rectangle"] = 4
    println(shape)

    //delete data dr map mutable
    shape.remove("Circle")
    println(shape)

    //mengubah data dlm map mutable
    shape["Square"] = 5
    println(shape)

    //map read only
    val shapeLocked: Map<String, Int> = shape
    println(shapeLocked)
}

fun main(){
    ContohList()
    ContohSet()
    ContohMap()
}