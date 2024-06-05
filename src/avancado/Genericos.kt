package avancado

class Caixa<T>(val objeto: T) {
    private val objetos = ArrayList<T>()

    init {
        adicionar(objeto)
    }

    fun adicionar(novoObj: T) { objetos.add(novoObj) }

    override fun toString(): String {
        return objetos.toString()
    }
}

fun main(args: Array<String>) {
    val materialEscolar = Caixa("Caneta")
    materialEscolar.adicionar("Lápis")
    materialEscolar.adicionar("Borracha")
    println(materialEscolar)

    val numeros = Caixa(objeto = 1)
    numeros.adicionar(3)
    // numeros.adicionar("3") // gera erro
    numeros.adicionar(4)
    numeros.adicionar(5)
    println(numeros)
}