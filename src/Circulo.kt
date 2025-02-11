class Circulo(private val radio: Double, nombre: String, color: String) : Figura(nombre, color) {

    override fun area(): Double {
        return Math.PI * radio * radio
    }

    override fun perimetro(): Double {
        return 2 * Math.PI * radio
    }
}