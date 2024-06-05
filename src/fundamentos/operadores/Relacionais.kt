package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0) // 1 jan 1970
    val d2 = Date(0)

    println("Resultado com '===' ${d1 === d2}") // igualdade referencial
    println("Resultado com '==' ${d1 == d2}")   // igualdade estrutural
}