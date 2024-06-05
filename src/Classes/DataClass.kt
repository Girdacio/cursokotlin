package Classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val geladeira1 = Geladeira("Brastemp", 320)
    val geladeira2 = Geladeira("Brastemp", 320)

    println(geladeira1 == geladeira2) // equals não implementado, compara endereço de memória

    val televisao1 = Televisao("Samsung", 32)
    val televisao2 = Televisao("Samsung", 32)

    println(televisao1 == televisao2) // equals implementado
    println(televisao1 === televisao2)
    println(televisao1.toString())
    println(televisao2.copy(polegadas = 42))

    // destructuring em data class
    val (marca, pol) = televisao1
    println("$marca $pol")
}