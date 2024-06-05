package Funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray { // vararg é o mesmo que "..." do Java
    println(a)
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for (n in ordenar(32, 87, 1, 5, 665544, 214, 23, a = 777)) { // a = parâmetro nomeado
        print("$n ")
    }
}