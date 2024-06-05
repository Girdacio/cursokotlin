package fundamentos.controles

fun main(args: Array<String>) {

    /** Não usar essa lógica !!! GOTO */
    externo@for (i in 1..15) {
        for (j in 1..15) {
            if (i == 2 && j == 9) {
                break@externo
            }
            println("Atual: $i $j")
        }
    }
    println("Fim")
}