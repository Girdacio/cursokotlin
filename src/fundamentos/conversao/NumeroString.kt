package fundamentos.conversao

fun main(args: Array<String>) {
    val a = 1

    // número para string
    println(a.toString() + 1)

    // string para número
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0) // Elvis operator  ?:
    println("1".toInt() + 3)
}