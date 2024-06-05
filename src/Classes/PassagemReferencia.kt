package Classes

// Erro!! Kotlin: val cannot be reassigned
//fun porReferencia(velocidade: Int) {
//    velocidade++
//}

data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

fun porReferencia(carro: Carro) {
    carro.velocidade++
}

fun main(args: Array<String>) {
    var carro = Carro("Ford", "Fusion")

    var  carro2 = carro // mesma referencia...
    carro2.modelo = "Edge"
    println(carro)

    carro = Carro("Audi", "A4")

    porReferencia(carro)
    porReferencia(carro2)

    println(carro)
    println(carro2)

    var a = 1
    var b = a
    println(a === b)
    b++
    println(a === b)
    println(a)
    println(b)
}
