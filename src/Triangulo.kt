class Triangulo(
    private val base: Double,
    private val altura: Double,
    private val lados: Double,
    nombre: String,
    color: String
) : Figura(nombre, color) {
    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro(): Double {
        return lados * 3
    }
}