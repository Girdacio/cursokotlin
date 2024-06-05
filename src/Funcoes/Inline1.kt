package Funcoes

inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transacao")
    try {
        funcao()
    } finally {
        println("Fechando transacao")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}