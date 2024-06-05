package Collections

data class Fruta(var nome: String, var preco: Double)

fun main(args: Array<String>) {
    var frutas = arrayListOf(
            Fruta("Banana", 5.5),
            Fruta("Manga", 4.5),
            Fruta("Morango", 4.5)
    )

    for (fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    println(frutas.contains(Fruta("Banana", 5.5)))
    println(frutas.distinctBy { it.preco })
}