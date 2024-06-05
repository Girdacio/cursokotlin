package avancado

import Collections.print

/* minha solução */
fun fatorial(num: Int): Int {
    return if (num == 1) 1 else num * fatorial(num - 1)
}

/* solução proposta */
fun fatorialExercicio(num: Int): Int = when(num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * fatorialExercicio(num - 1)
    else -> throw IllegalArgumentException("Número negativo")
}

fun main(args: Array<String>) {
    fatorial(15).print()
    fatorial(10).print()
    fatorial(5).print()
    fatorial(4).print()
    fatorial(3).print()
    fatorial(2).print()
    fatorial(1).print()

    fatorialExercicio(10).print()
    fatorialExercicio(5).print()
    fatorialExercicio(4).print()
    fatorialExercicio(1).print()
    fatorialExercicio(0).print()
    fatorialExercicio(-1).print()
}