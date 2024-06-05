package Collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(12345678932, "João")
    map.put(98765432145, "Maria")
    map.put(65498732165, "Pedro")

    map.put(65498732165, "Pedro Jr")

    for (par in map)
        println(par)

    for (par in map.entries)
        println(par)

    for (nomes in map.values)
        println(nomes)

    for (cpf in map.keys)
        println(cpf)

    for ((cpf, nome) in map)
        println("$nome - CPF: $cpf")

    map.size.print()
    map.get(98765432145)?.print()
    map[98765432145]?.print()
    map.contains(98765432145).print()
    map.remove(98765432145)?.print()
    map.clear()
    map.isEmpty().print()
}