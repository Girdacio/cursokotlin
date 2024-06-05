package OO.encapsulamento

private val dentroDoArquivo = 1
// protected val protegidoNaoSuportadoAqui = 1
internal val dentroDoProjeto = 1
val public = 1

private fun dentroDoArquivo() = 1
// protected val protegidoNaoSuportadoAqui() = 1
internal fun dentroDoProjeto() = 1
fun publico() = 1

// class Capsula { // fechada para herança
open class Capsula {    // aberta para herança
    private val dentroDoObjeto = 1
    protected val vaiPorHerancao = 1
    internal val dentroDoProjeto = 1
    val publico = 1

    private fun dentroDoObjeto() = 1
    protected fun vaiPorHerancao() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() = 1
}

class CapsulaFilha : Capsula() {
    fun verificarAcesso() {
        // println(Capsula().dentroDoObjeto)
        // println(Capsula().vaiPorHeranca)
        println(vaiPorHerancao)
        println(dentroDoProjeto)
        println(publico)
    }
}

fun verificarAcesso() {
    //println(Capsula().dentroDoObjeto())
    // println(Capsula().vaiPorHeranca())
    println(Capsula().dentroDoProjeto())
    println(Capsula().publico())
}