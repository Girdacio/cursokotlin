package Classes

class Pessoa1(var nome: String)     // variável global

class Pessoa2(val nome: String)     // constante global

class Pessoa3(nomeInicial: String) { // variável local
    val nome: String = nomeInicial
}

fun main(args: Array<String>) {
    val p1 = Pessoa1(nome = "João")
    p1.nome = "guilherme"
    println("${p1.nome} sabe programar")

    val p2 = Pessoa2("Maria")
    val p3 = Pessoa3(nomeInicial = "Pedro")
    println("${p2.nome} e ${p3.nome} são legais")
}

