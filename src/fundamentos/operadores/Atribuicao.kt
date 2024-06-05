package fundamentos.operadores

fun main(args: Array<String>) {
    var a: Int = 7
    var b: Int = 3

    b += a  // b = b + a  add
    b -= 4  // b = b - 4  sub
    b *= 2  // b = b * 2  mul
    b /= 2  // b = b / 2  div
    b %= 2  // b = b % 2  mod

    println(b)
}