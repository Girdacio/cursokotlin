package Funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val produtoA = Produto("Ipad", 2349.00)
    val produtoB = Produto(preco = 3.49, nome = "Borracha")

    println(produtoA maisCaroQue produtoB)
    println(produtoA.maisCaroQue(produtoB))
}