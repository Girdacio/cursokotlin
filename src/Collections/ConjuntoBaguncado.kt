package Collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', "Texto", true, 3.14)

    conjunto.add(3).print()
    conjunto.add(10).print()
    conjunto.size.print()
    conjunto.remove("a").print()
    conjunto.remove('a').print()
    conjunto.contains('a').print()
    conjunto.contains("texto").print()
    conjunto.contains("Texto").print()

    for (it in conjunto)
        it.print()

    val nums = setOf(1, 2, 3)
    // nums.add(4)
    (conjunto + nums).print()
    (conjunto - nums).print()

    conjunto.intersect(nums).print() // não muda os conjuntos
    conjunto.retainAll(nums)         // muda o conjunto
    conjunto.print()

    conjunto.clear()
    conjunto.isEmpty().print()
}