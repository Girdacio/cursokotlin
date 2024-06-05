package Classes

class Cliente2 {
    constructor(nome: String) {
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main(args: Array<String>) {
    val cliente = Cliente2("")
    println(cliente.nome)

    val cliente2 = Cliente2("Pedro")
    println(cliente2.nome)
}