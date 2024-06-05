package fundamentos

fun main(args: Array<String>) {

    // Tipos numéricos inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807 // Long.MAX_VALUE

    // Tipos numéricos reais (ponto-flutuante)
    val num5: Float = 3.14F   // mesmo tamanho do Int  (deve ter o F para dizer que é Float, pois por padrão será Double
    val num6: Double = 3.14   // mesmo tamanho do Long

    // Tipo caractere
    val char: Char = '?' // outros exemplos... '1', 'g', ' '

    // Tipo booleano
    val boolean: Boolean = true // ou false. 1 ou 0 dá erro

    println(listOf(num1, num2, num3, num4, num5, num6))

    println(2 is Int)
    println(2147483648 is Long)
    println(1.0 is Double)

    // Tudo é objeto
    println(10.dec())
}