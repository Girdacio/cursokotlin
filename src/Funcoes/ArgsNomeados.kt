package Funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado(a) à $chefe."
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("João", "Celso"))
    println(relacaoDeTrabalho(funcionario = "Carlos", chefe = "Antonio"))
}