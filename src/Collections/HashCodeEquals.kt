package Collections

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?): Boolean {
        if (other is Objeto) {
            return nome.equals(other.nome, ignoreCase = true)
        }

        return false
    }
}

fun main(args: Array<String>) {
    val conjunto = hashSetOf(
            Objeto("Cadeira", "..."), // hashCode = 7
            Objeto("Mesa", "..."), // hashCode = 4
            Objeto("Faca", "..."), // hashCode = 4
            Objeto("Copo", "...") // hashCode = 4
    )

    conjunto.contains(Objeto("faca", "???")).print()
    // primeiro executa o hashCode em todos os elementos do conjunto e cria um subconjunto com o hashCode igual, depois executa o equals pra ver qual é igual
}