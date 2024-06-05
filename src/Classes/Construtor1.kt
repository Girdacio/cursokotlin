package Classes

class Filme {
    val nome: String // constante de instancia
    val anoLancamento: Int
    val genero: String

    // forma parecida com Java
    constructor(nome: String, anoLancamento: Int, genero: String = "Drama") {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme("O poderoso chefão", 1972)
    println("O ${filme.genero} ${filme.nome} foi lançado em ${filme.anoLancamento}.")
}