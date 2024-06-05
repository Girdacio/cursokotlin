package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (marca, modelo) = Carro("VW", "Fusca")
    println("$marca $modelo")

    val (marido, mulher) = listOf("joão", "Maria")
    println("$marido e $mulher")

    val (_,_,terceiro) = listOf("Kini", "Hamilton", "Alonso")
    println("$terceiro terminou em terceiro lugar")

    val alunos = arrayListOf("André", "Carla", "Marcos")
    for ((aluno, indice) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }
}