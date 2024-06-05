package Collections

fun main(args: Array<String>) {
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("Rafagel", "Pedro", "Leandro", "Gustavo")
    val uniao = numeros + strings // sobrecarga de operadores

    println(uniao)
}