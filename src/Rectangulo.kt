class Rectangulo(private val altura: Double, private val base: Double, nombre: String, color: String) : Figura(nombre, color) {
    override fun area(): Double {
        return base * altura
    }

    override fun perimetro(): Double {
        return 2 * (base * altura)
    }
}