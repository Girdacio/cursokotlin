package Collections

fun main(args: Array<String>) {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    // aprovados.add(1)

    println("Sem ordem...")
    for (aprovado in aprovados)
        aprovado.print()

    val aprovadosNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("\nLinked...")
    for (aprovado in aprovadosNaOrdem1)
        aprovado.print()

    val aprovadosNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("\nSorted...")
    for (aprovado in aprovadosNaOrdem2)
        aprovado.print()

    // ordem maluca...
    println("\nOrdem personalizada...")
    aprovados.sortedBy { it.substring(it.length -1, it.length) }.print()
}