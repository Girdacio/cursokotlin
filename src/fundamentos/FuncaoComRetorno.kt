package fundamentos

fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun main(args: Array<String>) {
    println(soma(9, 2))
    println(soma(4))
}