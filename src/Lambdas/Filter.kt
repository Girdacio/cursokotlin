package Lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(
            Aluno("Pedro", 7.4),
            Aluno("Artur", 8.0),
            Aluno("Carlos", 9.7),
            Aluno("João", 5.7)
    )

    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { -it.nota }

    println(aprovados)
}