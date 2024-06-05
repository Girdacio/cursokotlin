package OO.heranca

class Ferrari : Carro(velocidadeMaxima = 350), Esportivo {

    override var turbo: Boolean = true
        get() = field
        set(value) {}

    override fun acelerar() {
        super.alterarVelocidadeEm(if (turbo) 50 else 25)
    }

    override fun frear() {
        alterarVelocidadeEm(-25)
    }
}