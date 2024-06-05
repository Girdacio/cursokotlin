package Funcoes

/*
 Void do Java = Unit do Kotlin
 */

fun imprimirMaior(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun imprimirMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

fun imprimirMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

fun imprimirMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun imprimirMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimirMaior(2, 1)
    imprimirMaior2(2, 1)
    imprimirMaior3(2, 1)
    imprimirMaior4(2, 1)
    imprimirMaior5(2, 1)
}