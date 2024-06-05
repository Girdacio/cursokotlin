package Lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Renata", "Bernardo", "Willian", "Andreia", "Caio")
    val ordenados = nomes.sortedBy { it.reversed() }

    println(ordenados)
}